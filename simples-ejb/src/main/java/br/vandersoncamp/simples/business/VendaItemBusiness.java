package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.VendaItem;
import br.vandersoncamp.simples.service.VendaItemService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class VendaItemBusiness {

    @Inject
    private VendaItemService service;


    public VendaItem buscar(Long id) {
        return service.buscar(id);
    }

    public List<VendaItem> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(VendaItem vendaItem) {
        service.gravar(vendaItem);
    }

    public void atualizar(VendaItem vendaItem) {
        service.atualizar(vendaItem);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
