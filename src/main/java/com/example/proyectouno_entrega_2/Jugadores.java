package com.example.proyectouno_entrega_2;

import java.util.LinkedList;
import java.util.Scanner;

public class Jugadores extends LinkedList<Jugador>{

    private LinkedList<Jugador> jugadores;

    public LinkedList<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugadores() {
        this.jugadores= new LinkedList<Jugador>();
    }
    public Jugadores(LinkedList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Jugador getJugadores(int j){
        return jugadores.get(j);
    }

    public void crearJugador(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador");
        String nombreJugador = leer.next();
        Jugador jugador = new Jugador(nombreJugador);
        jugadores.add(jugador);
        jugador = new Jugador("Joselito bot");
        jugadores.add(jugador);
    }
    public  void mostrarMiLista() {
        System.out.println("Los jugadores de la lista son: ");
        System.out.println();
        for(int  i= 0;i<jugadores.size(); i++) {
            System.out.println(jugadores.get(i).nombre);
        }
    }
    public void crearJugadorLeer(String nombreJugador){
        Jugador jugador = new Jugador(nombreJugador);
        jugadores.add(jugador);
        jugador = new Jugador("Joselito bot");
        jugadores.add(jugador);
    }

}
