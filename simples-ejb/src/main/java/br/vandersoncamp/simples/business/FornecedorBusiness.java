package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.Fornecedor;
import br.vandersoncamp.simples.service.FornecedorService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class FornecedorBusiness {

    @Inject
    private FornecedorService service;


    public Fornecedor buscar(Long id) {
        return service.buscar(id);
    }

    public List<Fornecedor> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(Fornecedor fornecedor) {

        service.gravar(fornecedor);
    }

    public void atualizar(Fornecedor fornecedor) {
        service.atualizar(fornecedor);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
