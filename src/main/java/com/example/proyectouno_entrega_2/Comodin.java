package com.example.proyectouno_entrega_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.File;
import java.io.IOException;
import javafx.scene.control.ButtonType;
import java.util.Scanner;

public class Comodin extends Carta {
    public Comodin(String numeroCarta, String color, String url) {
        super(numeroCarta, color,url);
    }

    public void cambiaColor(Mesa mazoMesa) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Seleccione el color al que desea cambiar");
        System.out.println(" ");
        System.out.println("[0]" + "\033[31m" + "Rojo" + "\033[00m" + " [1]" + "\033[34m" + "Azul" + "\033[00m" + "\033[00m" + " [2]" + "\033[33m" + "Amarillo" + "\033[00m" + " [3]" + "\033[32m" + "Verde"+"\033[00m");
        int i = leer.nextInt();
        switch (i) {
            case 0:
                mazoMesa.setColorMesa("R");
                break;
            case 1:
                mazoMesa.setColorMesa("B");
                break;

            case 2:
                mazoMesa.setColorMesa("Y");
                break;
            case 3:
                mazoMesa.setColorMesa("G");
                break;
            default:
                throw new IllegalStateException("LOL: " + i);

        }
    }
    @FXML
    public static void ventanaColor() throws IOException {
        Stage VentanaEmergente = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("Menu2.fxml"));
        Scene scene= new Scene(fxmlLoader.load(),400,400);
        String filePath = "src/main/resources/images/icono.png";
        Image icon = new Image(new File(filePath).toURI().toString());
        VentanaEmergente.getIcons().add(icon);
        VentanaEmergente.setScene(scene);
        VentanaEmergente.show();
    }



}
