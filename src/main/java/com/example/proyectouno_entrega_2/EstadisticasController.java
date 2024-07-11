package com.example.proyectouno_entrega_2;

import javafx.scene.control.Label;

import java.util.LinkedList;

public class EstadisticasController {
    public Label rank1;
    public Label rank2;
    public Label rank3;
    public Label rank4;
    public Label rank5;

    public void mostrarEstadisticas(){
        LinkedList<Puntaje> puntos=new LinkedList<>();
        JuegoController.leerJsonPuntaje("guardarPartidaPuntajes.json",puntos);
        rank1.setText(puntos.get(0).getNombre()+" "+puntos.get(0).getPuntaje());
        rank2.setText(puntos.get(1).getNombre()+" "+puntos.get(1).getPuntaje());
        rank3.setText(puntos.get(2).getNombre()+" "+puntos.get(2).getPuntaje());
        rank4.setText(puntos.get(3).getNombre()+" "+puntos.get(3).getPuntaje());
        rank5.setText(puntos.get(4).getNombre()+" "+puntos.get(4).getPuntaje());
    }
}
