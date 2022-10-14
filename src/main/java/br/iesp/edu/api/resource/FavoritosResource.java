package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Favoritos;
import br.iesp.edu.api.service.FavoritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favoritos")
public class FavoritosResource {

    @Autowired
    private FavoritosService service;

    @PostMapping
    public Favoritos salvar (@RequestBody Favoritos favoritos) {return service.salvar(favoritos);}

    @PutMapping
    public Favoritos atualizar(@RequestBody Favoritos favoritos) {return service.atualizar(favoritos);}

    @DeleteMapping
    public void deletar(@RequestBody Favoritos favoritos){
        service.deletar(favoritos.getId());
    }

    @GetMapping
    public List<Favoritos> listarFavoritos(){return  service.listarFavoritos();}

}
