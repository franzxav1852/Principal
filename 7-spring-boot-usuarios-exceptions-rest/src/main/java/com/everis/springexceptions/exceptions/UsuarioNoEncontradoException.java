package com.everis.springexceptions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4757744790128914302L;

	public UsuarioNoEncontradoException(String mensaje) {
		// TODO Auto-generated constructor stub
		super(mensaje);
	}

	
}
