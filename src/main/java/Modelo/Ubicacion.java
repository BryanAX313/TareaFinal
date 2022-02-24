/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author braya
 */
public class Ubicacion {
    private int numeroPiso,numeroHabitacion,numeroEstante;

    public Ubicacion(int numeroPiso, int numeroHabitacion, int numeroEstante) {
        this.numeroPiso = numeroPiso;
        this.numeroHabitacion = numeroHabitacion;
        this.numeroEstante = numeroEstante;
    }

    @Override
    public String toString() {
        return "N Piso  " + numeroPiso + "     N Habitacion:  " + numeroHabitacion + "     N Estante:  " + numeroEstante ;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public void setNumeroEstante(int numeroEstante) {
        this.numeroEstante = numeroEstante;
    }
    
}
