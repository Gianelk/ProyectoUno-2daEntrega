package com.example.proyectouno_entrega_2;

public class Carta {
    String numeroCarta;
    String color;
    String url;

    public Carta(String numeroCarta, String color, String url) {
        this.url = url;
        this.color = color;
        this.numeroCarta = numeroCarta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Carta() {
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
