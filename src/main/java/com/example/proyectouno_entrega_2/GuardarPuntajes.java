package com.example.proyectouno_entrega_2;

import java.util.LinkedList;

public class GuardarPuntajes {
    private LinkedList<Puntaje> puntajes;

    public LinkedList<Puntaje> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(LinkedList<Puntaje> puntajes) {
        this.puntajes = puntajes;
    }

    public String toString() {
        return "Datos{" +
                "puntajes=" + puntajes +
                '}';
    }
}
