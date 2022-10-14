package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Serie;
import br.iesp.edu.api.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieResource {

    @Autowired
    private SerieService service;

    @PostMapping
    public Serie salvar (@RequestBody Serie serie){ return service.salvar(serie);}

    @PutMapping
    public Serie atualizar(@RequestBody Serie serie){ return service.atualizar(serie);}

    @DeleteMapping
    public void  deletar (@RequestBody Serie serie){
        service.deletar(serie.getId());
    }

    @GetMapping
    public List<Serie> listarSerie(){ return service.listarSerie();}
}
