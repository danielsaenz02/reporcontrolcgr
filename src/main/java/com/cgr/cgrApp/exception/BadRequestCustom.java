package com.cgr.cgrApp.exception;

public class BadRequestCustom extends Exception{

    public BadRequestCustom(String mensaje){
        super(mensaje);
    }
}
