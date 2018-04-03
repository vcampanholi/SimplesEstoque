package br.vandersoncamp.simples.business.movimento;

import br.vandersoncamp.simples.model.MovimentoEstoque;
import br.vandersoncamp.simples.service.MovimentoEstoqueService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class MovimentoEstoqueBusiness {

    @Inject
    private MovimentoEstoqueService service;

    @Inject
    private BeanValidation validator;


    public MovimentoEstoque buscar(Long id) {
        return service.buscar(id);
    }

    public List<MovimentoEstoque> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(MovimentoEstoque movimentoEstoque) {
        validator.validate(movimentoEstoque);
        service.gravar(movimentoEstoque);
    }

    public void atualizar(MovimentoEstoque movimentoEstoque) {
        validator.validate(movimentoEstoque);
        service.atualizar(movimentoEstoque);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
