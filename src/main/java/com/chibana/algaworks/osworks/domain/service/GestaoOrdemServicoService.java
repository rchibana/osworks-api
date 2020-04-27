package com.chibana.algaworks.osworks.domain.service;

import com.chibana.algaworks.osworks.domain.exception.NegocioException;
import com.chibana.algaworks.osworks.domain.model.Cliente;
import com.chibana.algaworks.osworks.domain.model.OrdemServico;
import com.chibana.algaworks.osworks.domain.model.StatusOrdemServico;
import com.chibana.algaworks.osworks.domain.repository.ClienteRepository;
import com.chibana.algaworks.osworks.domain.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/
@Service
public class GestaoOrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public OrdemServico criar(OrdemServico ordemServico) {

        final Cliente cliente = clienteRepository.findById(ordemServico.getCliente().getId())
                .orElseThrow(() -> new NegocioException("Cliente não encontrado"));

        ordemServico.setCliente(cliente);
        ordemServico.setStatus(StatusOrdemServico.ABERTA);
        ordemServico.setDataAbertura(OffsetDateTime.now());

        return ordemServicoRepository.save(ordemServico);
    }

}
