package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.EntradaItem;
import br.vandersoncamp.simples.service.EntradaItemService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class EntradaItemBusiness {

    @Inject
    private EntradaItemService service;


    public EntradaItem buscar(Long id) {
        return service.buscar(id);
    }

    public List<EntradaItem> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(EntradaItem entradaItem) {
        service.gravar(entradaItem);
    }

    public void atualizar(EntradaItem entradaItem) {
        service.atualizar(entradaItem);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
