package com.chibana.algaworks.osworks.api.model;

import com.chibana.algaworks.osworks.domain.model.StatusOrdemServico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrdemServicoModel {

    @EqualsAndHashCode.Include
    private Long id;

    private String nomeCliente;
    private String descricao;
    private BigDecimal preco;
    private StatusOrdemServico status;
    private OffsetDateTime dataAbertura;
    private OffsetDateTime dataFinalizacao;

}
