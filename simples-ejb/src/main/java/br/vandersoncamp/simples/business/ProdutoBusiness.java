package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.Produto;
import br.vandersoncamp.simples.service.ProdutoService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class ProdutoBusiness {

    @Inject
    private ProdutoService service;


    public Produto buscar(Long id) {
        return service.buscar(id);
    }

    public List<Produto> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(Produto produto) {
        service.gravar(produto);
    }

    public void atualizar(Produto produto) {
        service.atualizar(produto);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
