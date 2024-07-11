package com.example.proyectouno_entrega_2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

import static com.example.proyectouno_entrega_2.Comodin.ventanaColor;
import static com.example.proyectouno_entrega_2.JuegoController.crearPuntaje;

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
    public Label ingreso;
    public TextField ingresoText;
    public Label avisoUno;
    public Button ingresoButton;

    static boolean verificar = false;
    static public Mazo mazo = new Mazo();
    static public Mesa mesa = new Mesa();
    static public Jugador jugador = new Jugador("");
    static public Jugador jugadorBot = new Jugador("Joselito Bot");
    static public Jugadores jugadores = new Jugadores();
    static public LinkedList<Jugador> jugadors = new LinkedList<>();
    static boolean cambiar = false;
    static int j = 1;
    static public LinkedList<Puntaje> puntajes= new LinkedList<>();

    @FXML
    public static void crear() {
        mazo.mazo.clear();
       mesa.mazoMesa.clear();;
       jugador.cartasDisponibles.getBaraja().clear();
       jugadorBot.cartasDisponibles.getBaraja().clear();
       jugadores.getJugadores().clear();
        mazo.crearCartas();
        jugador.setNombre("");
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
        if (jugador.nombre.equals("")){
            jugador.setNombre(ingresoText.getText());
        }
        avisoUno.setText("");
        ingreso.setText("");
        ingresoButton.setScaleX(0);
        ingresoButton.setScaleY(0);
        ingresoButton.setScaleZ(0);
        ingresoText.setScaleX(0);
        ingresoText.setScaleY(0);
        ingresoText.setScaleZ(0);
        nombreBot.setText("JoselitoBot");
        nombreJugador.setText(jugador.nombre);
        File file = new File("src/main/resources/images/Blanco.png");
        Image image2 = new Image(file.toURI().toString());
        File file2 = new File(mesa.getPrimera().getUrl());
        Image image3 = new Image(file2.toURI().toString());
        CartaMedio.setImage(image3);
        for (int i = 0; i < 11; i++) {
            if (i >= jugadores.getJugadores(0).getCartasDisponibles().tamanobaraja()) {
                if (i == 1) {
                    P2.setImage(image2);
                }
                if (i == 2) {
                    P3.setImage(image2);
                }
                if (i == 3) {
                    P4.setImage(image2);
                }
                if (i == 4) {
                    P5.setImage(image2);
                }
                if (i == 5) {
                    P6.setImage(image2);
                }
                if (i == 6) {
                    P7.setImage(image2);
                }
                if (i == 7) {
                    P8.setImage(image2);
                }
                if (i == 8) {
                    P9.setImage(image2);
                }
                if (i == 9) {
                    P10.setImage(image2);
                }
                if (i == 10) {
                    P11.setImage(image2);
                }
            } else {
                File file1 = new File(jugadores.getJugadores(0).getCartasDisponibles().getBaraja().get(i).url);
                Image image = new Image(file1.toURI().toString());
                if (i == 0) {
                    P1.setImage(image);
                }
                if (i == 1) {
                    P2.setImage(image);
                }
                if (i == 2) {
                    P3.setImage(image);
                }
                if (i == 3) {
                    P4.setImage(image);
                }
                if (i == 4) {
                    P5.setImage(image);
                }
                if (i == 5) {
                    P6.setImage(image);
                }
                if (i == 6) {
                    P7.setImage(image);
                }
                if (i == 7) {
                    P8.setImage(image);
                }
                if (i == 8) {
                    P9.setImage(image);
                }
                if (i == 9) {
                    P10.setImage(image);
                }
                if (i == 10) {
                    P11.setImage(image);
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            if (i >= jugadores.getJugadores(1).getCartasDisponibles().tamanobaraja()) {
                if (i == 1) {
                    J2.setImage(image2);
                }
                if (i == 2) {
                    J3.setImage(image2);
                }
                if (i == 3) {
                    J4.setImage(image2);
                }
                if (i == 4) {
                    J5.setImage(image2);
                }
                if (i == 5) {
                    J6.setImage(image2);
                }
                if (i == 6) {
                    J7.setImage(image2);
                }
                if (i == 7) {
                    J8.setImage(image2);
                }
                if (i == 8) {
                    J9.setImage(image2);
                }
                if (i == 9) {
                    J10.setImage(image2);
                }
                if (i == 10) {
                    J11.setImage(image2);
                }
            } else {
                Image image = new Image(new FileInputStream("src/main/resources/images/carta atras.jpg"));
                if (i == 0) {

                    J1.setImage(image);
                }
                if (i == 1) {

                    J2.setImage(image);
                }
                if (i == 2) {

                    J3.setImage(image);
                }
                if (i == 3) {

                    J4.setImage(image);
                }
                if (i == 4) {

                    J5.setImage(image);
                }
                if (i == 5) {

                    J6.setImage(image);
                }
                if (i == 6) {

                    J7.setImage(image);
                }
                if (i == 7) {

                    J8.setImage(image);
                }
                if (i == 8) {

                    J9.setImage(image);
                }
                if (i == 9) {

                    J10.setImage(image);
                }
                if (i == 10) {

                    J11.setImage(image);
                }
            }

        }
    }
    public static int crearPuntaje(LinkedList<Carta> baraja){
        int puntaje=0;
        for (int i = 0; i < baraja.size(); i++) {
            if(baraja.get(i).numeroCarta.equals("+2")||baraja.get(i).numeroCarta.equals("C")||baraja.get(i).numeroCarta.equals("X")){
                puntaje=puntaje+20;
            } else if(baraja.get(i).numeroCarta.equals("+4")||baraja.get(i).numeroCarta.equals("#")){
                puntaje=puntaje+50;
            }
            else {
                puntaje=puntaje+Integer.parseInt(baraja.get(i).numeroCarta);
            }
        }
        return puntaje;
    }
    public static void puntajesAnadir(Puntaje puntaje){
        if(!puntajes.isEmpty()) {
            for (int i = 0; i < puntajes.size(); i++) {
                if (puntajes.get(i).getPuntaje() < puntaje.getPuntaje()) {
                    puntajes.add(i, puntaje);
                    break;
                }
            }
        }else{
            puntajes.add(puntaje);
        }
    }
    public static void Ganar(MouseEvent event) throws IOException {
        Puntaje puntaje= new Puntaje(jugador.nombre,crearPuntaje(jugadorBot.cartasDisponibles.getBaraja()));
        jugadorBot.cartasDisponibles.mostrarMiBaraja();
        System.out.println(puntaje.getPuntaje());
        System.out.println(puntajes);
        puntajesAnadir(puntaje);
        guardarPartidaPuntajes(puntajes);
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("VentanaGanar.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public static void Perder(MouseEvent event) throws IOException {
        Puntaje puntaje= new Puntaje("JoselitoBot",crearPuntaje(jugador.cartasDisponibles.getBaraja()));
        puntajesAnadir(puntaje);
        guardarPartidaPuntajes(puntajes);
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("VentanaPerder.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public static void ordenar() {
        Baraja baraja = jugadores.getJugadores(0).cartasDisponibles;
        LinkedList<Integer> posibilidades = baraja.evaluarCarta(mesa);
        for (int i = 0; i < posibilidades.size(); i++) {
            baraja.agregarCartaPrimero(baraja.getCarta(posibilidades.get(i)));
            baraja.eliminar(posibilidades.get(i) + 1);

        }
        System.out.println(posibilidades);
    }

    public static void rearmarMazo() {
        if (mazo.getMazo().size() < 5) {
            for (int i = 1; i < mesa.mazoMesa.size(); i++) {
                mazo.agregarCarta(mesa.getCarta(i));
                mesa.eliminarCarta1(i);
            }
        }
    }

    @FXML
    public static void evaluarBot(MouseEvent event) throws IOException {
        Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
        System.out.println(mesa.getPrimera().numeroCarta);
        if (mesa.evaluarMesa() == 1) {
            mesa.setColorMesa(barajabot.elegirColor());
        }
        if (mesa.getPrimera().numeroCarta.equals("+2") || mesa.getPrimera().numeroCarta.equals("C") || mesa.getPrimera().numeroCarta.equals("X") || mesa.getPrimera().numeroCarta.equals("+4")) {
            String numero = mesa.getPrimera().numeroCarta;
            j = 0;
            switch (numero) {
                case "+2":
                    Toma2 toma2;
                    toma2 = mesa.getToma2();
                    toma2.tomar2Cartas(jugadores.getJugadores(0), mazo);
                    break;
                case "+4":
                    Toma4 toma4;
                    toma4 = mesa.getToma4();
                    toma4.tomar4Cartas(jugadores.getJugadores(0), mazo);
                    break;
            }
            LinkedList<Integer> posibilidadesBot = barajabot.evaluarCarta(mesa);
            if (!posibilidadesBot.isEmpty()) {
                barajabot.jugadaBot(mesa, mazo);
                evaluarBot(event);
            } else {
                barajabot.agregarCarta(mazo.getPrimeraMazo(0));
                mazo.eliminarCarta(0);
            }
        }
        if (barajabot.tamanobaraja() == 0) {
            System.out.println("ganaste bot");
            Perder(event);
        }
        ordenar();
        rearmarMazo();
    }

    public static void jugarCarta(int cartaJugar,MouseEvent event) throws IOException {
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        int tamanoBaraja = baraja.tamanobaraja();
        if (mesa.getPrimera().numeroCarta.equals(baraja.getCarta(cartaJugar).numeroCarta) || (mesa.getColorMesa().equals(baraja.getCarta(cartaJugar).color)) || (baraja.getCarta(cartaJugar).color.equals("negro"))) {
            mesa.agregarPrimero(baraja.getCarta(cartaJugar));
            jugador.cartasDisponibles.eliminar(cartaJugar);
            cambiar = true;
            if (mesa.evaluarMesa() == 1) {
                Comodin comodin;
                comodin = mesa.getComodin();
                ventanaColor();
            }
            if (mesa.getPrimera().numeroCarta.equals("+2") || mesa.getPrimera().numeroCarta.equals("C") || mesa.getPrimera().numeroCarta.equals("X") || mesa.getPrimera().numeroCarta.equals("+4")) {
                String numero = mesa.getPrimera().numeroCarta;
                switch (numero) {
                    case "+2":
                        Toma2 toma2;
                        toma2 = mesa.getToma2();
                        toma2.tomar2Cartas(jugadores.getJugadores(1), mazo);
                        break;
                    case "+4":
                        Toma4 toma4;
                        toma4 = mesa.getToma4();
                        toma4.tomar4Cartas(jugadores.getJugadores(1), mazo);
                        break;
                }
            } else {
                Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
                barajabot.jugadaBot(mesa, mazo);
                evaluarBot(event);
            }
        }
        rearmarMazo();
        ordenar();
        Baraja barajabot = jugadores.getJugadores(1).cartasDisponibles;
        LinkedList<Carta> barajaJugadorGuardar = baraja.getBaraja();
        LinkedList<Carta> barajaBotGuardar = barajabot.getBaraja();
        String nombreJug = jugador.nombre;
        LinkedList<Carta> mazoMesaGuardar =mesa.getMazoMesa();
        LinkedList<Carta> mazoGuardar = mazo.getMazo();
        guardarPartida(barajaJugadorGuardar, barajaBotGuardar, mazoMesaGuardar, mazoGuardar, nombreJug);
    }
    @FXML
    public void cantarUno(){
        verificar=true;
    }

    @FXML
    public void lanzarCartaP1(MouseEvent event) throws InterruptedException, IOException {
        String imagen = "src/main/resources/images/" + (P1.getImage().getUrl().toString().substring(P1.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        System.out.println(posibilidades);
        if (!posibilidades.isEmpty()) {
            jugarCarta(0,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else if(baraja.tamanobaraja()!=0){
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
        if (baraja.tamanobaraja() == 0) {
            if(verificar) {
                System.out.println("ganaste");
                Ganar(event);
            }else{
                avisoUno.setText("No presionaste UNO! :c");
                baraja.agregarCarta(mazo.getPrimeraMazo(0));
                baraja.agregarCarta(mazo.getPrimeraMazo(1));
                mazo.eliminarCarta(0);
                mazo.eliminarCarta(0);
                File file2 = new File("src/main/resources/images/Blanco.png");
                Image image = new Image(file2.toURI().toString());
                mostrarUno.setImage(image);
            }
        }
//Pnatalla de ganaste, solo se pone en p1 poruqe si tienes 1 siempre va a estar en p1
    }

    @FXML
    public void lanzarCartaP2(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P2.getImage().getUrl().toString().substring(P2.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(1,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP3(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P3.getImage().getUrl().toString().substring(P3.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(2,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP4(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P4.getImage().getUrl().toString().substring(P4.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(3,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP5(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P5.getImage().getUrl().toString().substring(P5.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(4,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP6(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P6.getImage().getUrl().toString().substring(P6.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(5,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP7(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P7.getImage().getUrl().toString().substring(P7.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(6,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP8(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P8.getImage().getUrl().toString().substring(P8.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(7,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP9(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P1.getImage().getUrl().toString().substring(P1.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(8,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP10(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P10.getImage().getUrl().toString().substring(P10.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(9,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    @FXML
    public void lanzarCartaP11(MouseEvent event) throws IOException {
        String imagen = "src/main/resources/images/" + (P11.getImage().getUrl().toString().substring(P11.getImage().getUrl().toString().lastIndexOf("/") + 1)).replaceAll("%20", " ");
        System.out.println(imagen);
        cambiar = false;
        LinkedList<Integer> posibilidades = new LinkedList<Integer>();
        Jugador jugador = jugadores.getJugadores(0);
        Baraja baraja = jugador.cartasDisponibles;
        posibilidades = baraja.evaluarCarta(mesa);
        if (!posibilidades.isEmpty()) {
            jugarCarta(10,event);
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
            barajabot.jugadaBot(mesa, mazo);
            evaluarBot(event);
        }
        if (baraja.tamanobaraja() == 1) {
            File file2 = new File("src/main/resources/images/Uno.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
        } else {
            File file2 = new File("src/main/resources/images/Blanco.png");
            Image image = new Image(file2.toURI().toString());
            mostrarUno.setImage(image);
            verificar=false;
        }
    }

    public static void guardarPartida(LinkedList<Carta> barajaJugador,LinkedList<Carta> barajaBot, LinkedList<Carta> mazoMesa, LinkedList<Carta> mazo, String nombreJugador){
        GuardarDatos guardarDatos= new GuardarDatos();
        guardarDatos.setBarajaJugador(barajaJugador);
        guardarDatos.setBarajaBot(barajaBot);
        guardarDatos.setMazoMesa(mazoMesa);
        guardarDatos.setMazo(mazo);
        guardarDatos.setNombreJugador(nombreJugador);
        escribirJson(guardarDatos,"guardarPartida.json");
    }

    public static void escribirJson(GuardarDatos datos, String rutaArchivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(datos, writer);
            System.out.println("Archivo JSON actualizado: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerJsonYActualizar(String rutaArchivo, LinkedList<Carta> barajaJugador, LinkedList<Carta> barajaBot, LinkedList<Carta> mazoMesa, LinkedList<Carta> mazo, String nombreJugador1) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            GuardarDatos datos = gson.fromJson(reader, GuardarDatos.class);

            barajaJugador.clear();
            barajaJugador.addAll(datos.getBarajaJugador());

            barajaBot.clear();
            barajaBot.addAll(datos.getBarajaBot());

            mazoMesa.clear();
            mazoMesa.addAll(datos.getMazoMesa());

            mazo.clear();
            mazo.addAll(datos.getMazo());

            nombreJugador1 = datos.getNombreJugador();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static LinkedList<Carta> polimorfismo(LinkedList<Carta> baraja) {
        for(int i = 0; i < baraja.size(); ++i) {
            Carta carta = (Carta)baraja.get(i);
            switch (carta.numeroCarta) {
                case "+2":
                    Carta cartaNueva2 = new Toma2(carta.numeroCarta, carta.color,carta.url);
                    baraja.remove(i);
                    baraja.add(i, cartaNueva2);
                    break;
                case "+4":
                    Carta cartaNueva4 = new Toma4(carta.numeroCarta, carta.color, carta.url);
                    baraja.remove(i);
                    baraja.add(i, cartaNueva4);
                    break;
                case "#":
                    Carta cartaNuevaCambiaColor = new Comodin(carta.numeroCarta, carta.color, carta.url);
                    baraja.remove(i);
                    baraja.add(i, cartaNuevaCambiaColor);
                    break;
                case "C":
                    Carta cartaNuevaCambiaSentido = new Comodin(carta.numeroCarta, carta.color, carta.url);
                    baraja.remove(i);
                    baraja.add(i, cartaNuevaCambiaSentido);
                    break;
                case "X":
                    Carta cartaNuevaPasaTurno = new Comodin(carta.numeroCarta, carta.color, carta.url);
                    baraja.remove(i);
                    baraja.add(i, cartaNuevaPasaTurno);
            }
        }
        return baraja;
    }
    public static void usarJson(){
        jugadors.add(jugador);
        jugadors.add(jugadorBot);
        jugadores.setJugadores(jugadors);
        mazo.barajar();
        LinkedList<Carta> barajaJugadorLeer =jugadores.getJugadores(0).getCartasDisponibles().getBaraja();
        LinkedList<Carta> barajaBotLeer=jugadores.getJugadores(1).getCartasDisponibles().getBaraja();
        LinkedList<Carta> mazoMesaLeer=mesa.getMazoMesa();
        LinkedList<Carta> mazoLeer=mazo.getMazo();
        String nombreJugador = "";
        leerJsonYActualizar("guardarPartida.json",barajaJugadorLeer,barajaBotLeer,mazoMesaLeer,mazoLeer,nombreJugador);
        jugadores.getJugadores(0).setNombre(nombreJugador);
        polimorfismo(barajaJugadorLeer);
        polimorfismo(barajaBotLeer);
        polimorfismo(mazoLeer);
        polimorfismo(mazoMesaLeer);
        jugadores.getJugadores(0).getCartasDisponibles().setBaraja(barajaJugadorLeer);
        jugadores.getJugadores(1).getCartasDisponibles().setBaraja(barajaBotLeer);
        mesa.setMazoMesa(mazoMesaLeer);
        mazo.setMazo(mazoLeer);
        mesa.setColorMesa(mesa.getPrimera().color);
    }
    @FXML
    public void volverMenuJuego(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }
    public static void guardarPartidaPuntajes(LinkedList<Puntaje> puntajes ){
        GuardarPuntajes guardarPuntajes= new GuardarPuntajes();
        guardarPuntajes.setPuntajes(puntajes);
        escribirJsonPuntajes(guardarPuntajes,"guardarPartidaPuntajes.json");
    }
    public static void escribirJsonPuntajes(GuardarPuntajes datos, String rutaArchivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(datos, writer);
            System.out.println("Archivo JSON actualizado: " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
