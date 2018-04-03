package br.vandersoncamp.simples.business.saida;

import br.vandersoncamp.simples.model.Saida;
import br.vandersoncamp.simples.service.SaidaService;
import br.vandersoncamp.simples.util.BeanValidation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class SaidaBusiness {

    @Inject
    private SaidaService service;

    @Inject
    private BeanValidation validator;


    public Saida buscar(Long id) {
        return service.buscar(id);
    }

    public List<Saida> pesquisar(String filterField, String filterData, String order) {
        return service.pesquisar(filterField, filterData, order);
    }

    public Saida criar(Saida saida) {
        validator.validate(saida);
        return service.gravar(saida);
    }

    public Saida atualizar(Saida saida) {
        validator.validate(saida);
        return service.atualizar(saida);
    }

    public void excluir(Long id) {
        service.excluir(id);
    }
}
