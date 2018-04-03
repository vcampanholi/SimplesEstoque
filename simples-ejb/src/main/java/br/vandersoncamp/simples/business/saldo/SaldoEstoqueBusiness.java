package br.vandersoncamp.simples.business.saldo;

import br.vandersoncamp.simples.model.SaldoEstoque;
import br.vandersoncamp.simples.service.SaldoEstoqueService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class SaldoEstoqueBusiness {

    @Inject
    private SaldoEstoqueService service;

    @Inject
    private BeanValidation validator;


    public SaldoEstoque buscar(Long id) {
        return service.buscar(id);
    }

    public List<SaldoEstoque> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(SaldoEstoque saldo) {
        validator.validate(saldo);
        service.gravar(saldo);
    }

    public void atualizar(SaldoEstoque saldo) {
        validator.validate(saldo);
        service.atualizar(saldo);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
