package com.example.proyectouno_entrega_2;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

public class JuegoController {
    public ImageView P1;
    public ImageView P2;
    public ImageView P3;
    public ImageView P4;
    public ImageView P5;
    public ImageView P6;
    public ImageView P7;
    public ImageView P8;
    public ImageView P9;
    public ImageView P10;
    public ImageView P11;

    @FXML
    public void prueba() throws FileNotFoundException {
        Mazo mazo=new Mazo();
        mazo.crearCartas();
        Baraja baraja=new Baraja();
        Jugador jugador=new Jugador("Perro");
        Jugador jugador2=new Jugador("gato");
        Jugadores jugadores=new Jugadores();
        LinkedList<Jugador> jugadors=new LinkedList<>();
        jugadors.add(jugador);
        jugadors.add(jugador2);
        jugadores.setJugadores(jugadors);
        mazo.barajar();
        mazo.repartirCartas(jugadores);
        jugadores.mostrarMiLista();
        jugadores.getJugadores(0).cartasDisponibles.mostrarMiBaraja();
        jugadores.getJugadores(1).cartasDisponibles.mostrarMiBaraja();
        Image image2=new Image(new FileInputStream("src/main/resources/images/Blanco.png"));
        for (int i=0;i<11;i++){
            if(i>=jugadores.getJugadores(0).getCartasDisponibles().tamanobaraja()){
                if(i==1){
                    P2.setImage(image2);
                }
                if(i==2){
                    P3.setImage(image2);
                }
                if(i==3){
                    P4.setImage(image2);
                }
                if(i==4){
                    P5.setImage(image2);
                }
                if(i==5){
                    P6.setImage(image2);
                }
                if(i==6){
                    P7.setImage(image2);
                }
                if(i==7){
                    P8.setImage(image2);
                }
                if(i==8){
                    P9.setImage(image2);
                }
                if(i==9){
                    P10.setImage(image2);
                }
                if(i==10){
                    P11.setImage(image2);
                }
            }
            else{
                if(i==0){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P1.setImage(image);
                }
                if(i==1){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P2.setImage(image);
                }
                if(i==2){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P3.setImage(image);
                }
                if(i==3){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P4.setImage(image);
                }
                if(i==4){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P5.setImage(image);
                }
                if(i==5){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P6.setImage(image);
                }
                if(i==6){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P7.setImage(image);
                }
                if(i==7){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P8.setImage(image);
                }
                if(i==8){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P9.setImage(image);
                }
                if(i==9){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P10.setImage(image);
                }
                if(i==10){
                    Image image=new Image(new FileInputStream(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url));
                    P11.setImage(image);
                }
            }
        }
    }
}
