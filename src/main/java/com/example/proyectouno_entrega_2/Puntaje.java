package com.example.proyectouno_entrega_2;

public class Puntaje {
    private String nombre;
    private Integer puntaje;

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puntaje(String nombre, Integer puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }
}
