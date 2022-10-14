package br.iesp.edu.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class FormaDePagamento {

    @Id
    @GeneratedValue
    private Integer id;
    private String descricao;
    private int valor;
    private Date data;
}
