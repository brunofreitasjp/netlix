package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Favoritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoritosRepository extends JpaRepository <Favoritos, Integer>{

}
