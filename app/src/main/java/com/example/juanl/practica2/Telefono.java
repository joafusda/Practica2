package com.example.juanl.practica2;

public class Telefono {
    private int numero;
    private String descripcion;

    public Telefono(String descripcion, int numero){
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

}
