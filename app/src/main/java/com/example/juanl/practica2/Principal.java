package com.example.juanl.practica2;

import java.util.ArrayList;

public class Principal {
    public static void main(String args[]){
        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona(19123123, "Andres", "Tomas"));

        personas.get(0).anyadir(new Telefono("Movil", 555123456));
        personas.get(0).anyadir(new Telefono("Trabajo", 961234567));

//        Persona p = buscar(personas, "Andres");
//        p.mostrarTelefonos();

        Persona yo = new Persona(20112343, "Joan", "Fuster");
        personas.add(yo);
    }

    public static Persona buscar(ArrayList<Persona> personas, String nombre){
        return null;

    }

}
