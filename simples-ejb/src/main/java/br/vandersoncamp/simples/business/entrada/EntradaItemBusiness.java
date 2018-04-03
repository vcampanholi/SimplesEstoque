package br.vandersoncamp.simples.business.entrada;

import br.vandersoncamp.simples.model.EntradaItem;
import br.vandersoncamp.simples.service.EntradaItemService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class EntradaItemBusiness {

    @Inject
    private EntradaItemService service;

    @Inject
    private BeanValidation validator;


    public EntradaItem buscar(Long id) {
        return service.buscar(id);
    }

    public List<EntradaItem> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public EntradaItem criar(EntradaItem entradaItem) {
        validator.validate(entradaItem);
        return service.gravar(entradaItem);
    }

    public EntradaItem atualizar(EntradaItem entradaItem) {
        validator.validate(entradaItem);
        return service.atualizar(entradaItem);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
