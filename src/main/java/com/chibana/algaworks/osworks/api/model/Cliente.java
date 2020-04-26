package com.chibana.algaworks.osworks.api.model;

import lombok.Data;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/

@Data
public class Cliente {

    private Long id;
    private String nome;
    private String email;
    private String telefone;

}
