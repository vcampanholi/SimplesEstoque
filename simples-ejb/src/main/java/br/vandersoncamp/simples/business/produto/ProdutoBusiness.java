package br.vandersoncamp.simples.business.produto;

import br.vandersoncamp.simples.model.Produto;
import br.vandersoncamp.simples.service.ProdutoService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class ProdutoBusiness {

    @Inject
    private ProdutoService service;

    @Inject
    private BeanValidation validator;


    public Produto buscar(Long id) {
        return service.buscar(id);
    }

    public List<Produto> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public Produto criar(Produto produto) {
        validator.validate(produto);
        return service.gravar(produto);
    }

    public Produto atualizar(Produto produto) {
        validator.validate(produto);
        return service.atualizar(produto);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
