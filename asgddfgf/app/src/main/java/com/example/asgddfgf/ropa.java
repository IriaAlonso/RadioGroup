package com.example.asgddfgf;

public class ropa {
    String nombre;
    String talla;
    boolean usado;
    int tipo;

    public int getTipo() {
        return tipo;
    }

    public ropa(String nombre, int tipo, String talla, boolean usado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.talla = talla;
        this.usado = usado;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
    @Override
    public String toString() {
        return "ropa{" +
                "nombre='" + nombre + '\'' +
                ", talla='" + talla + '\'' +
                ", usado=" + usado +
                ", tipo=" + tipo +
                '}';
    }
}
