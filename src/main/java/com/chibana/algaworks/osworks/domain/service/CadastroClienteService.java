package com.chibana.algaworks.osworks.domain.service;

import com.chibana.algaworks.osworks.domain.exception.NegocioException;
import com.chibana.algaworks.osworks.domain.model.Cliente;
import com.chibana.algaworks.osworks.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/
@Service
public class CadastroClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(final Cliente cliente) {

        final Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());

        if(clienteExistente != null && !clienteExistente.equals(cliente)) {
            throw new NegocioException("Já existe um cliente cadastrado com este e-mail");
        }


        return clienteRepository.save(cliente);
    }

    public void excluir(Long clienteId) {
        clienteRepository.deleteById(clienteId);
    }

}
