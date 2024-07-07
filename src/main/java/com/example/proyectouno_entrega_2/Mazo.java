package com.example.proyectouno_entrega_2;

import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;

public class Mazo extends LinkedList<Carta>{

    LinkedList<Carta> mazo;

    public Mazo(LinkedList<Carta> mazo) {

        this.mazo = mazo;
    }
    public Mazo() {

        this.mazo = new LinkedList<Carta>();
    }

    public LinkedList<Carta> getMazo() {

        return mazo;
    }

    public void setMazo(LinkedList<Carta> mazo) {

        this.mazo = mazo;
    }
    public void barajar(){
        Random random = new Random();
        Carta cartaAuxiliar=new Carta();
        for(int  i= 0;i<mazo.size(); i++) {
            int numero = random.nextInt(mazo.size());
            if (i != numero) {
                cartaAuxiliar=mazo.get(i);
                mazo.remove(i);
                mazo.add(numero, cartaAuxiliar);
            }
        }
    }
    public  void mostrarMiLista() {
        System.out.println("Los Elementos de la lista son: ");
        System.out.println();
        for(int  i= 0;i<mazo.size(); i++) {
            System.out.println(mazo.get(i).numeroCarta);
            System.out.println(mazo.get(i).color);
        }

    }
    public void crearCartas() {
        String numeroCarta;
        String color;
        String url;
        for (int j=0; j<4;j++) {
            switch (j) {
                case 0:
                    color = "B";
                    break;
                case 1:
                    color ="Y";
                    break;
                case 2:
                    color ="R";
                    break;
                case 3:
                    color ="G";
                    break;
                default:
                    throw new IllegalStateException("LOL: " + j);
            }
            for (int i = 0; i < 10; i++) {
                numeroCarta = String.valueOf(i);
                url="src/main/resources/images/" +numeroCarta+" "+ color +".png";
                Carta carta = new Carta(numeroCarta, color,url);
                if (i == 0) {
                    mazo.add(carta);
                    url="src/main/resources/images/" +"+2 "+ color +".png";
                    carta = new Toma2("+2", color,url);
                    mazo.add(carta);
                    mazo.add(carta);
                    url="src/main/resources/images/" +"X "+ color +".png";
                    carta = new Comodin("X", color,url);
                    mazo.add(carta);
                    mazo.add(carta);
                    url="src/main/resources/images/" +"C "+ color +".png";
                    carta = new Comodin("C", color,url);
                    mazo.add(carta);
                    mazo.add(carta);
                } else {
                    mazo.add(carta);
                    mazo.add(carta);
                }
            }
        }
        this.crearCartasComodin();
    }
    public void crearCartasComodin() {
        String url;
        url="src/main/resources/images/+4.png";
        Carta carta =new Toma4("+4","negro",url);
        mazo.add(carta);
        mazo.add(carta);
        mazo.add(carta);
        mazo.add(carta);
        url="src/main/resources/images/#.png";
        carta=new Comodin("#","negro",url);
        mazo.add(carta);
        mazo.add(carta);
        mazo.add(carta);
        mazo.add(carta);
    }
    public Carta getPrimeraMazo(int i) {
        return mazo.get(i);
    }
    public void agregarCarta(Carta carta){
        mazo.add(carta);
    }
    public void rellenarMazo(Mesa mazoMesa){
           LinkedList<Carta> cartasMesa;
           Carta carta;
           cartasMesa=mazoMesa.getMazoMesa();
           int tamano = cartasMesa.size();
           for(int i=1;i<tamano;i++){
               carta= cartasMesa.get(1);
               mazo.add(carta);
               cartasMesa.remove(1);
           }
    }
    public void eliminarPrimeraCarta(){
        mazo.remove();
    }
    public void eliminarCarta(int i){
        mazo.remove(i);
    }
    public void repartirCartas(Jugadores jugadores){
        Jugador jugador;
        Baraja baraja;
        Carta carta;
        for (int j=0;j<7;j++) {
            for (int i = 0; i < 2; i++) {
                jugador = jugadores.getJugadores(i);
                baraja = jugador.getCartasDisponibles();
                carta=mazo.getFirst();
                baraja.agregarCarta(carta);
                jugador.setCartasDisponibles(baraja);
                mazo.remove();
            }
        }
    }
}
