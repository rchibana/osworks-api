package com.chibana.algaworks.osworks.domain.exception;

/**
 * Created by Rodrigo Chibana
 * Date: 26/04/2020
 **/
public class NegocioException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NegocioException(String message) {
        super(message);
    }

}
