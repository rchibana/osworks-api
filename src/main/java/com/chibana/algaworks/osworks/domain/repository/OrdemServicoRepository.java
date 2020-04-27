package com.chibana.algaworks.osworks.domain.repository;

import com.chibana.algaworks.osworks.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/
@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {

}
