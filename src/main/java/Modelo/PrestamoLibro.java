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
public class PrestamoLibro {
   private ArrayList<Socio> socios;
   private ArrayList<Libro> librosTotal;
   private BaseDatos baseDatos;

    public PrestamoLibro() {
        this.socios = new ArrayList();
        this.librosTotal = new ArrayList();
    }

   
    public void actualizar(BaseDatos baseDatos){
        baseDatos= baseDatos;
        socios = baseDatos.getSocios();
        librosTotal=baseDatos.getLibrosTotal(); 
    }
    
    public ArrayList sociosRiesgo(){
        ArrayList<Socio> sociosRiesgo= new ArrayList();
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).getLibrosAdquiridos().size()==10) {
                sociosRiesgo.add(socios.get(i));
            }
        }
        return sociosRiesgo; 
    }
    
    public boolean Prestamo(Socio socioPrestamo,Libro libroPrestamo){
        boolean completado=false;
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).getCedulaId().equals(socioPrestamo.getCedulaId())) {
                String Prestarlibro=baseDatos.buscarLibro(libroPrestamo.getCodigo());
                if (Prestarlibro.equals("No encontrado")) {
                    completado=false;
                }else{
                    socios.get(i).getLibrosAdquiridos().add(libroPrestamo);
                    librosTotal.get(Integer.parseInt(Prestarlibro)).setDisponibilidad(false);
                    completado=true;
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
    
}
