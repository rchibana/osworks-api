package com.chibana.algaworks.osworks.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.OffsetDateTime;

/**
 * Created by Rodrigo Chibana
 * Date: 27/04/2020
 **/

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private OffsetDateTime dataEnvio;

    @ManyToOne
    private OrdemServico ordemServico;

}
