package br.vandersoncamp.simples.business.entrada;

import br.vandersoncamp.simples.model.Entrada;
import br.vandersoncamp.simples.service.EntradaService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class EntradaBusiness {

    @Inject
    private EntradaService service;

    @Inject
    private BeanValidation validator;


    public Entrada buscar(Long id) {
        return service.buscar(id);
    }

    public List<Entrada> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public Entrada criar(Entrada entrada) {
        validator.validate(entrada);
        return service.gravar(entrada);
    }

    public Entrada atualizar(Entrada entrada) {
        validator.validate(entrada);
        return service.atualizar(entrada);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
