package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.FormaDePagamento;
import br.iesp.edu.api.repository.FormaDePagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaDePagamentoService {

    @Autowired
    private FormaDePagamentoRepository repository;

    public FormaDePagamento salvar(FormaDePagamento formaDePagamento){
        formaDePagamento = repository.save(formaDePagamento);
        return formaDePagamento;
    }

    public  FormaDePagamento autualizar(FormaDePagamento formaDePagamento) {
        if (formaDePagamento.getId() == null) {
            throw new RuntimeException("ID nulo!");
        }
        formaDePagamento = repository.save(formaDePagamento);
        return formaDePagamento;
    }

    public FormaDePagamento deletar(Integer id){repository.deleteById(id);
        return null;
    }

    public List<FormaDePagamento> listarFormaPagamento(){return repository.findAll();}
}
