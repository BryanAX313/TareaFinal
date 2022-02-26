/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author braya
 */
public class PrestamoLibroClase {
    private ArrayList<Socio> socios;
    private ArrayList<Libro> librosTotal;
    private BaseDatos baseDatos;
    
    private String fecha;
    private Socio socioPrestamo;
    private Libro libroPrestamo;
    
   

    public PrestamoLibroClase() {
        this.socios = new ArrayList();
        this.librosTotal = new ArrayList();
    }

   
    public void actualizar(BaseDatos baseDatos){
        baseDatos= baseDatos;
        socios = baseDatos.getSocios();
        librosTotal=baseDatos.getLibrosTotal(); 
    }
    
    
    
    public int Prestamo(BaseDatos baseDatos){
        actualizar(baseDatos);
        int completado=0;
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).equals(socioPrestamo)) {
                if (baseDatos.buscarLibro(libroPrestamo.getCodigo()).equals("No encontrado")) {
                    completado=0;
                }else{
                    socios.get(i).getLibrosAdquiridos().add(libroPrestamo);
                    if (librosTotal.get(Integer.parseInt(baseDatos.buscarLibro(libroPrestamo.getCodigo()))).isDisponibilidad()) {                      
                        librosTotal.get(Integer.parseInt(baseDatos.buscarLibro(libroPrestamo.getCodigo()))).setDisponibilidad(false);
                        completado=1;
                    }                  
                }
            }
        }
        return completado;
    }
        
    public ArrayList sociosConLibros(){
        ArrayList<Socio> socioPrestamistas=new ArrayList();
        for (int i = 0; i < socios.size(); i++) {
            if (socios.get(i).getLibrosAdquiridos().size()!=0) {
                socioPrestamistas.add(socios.get(i));
            }
        }
        return socioPrestamistas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Socio getSocioPrestamo() {
        return socioPrestamo;
    }

    public void setSocioPrestamo(Socio socioPrestamo) {
        this.socioPrestamo = socioPrestamo;
    }

    public Libro getLibroPrestamo() {
        return libroPrestamo;
    }

    public void setLibroPrestamo(Libro libroPrestamo) {
        this.libroPrestamo = libroPrestamo;
    }
    
}
