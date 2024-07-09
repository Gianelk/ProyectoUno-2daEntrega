package com.example.proyectouno_entrega_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;
import java.io.IOException;
import javafx.scene.control.ButtonType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MenuController {
    @FXML
    public void IniciarJuego(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("Juego.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        stage.setScene(scene);
        stage.show();
        JuegoController.crear();
    }
    @FXML
    public void Salir(ActionEvent event){
        ButtonType buttonType=new ButtonType("a");
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Salir");
        alert.setHeaderText("¿Seguro que quieres cerrar del juego?");
        alert.setContentText("Estas a punto de salir de la aplicación");
        if(alert.showAndWait().get()== ButtonType.OK){
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    public void azul(ActionEvent event) throws IOException {
        JuegoController.mesa.setColorMesa("B");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    @FXML
    public void amarillo(ActionEvent event) throws IOException {
        JuegoController.mesa.setColorMesa("Y");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    @FXML
    public void rojo(ActionEvent event) throws IOException {
        JuegoController.mesa.setColorMesa("R");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();


    }
    @FXML
    public void verde(ActionEvent event) throws IOException {
        JuegoController.mesa.setColorMesa("G");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    @FXML
    public void iniciarGuardado(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("Juego.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        stage.setScene(scene);
        stage.show();
        JuegoController.usarJson();
    }
}