package com.example.proyectouno_entrega_2;

public class Toma2 extends Comodin{
    public Toma2(String numeroCarta, String color, String url) {
        super(numeroCarta, color,url);
    }
    public void tomar2Cartas(Jugador jugador, Mazo mazo){
        Carta carta;
        Baraja baraja;
        baraja=jugador.cartasDisponibles;
        int i;
        for (i=0; i<2; i++){
            carta = mazo.getPrimeraMazo(0);
            baraja.agregarCarta(carta);
            mazo.eliminarPrimeraCarta();
        }
    }
}