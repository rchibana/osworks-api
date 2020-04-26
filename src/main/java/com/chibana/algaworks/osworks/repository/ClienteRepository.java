package com.chibana.algaworks.osworks.repository;

import com.chibana.algaworks.osworks.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
