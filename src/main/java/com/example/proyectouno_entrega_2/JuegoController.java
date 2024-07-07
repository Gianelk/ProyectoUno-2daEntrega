package com.example.proyectouno_entrega_2;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.io.File;
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

    public ImageView J1;
    public ImageView J2;
    public ImageView J3;
    public ImageView J4;
    public ImageView J5;
    public ImageView J6;
    public ImageView J7;
    public ImageView J8;
    public ImageView J9;
    public ImageView J10;
    public ImageView J11;
    public ImageView CartaMedio;




    static Mazo mazo=new Mazo();
    static Mesa mesa=new Mesa();
    static Jugador jugador=new Jugador("Perro");
    static Jugador jugadorBot=new Jugador("Joselito Bot");
    static Jugadores jugadores=new Jugadores();
    static LinkedList<Jugador> jugadors=new LinkedList<>();
    static boolean cambiar=false;

    @FXML
    public void crear(){
        mazo.crearCartas();
        jugadors.add(jugador);
        jugadors.add(jugadorBot);
        jugadores.setJugadores(jugadors);
        mazo.barajar();
        mesa.iniciarMesa(mazo);
        mazo.repartirCartas(jugadores);
        jugadores.mostrarMiLista();
        jugadores.getJugadores(0).cartasDisponibles.mostrarMiBaraja();
        jugadores.getJugadores(1).cartasDisponibles.mostrarMiBaraja();
    }
    @FXML
    public void prueba() throws FileNotFoundException {
        File file= new File("src/main/resources/images/Blanco.png");
        Image image2=new Image(file.toURI().toString());
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
                File file1= new File(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url);
                Image image=new Image(file1.toURI().toString());
                if(i==0){
                    P1.setImage(image);
                }
                if(i==1){
                    P2.setImage(image);
                }
                if(i==2){
                    P3.setImage(image);
                }
                if(i==3){
                    P4.setImage(image);
                }
                if(i==4){
                    P5.setImage(image);
                }
                if(i==5){
                    P6.setImage(image);
                }
                if(i==6){
                    P7.setImage(image);
                }
                if(i==7){
                    P8.setImage(image);
                }
                if(i==8){
                    P9.setImage(image);
                }
                if(i==9){
                    P10.setImage(image);
                }
                if(i==10){
                    P11.setImage(image);
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            if(i>=jugadores.getJugadores(1).getCartasDisponibles().tamanobaraja()){
                if(i==1){
                    J2.setImage(image2);
                }
                if(i==2){
                    J3.setImage(image2);
                }
                if(i==3){
                    J4.setImage(image2);
                }
                if(i==4){
                    J5.setImage(image2);
                }
                if(i==5){
                    J6.setImage(image2);
                }
                if(i==6){
                    J7.setImage(image2);
                }
                if(i==7){
                    J8.setImage(image2);
                }
                if(i==8){
                    J9.setImage(image2);
                }
                if(i==9){
                    J10.setImage(image2);
                }
                if(i==10){
                    J11.setImage(image2);
                }
            }else {
                Image image=new Image(new FileInputStream("src/main/resources/images/carta atras.jpg"));
                if(i==0){

                    J1.setImage(image);
                }
                if(i==1){

                    J2.setImage(image);
                }
                if(i==2){

                    J3.setImage(image);
                }
                if(i==3){

                    J4.setImage(image);
                }
                if(i==4){

                    J5.setImage(image);
                }
                if(i==5){

                    J6.setImage(image);
                }
                if(i==6){

                    J7.setImage(image);
                }
                if(i==7){

                    J8.setImage(image);
                }
                if(i==8){

                    J9.setImage(image);
                }
                if(i==9){

                    J10.setImage(image);
                }
                if(i==10){

                    J11.setImage(image);
                }
            }

        }
       mesa.mostrarPrimera();
    }
    public static void jugarCarta(int cartaJugar){
        Jugador jugador= jugadores.getJugadores(0);
        Baraja baraja= jugador.cartasDisponibles;
        if(mesa.getPrimera().numeroCarta.equals(baraja.getCarta(cartaJugar).numeroCarta)||mesa.getColorMesa().equals(baraja.getCarta(cartaJugar).color)){
            mesa.agregarPrimero(baraja.getCarta(cartaJugar));
            jugador.cartasDisponibles.eliminar(cartaJugar);
            cambiar=true;
        }
    }
    @FXML
    public void lanzarCartaP1(){
        String imagen ="src/main/resources/images/"+(P1.getImage().getUrl().toString().substring(P1.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
         cambiar=false;
        jugarCarta(0);
        jugador= jugadores.getJugadores(0);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP2(){
        String imagen ="src/main/resources/images/"+(P2.getImage().getUrl().toString().substring(P2.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(1);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP3(){
        String imagen ="src/main/resources/images/"+(P3.getImage().getUrl().toString().substring(P3.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(2);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP4(){
        String imagen ="src/main/resources/images/"+(P4.getImage().getUrl().toString().substring(P4.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(3);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP5(){
        String imagen ="src/main/resources/images/"+(P5.getImage().getUrl().toString().substring(P5.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(4);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP6(){
        String imagen ="src/main/resources/images/"+(P6.getImage().getUrl().toString().substring(P6.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(5);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP7(){
        String imagen ="src/main/resources/images/"+(P7.getImage().getUrl().toString().substring(P7.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(6);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP8(){
        String imagen ="src/main/resources/images/"+(P8.getImage().getUrl().toString().substring(P8.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(7);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP9(){
        String imagen ="src/main/resources/images/"+(P1.getImage().getUrl().toString().substring(P1.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(8);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP10(){
        String imagen ="src/main/resources/images/"+(P10.getImage().getUrl().toString().substring(P10.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(9);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP11(){
        String imagen ="src/main/resources/images/"+(P11.getImage().getUrl().toString().substring(P11.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        jugarCarta(10);
        if(cambiar){
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }
    }


}
