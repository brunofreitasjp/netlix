package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.FormaDePagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaDePagamentoRepository extends JpaRepository <FormaDePagamento, Integer> {
}
