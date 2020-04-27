package com.chibana.algaworks.osworks.api.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Campo {

    private String nome;
    private String mensagem;

}
