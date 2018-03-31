package br.vandersoncamp.simples.business;

import br.vandersoncamp.simples.model.Saida;
import br.vandersoncamp.simples.service.SaidaService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class SaidaBusiness {

    @Inject
    private SaidaService service;


    public Saida buscar(Long id) {
        return service.buscar(id);
    }

    public List<Saida> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public void criar(Saida saida) {
        service.gravar(saida);
    }

    public void atualizar(Saida saida) {
        service.atualizar(saida);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
