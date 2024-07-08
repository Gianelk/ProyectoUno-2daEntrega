package com.example.proyectouno_entrega_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;

public class MenuController {
    @FXML
    public void IniciarJuego(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UnoApplication.class.getResource("Juego.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        stage.setScene(scene);
        stage.show();
    }
}