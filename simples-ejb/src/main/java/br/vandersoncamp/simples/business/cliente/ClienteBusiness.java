package br.vandersoncamp.simples.business.cliente;

import br.vandersoncamp.simples.model.Cliente;
import br.vandersoncamp.simples.service.ClienteService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class ClienteBusiness {

    @Inject
    private ClienteService service;

    @Inject
    private BeanValidation validator;


    public Cliente buscar(Long id) {
        return service.buscar(id);
    }

    public List<Cliente> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public Cliente criar(Cliente cliente) {
        validator.validate(cliente);
        return service.gravar(cliente);
    }

    public Cliente atualizar(Cliente cliente) {
        validator.validate(cliente);
        return service.atualizar(cliente);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
