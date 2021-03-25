package com.myhouse.orderweb.services.exceptions;

public class ResourceNotFondException extends RuntimeException {

    //private final static long serialVersionUID = 1L;

    public ResourceNotFondException(Object id) {
        super("Resource not found. Id " + id);
    }

}
