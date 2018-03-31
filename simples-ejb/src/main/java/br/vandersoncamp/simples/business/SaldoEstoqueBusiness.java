package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.SaldoEstoque;
import br.vandersoncamp.simples.service.SaldoEstoqueService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class SaldoEstoqueBusiness {

    @Inject
    private SaldoEstoqueService service;


    public SaldoEstoque buscar(Long id) {
        return service.buscar(id);
    }

    public List<SaldoEstoque> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(SaldoEstoque saldo) {
        service.gravar(saldo);
    }

    public void atualizar(SaldoEstoque saldo) {
        service.atualizar(saldo);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
