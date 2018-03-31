package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.SaidaItem;
import br.vandersoncamp.simples.service.SaidaItemService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class SaidaItemBusiness {

    @Inject
    private SaidaItemService service;


    public SaidaItem buscar(Long id) {
        return service.buscar(id);
    }

    public List<SaidaItem> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(SaidaItem saidaItem) {
        service.gravar(saidaItem);
    }

    public void atualizar(SaidaItem saidaItem) {
        service.atualizar(saidaItem);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
