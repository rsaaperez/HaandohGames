package com.rsaaperez.ral.haandohgames;

/**
 * Created by Raúl on 25/03/2015.
 */
public class Puntuaciones {
    String juego, jugador;
    int puntos, victorias, empates;

    public Puntuaciones() {
    }

    public Puntuaciones(String juego, String jugador, int puntos, int victorias, int empates) {
        this.juego = juego;
        this.jugador = jugador;
        this.puntos = puntos;
        this.victorias = victorias;
        this.empates = empates;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public String toString() {
        return "Puntuaciones{" +
                "juego='" + juego + '\'' +
                ", jugador='" + jugador + '\'' +
                ", puntos=" + puntos +
                ", victorias=" + victorias +
                ", empates=" + empates +
                '}';
    }
}
