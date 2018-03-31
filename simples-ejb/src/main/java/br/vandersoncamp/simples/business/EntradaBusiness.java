package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.Entrada;
import br.vandersoncamp.simples.service.EntradaService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class EntradaBusiness {

    @Inject
    private EntradaService service;


    public Entrada buscar(Long id) {
        return service.buscar(id);
    }

    public List<Entrada> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(Entrada entrada) {
        service.gravar(entrada);
    }

    public void atualizar(Entrada entrada) {
        service.atualizar(entrada);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
