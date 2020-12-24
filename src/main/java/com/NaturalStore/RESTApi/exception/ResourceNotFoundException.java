package com.NaturalStore.RESTApi.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
