package com.example.proyectouno_entrega_2;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import static com.example.proyectouno_entrega_2.Comodin.ventanaColor;

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
    public ImageView NoPuedesJugar;
    public Label nombreBot;
    public Label nombreJugador;
    public ImageView mostrarUno;

    static boolean verificar=false;
    static Mazo mazo=new Mazo();
    static Mesa mesa=new Mesa();
    static Jugador jugador=new Jugador("Perro");
    static Jugador jugadorBot=new Jugador("Joselito Bot");
    static Jugadores jugadores=new Jugadores();
    static LinkedList<Jugador> jugadors=new LinkedList<>();
    static boolean cambiar=false;
    static int j=1;

    @FXML
    public static void crear(){
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
        nombreBot.setText("JoselitoBot");
        nombreJugador.setText("Player 1");
        File file= new File("src/main/resources/images/Blanco.png");
        Image image2=new Image(file.toURI().toString());
        File file2= new File(mesa.getPrimera().getUrl());
        Image image3=new Image(file2.toURI().toString());
        CartaMedio.setImage(image3);
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
    }
    public static void ordenar(){
        Baraja baraja = jugadores.getJugadores(0).cartasDisponibles;
        LinkedList<Integer> posibilidades=baraja.evaluarCarta(mesa);
        for (int i=0;i<posibilidades.size();i++){
            baraja.agregarCartaPrimero(baraja.getCarta(posibilidades.get(i)));
            baraja.eliminar(posibilidades.get(i)+1);

        }
        System.out.println(posibilidades);
    }
    @FXML
    public static void evaluarBot(){
        Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
        System.out.println(mesa.getPrimera().numeroCarta);
        if (mesa.evaluarMesa() == 1) {
            mesa.setColorMesa(barajabot.elegirColor());
        }
        if(mesa.getPrimera().numeroCarta.equals("+2")||mesa.getPrimera().numeroCarta.equals("C")||mesa.getPrimera().numeroCarta.equals("X")||mesa.getPrimera().numeroCarta.equals("+4")){
        String numero = mesa.getPrimera().numeroCarta;
        j=0;
        switch (numero) {
            case "+2":
                Toma2 toma2;
                toma2 = mesa.getToma2();
                toma2.tomar2Cartas( jugadores.getJugadores(0),mazo);
                break;
            case "+4":
                Toma4 toma4;
                toma4 = mesa.getToma4();
                toma4.tomar4Cartas(jugadores.getJugadores(0),mazo);
                break;
        }
        LinkedList<Integer> posibilidadesBot=barajabot.evaluarCarta(mesa);
        if(!posibilidadesBot.isEmpty()){
            barajabot.jugadaBot(mesa,mazo);
            evaluarBot();}
        else{
            barajabot.agregarCarta(mazo.getPrimeraMazo(0));
            mazo.eliminarCarta(0);
        }
    }
        ordenar();
    }
    public static void jugarCarta(int cartaJugar) throws IOException {
        Jugador jugador= jugadores.getJugadores(0);
        Baraja baraja= jugador.cartasDisponibles;
        int tamanoBaraja = baraja.tamanobaraja();
        if(mesa.getPrimera().numeroCarta.equals(baraja.getCarta(cartaJugar).numeroCarta)||(mesa.getColorMesa().equals(baraja.getCarta(cartaJugar).color))||(baraja.getCarta(cartaJugar).color.equals("negro"))){
            mesa.agregarPrimero(baraja.getCarta(cartaJugar));
            jugador.cartasDisponibles.eliminar(cartaJugar);
            cambiar=true;
            if (mesa.evaluarMesa() == 1) {
                Comodin comodin;
                comodin = mesa.getComodin();
                ventanaColor();
            }
            if(mesa.getPrimera().numeroCarta.equals("+2")||mesa.getPrimera().numeroCarta.equals("C")||mesa.getPrimera().numeroCarta.equals("X")||mesa.getPrimera().numeroCarta.equals("+4")){
                String numero = mesa.getPrimera().numeroCarta;
                switch (numero) {
                    case "+2":
                        Toma2 toma2;
                        toma2 = mesa.getToma2();
                        toma2.tomar2Cartas( jugadores.getJugadores(1),mazo);
                        break;
                    case "+4":
                        Toma4 toma4;
                        toma4 = mesa.getToma4();
                        toma4.tomar4Cartas(jugadores.getJugadores(1),mazo);
                        break;
                }
            }else{
            Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
            barajabot.jugadaBot(mesa,mazo);
            evaluarBot();
            }
        }
        ordenar();
    }

    @FXML
    public void lanzarCartaP1() throws InterruptedException, IOException {
        String imagen ="src/main/resources/images/"+(P1.getImage().getUrl().toString().substring(P1.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
         cambiar=false;
        LinkedList<Integer> posibilidades= new LinkedList<Integer>();
        Jugador jugador= jugadores.getJugadores(0);
        Baraja baraja= jugador.cartasDisponibles;
        posibilidades= baraja.evaluarCarta(mesa);
        System.out.println(posibilidades);
        if(!posibilidades.isEmpty()) {
            jugarCarta(0);
            if (cambiar) {
                File file4 = new File("src/main/resources/images/Blanco.jpg");
                Image image4 = new Image(file4.toURI().toString());
                NoPuedesJugar.setImage(image4);
                File file1 = new File(imagen);
                Image image = new Image(file1.toURI().toString());
                CartaMedio.setImage(image);
            } else {
                File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                Image image4 = new Image(file4.toURI().toString());
                NoPuedesJugar.setImage(image4);
            }
        }else{
            baraja.agregarCarta(mazo.getPrimeraMazo(0));
            mazo.eliminarCarta(0);
            Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
            barajabot.jugadaBot(mesa,mazo);
            evaluarBot();
        }
        if (baraja.tamanobaraja()==1){
            File file2=new File("src/main/resources/images/Uno.png");
            Image image=new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        }
        else{
            File file2=new File("src/main/resources/images/Blanco.png");
            Image image=new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP2() throws IOException {
        String imagen ="src/main/resources/images/"+(P2.getImage().getUrl().toString().substring(P2.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20"," ");
        System.out.println(imagen);
        cambiar=false;
        LinkedList<Integer> posibilidades= new LinkedList<Integer>();
        Jugador jugador= jugadores.getJugadores(0);
        Baraja baraja= jugador.cartasDisponibles;
        posibilidades= baraja.evaluarCarta(mesa);
        if(!posibilidades.isEmpty()){
            jugarCarta(1);
        if(cambiar){
            File file4= new File("src/main/resources/images/Blanco.jpg");
            Image image4=new Image(file4.toURI().toString());
            NoPuedesJugar.setImage(image4);
            File file1= new File(imagen);
            Image image=new Image(file1.toURI().toString());
            CartaMedio.setImage(image);
        }else{
            File file4= new File("src/main/resources/images/no se puede jugar.jpg");
            Image image4=new Image(file4.toURI().toString());
            NoPuedesJugar.setImage(image4);
        }
        }else{
            baraja.agregarCarta(mazo.getPrimeraMazo(0));
            mazo.eliminarCarta(0);
            Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
            barajabot.jugadaBot(mesa,mazo);
            evaluarBot();
        }
        if (baraja.tamanobaraja()==1){
            File file2=new File("src/main/resources/images/Uno.png");
            Image image=new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        }
        else{
            File file2=new File("src/main/resources/images/Blanco.png");
            Image image=new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        }
    }
    @FXML
    public void lanzarCartaP3() throws IOException {
        String imagen = "src/main/resources/images/" + (P3.getImage().getUrl().toString().substring(P3.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(2);
            if (cambiar) {
                File file4 = new File("src/main/resources/images/Blanco.jpg");
                Image image4 = new Image(file4.toURI().toString());
                NoPuedesJugar.setImage(image4);
                File file1 = new File(imagen);
                Image image = new Image(file1.toURI().toString());
                CartaMedio.setImage(image);
            } else {
                File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                Image image4 = new Image(file4.toURI().toString());
                NoPuedesJugar.setImage(image4);
            }
        }else{
        baraja.agregarCarta(mazo.getPrimeraMazo(0));
        mazo.eliminarCarta(0);
        Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
        barajabot.jugadaBot(mesa,mazo);
            evaluarBot();
    }
        if (baraja.tamanobaraja()==1){
            File file2=new File("src/main/resources/images/Uno.png");
            Image image=new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        }
        else{
            File file2=new File("src/main/resources/images/Blanco.png");
            Image image=new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        }
    }
        @FXML
        public void lanzarCartaP4 () throws IOException {
            String imagen = "src/main/resources/images/" + (P4.getImage().getUrl().toString().substring(P4.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(3);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }

        @FXML
        public void lanzarCartaP5 () throws IOException {
            String imagen = "src/main/resources/images/" + (P5.getImage().getUrl().toString().substring(P5.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(4);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }
        @FXML
        public void lanzarCartaP6 () throws IOException {
            String imagen = "src/main/resources/images/" + (P6.getImage().getUrl().toString().substring(P6.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(5);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }
        @FXML
        public void lanzarCartaP7 () throws IOException {
            String imagen = "src/main/resources/images/" + (P7.getImage().getUrl().toString().substring(P7.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(6);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }
        @FXML
        public void lanzarCartaP8 () throws IOException {
            String imagen = "src/main/resources/images/" + (P8.getImage().getUrl().toString().substring(P8.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(7);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }
        @FXML
        public void lanzarCartaP9 () throws IOException {
            String imagen = "src/main/resources/images/" + (P1.getImage().getUrl().toString().substring(P1.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(8);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }
        @FXML
        public void lanzarCartaP10 () throws IOException {
            String imagen = "src/main/resources/images/" + (P10.getImage().getUrl().toString().substring(P10.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(9);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }
        @FXML
        public void lanzarCartaP11 () throws IOException {
            String imagen = "src/main/resources/images/" + (P11.getImage().getUrl().toString().substring(P11.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
            System.out.println(imagen);
            cambiar = false;
            LinkedList<Integer> posibilidades = new LinkedList<Integer>();
            Jugador jugador = jugadores.getJugadores(0);
            Baraja baraja = jugador.cartasDisponibles;
            posibilidades = baraja.evaluarCarta(mesa);
            if (!posibilidades.isEmpty()) {
                jugarCarta(10);
                if (cambiar) {
                    File file4 = new File("src/main/resources/images/Blanco.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                    File file1 = new File(imagen);
                    Image image = new Image(file1.toURI().toString());
                    CartaMedio.setImage(image);
                } else {
                    File file4 = new File("src/main/resources/images/no se puede jugar.jpg");
                    Image image4 = new Image(file4.toURI().toString());
                    NoPuedesJugar.setImage(image4);
                }
            } else {
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa,mazo);
                evaluarBot();
            }
            if (baraja.tamanobaraja()==1){
                File file2=new File("src/main/resources/images/Uno.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
            else{
                File file2=new File("src/main/resources/images/Blanco.png");
                Image image=new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }

}
