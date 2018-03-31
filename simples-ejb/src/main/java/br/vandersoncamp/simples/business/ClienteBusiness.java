package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.Cliente;
import br.vandersoncamp.simples.service.ClienteService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class ClienteBusiness {

    @Inject
    private ClienteService service;


    public Cliente buscar(Long id) {
        return service.buscar(id);
    }

    public List<Cliente> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(Cliente cliente) {
        service.gravar(cliente);
    }

    public void atualizar(Cliente cliente) {
        service.atualizar(cliente);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
