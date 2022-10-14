package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Favoritos;
import br.iesp.edu.api.repository.FavoritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository repository;

    public Favoritos salvar(Favoritos favoritos){
        favoritos = repository.save(favoritos);
        return favoritos;
    }

    public Favoritos atualizar(Favoritos favoritos){
        if (favoritos.getId()==null){
            throw new RuntimeException("ID nulo!!");
        }

        favoritos = repository.save(favoritos);
        return favoritos;
    }

    public void deletar(Integer id) {repository.deleteById(id);}

    public List<Favoritos> listarFavoritos(){ return repository.findAll();}

}
