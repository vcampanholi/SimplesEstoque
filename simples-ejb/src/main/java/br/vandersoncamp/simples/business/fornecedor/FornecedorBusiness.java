package br.vandersoncamp.simples.business.fornecedor;

import br.vandersoncamp.simples.model.Fornecedor;
import br.vandersoncamp.simples.service.FornecedorService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class FornecedorBusiness {

    @Inject
    private FornecedorService service;

    @Inject
    private BeanValidation validator;

    public Fornecedor buscar(Long id) {
        return service.buscar(id);
    }

    public List<Fornecedor> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public Fornecedor criar(Fornecedor fornecedor) {
        validator.validate(fornecedor);
        return service.gravar(fornecedor);
    }

    public Fornecedor atualizar(Fornecedor fornecedor) {
        validator.validate(fornecedor);
        return service.atualizar(fornecedor);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
