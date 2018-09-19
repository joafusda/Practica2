package com.example.juanl.practica2;

import java.util.ArrayList;

public class Persona {
    private int dni;
    private String nombre;
    private String apellidos;
    private ArrayList<Telefono> telefonos;

    public Persona(int dni, String nombre, String apellidos){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefonos = new ArrayList<>();
    }

    public void anyadir(Telefono telefono){
        this.telefonos.add(telefono);
    }

    public void quitar(){

    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public ArrayList<Telefono> mostrarTelefonos(){
        return null;
    }
}
