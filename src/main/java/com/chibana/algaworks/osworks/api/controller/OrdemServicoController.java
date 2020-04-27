package com.chibana.algaworks.osworks.api.controller;

import com.chibana.algaworks.osworks.domain.model.OrdemServico;
import com.chibana.algaworks.osworks.domain.repository.OrdemServicoRepository;
import com.chibana.algaworks.osworks.domain.service.GestaoOrdemServicoService;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/
@RestController
@RequestMapping("/ordens-servico")
@AllArgsConstructor
public class OrdemServicoController {

    private GestaoOrdemServicoService gestaoOrdemServicoService;
    private OrdemServicoRepository ordemServicoRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrdemServico criar(@Valid @RequestBody OrdemServico ordemServico) {
        return gestaoOrdemServicoService.criar(ordemServico);
    }

    @GetMapping
    public List<OrdemServico> listar() {
        return ordemServicoRepository.findAll();
    }

    @GetMapping("/{ordensServicoId")
    public ResponseEntity<OrdemServico> buscar(@PathVariable Long ordensServicoId) {
        Optional<OrdemServico> ordemServico = ordemServicoRepository.findById(ordensServicoId);

        if(ordemServico.isPresent()) {
            return ResponseEntity.ok(ordemServico.get());
        }

        return ResponseEntity.notFound().build();

    }

}
