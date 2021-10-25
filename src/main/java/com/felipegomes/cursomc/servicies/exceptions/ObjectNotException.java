package com.felipegomes.cursomc.servicies.exceptions;

public class ObjectNotException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotException(String msg) {
		super(msg);
	}
	
	public ObjectNotException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
