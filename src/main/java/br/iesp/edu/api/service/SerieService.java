package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Serie;
import br.iesp.edu.api.repository.SerieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    private SerieRepository repository;

    public Serie salvar(Serie serie) {
        serie = repository.save(serie);
        return serie;
    }

    public Serie atualizar(Serie serie) {
        if (serie.getId() == null) {
            throw new RuntimeException("ID Nulo !");
        }
        serie = repository.save(serie);
        return serie;
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public List<Serie> listarSerie(){ return repository.findAll();}
}
