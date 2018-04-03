package br.vandersoncamp.simples.business.saida;

import br.vandersoncamp.simples.model.SaidaItem;
import br.vandersoncamp.simples.service.SaidaItemService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class SaidaItemBusiness {

    @Inject
    private SaidaItemService service;

    @Inject
    private BeanValidation validator;

    public SaidaItem buscar(Long id) {
        return service.buscar(id);
    }

    public List<SaidaItem> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public SaidaItem criar(SaidaItem saidaItem) {
        validator.validate(saidaItem);
        return service.gravar(saidaItem);
    }

    public SaidaItem atualizar(SaidaItem saidaItem) {
        validator.validate(saidaItem);
        return service.atualizar(saidaItem);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
