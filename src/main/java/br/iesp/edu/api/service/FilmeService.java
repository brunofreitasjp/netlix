package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Filme;
import br.iesp.edu.api.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public Filme salvar(Filme filme){
        filme = repository.save(filme);
        return filme;
    }

    public Filme atualizar(Filme filme){
        if (filme.getId()==null){
            throw new RuntimeException("ID Nulo !");
        }
        filme = repository.save(filme);
        return filme;
    }


    public void deletar(Integer id){
        repository.deleteById(id);
    }
    public List<Filme> listarFilmes(){
        return repository.findAll();
    }
}
