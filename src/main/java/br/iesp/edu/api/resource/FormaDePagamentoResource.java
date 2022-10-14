package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.FormaDePagamento;
import br.iesp.edu.api.service.FormaDePagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("formaDePagamento")
public class FormaDePagamentoResource {

    @Autowired
    private FormaDePagamentoService service;

    @PostMapping
    public FormaDePagamento salvar(@RequestBody FormaDePagamento formaDePagamento){return service.salvar(formaDePagamento);}

    @PutMapping
    public FormaDePagamento atualizar(@RequestBody FormaDePagamento formaDePagamento){return service.autualizar(formaDePagamento);}

    @DeleteMapping
    public FormaDePagamento deletar(@RequestBody FormaDePagamento formaDePagamento){return service.deletar(formaDePagamento.getId());}

    @GetMapping
    public List<FormaDePagamento> listarFormaDePagamento(){return service.listarFormaPagamento();}
}

