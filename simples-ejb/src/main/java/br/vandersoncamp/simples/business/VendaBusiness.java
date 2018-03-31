package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.Venda;
import br.vandersoncamp.simples.service.VendaService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class VendaBusiness {

    @Inject
    private VendaService service;


    public Venda buscar(Long id) {
        return service.buscar(id);
    }

    public List<Venda> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(Venda venda) {
        service.gravar(venda);
    }

    public void atualizar(Venda venda) {
        service.atualizar(venda);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
