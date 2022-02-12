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
public class BaseDatos {
    private static BaseDatos instancia;
    private ArrayList<Autor>autores=new ArrayList();
    private ArrayList<Socio>socios=new ArrayList();
    private ArrayList<Libro>librosTotal=new ArrayList();

    private BaseDatos() {
    }
    public static BaseDatos getInstancia(){
        if(instancia==null){
            instancia=new BaseDatos();
        }
        return instancia;       
    }
    public boolean añadiSocio(Socio nuevoSocio){
        boolean completado=false;
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).equals(nuevoSocio)) {
                completado=false;
            }else{
                socios.add(nuevoSocio);
                completado=true;
            }
        }
        
        return completado;
    }
    public boolean añadiLibro(Libro nuevolibro){
        boolean completado=false;
        for (int i = 0; i <socios.size(); i++) {
            if (librosTotal.get(i).equals(nuevolibro)) {
                completado=false;
            }else{
                librosTotal.add(nuevolibro);
                completado=true;
            }
        }
        return completado;
    }
    
    public ArrayList librosAutores(String nombreAutor){
        ArrayList<Libro>librosEscritos=new ArrayList();
        for (int i = 0; i <librosTotal.size(); i++) {
            for (int j = 0; j < librosTotal.get(i).getAutores().size(); j++) {
                if (librosTotal.get(i).getAutores().get(j).getNombre().equals(nombreAutor)) {
                    librosEscritos.add(librosTotal.get(i));
                }
            }
        }
        return librosEscritos;
    }
    public boolean Prestamo(Socio socioPrestamo,Libro libroPrestamo){
        boolean completado=false;
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).getCedulaId().equals(socioPrestamo.getCedulaId())) {
                String Prestarlibro=buscarLibro(libroPrestamo.getCodigo());
                if (Prestarlibro.equals("No encontrado")) {
                    completado=false;
                }else{
                    socios.get(i).getLibrosAdquiridos().add(libroPrestamo);
                    librosTotal.get(Integer.parseInt(Prestarlibro)).setDisponibilidad(true);
                    completado=true;
                }
            }
        }
        return completado;
    }
    public String buscarLibro(String codigo){
        String posicionlibroBuscado="";
        for (int i = 0; i <librosTotal.size(); i++) {
            if (librosTotal.get(i).getCodigo().equals(codigo)) {
                posicionlibroBuscado=String.valueOf(i);
            }else{
                posicionlibroBuscado="No encontrado";
            }
        }      
       return posicionlibroBuscado; 
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

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }

    public ArrayList<Libro> getLibrosTotal() {
        return librosTotal;
    }

    public void setLibrosTotal(ArrayList<Libro> librosTotal) {
        this.librosTotal = librosTotal;
    }
    
    
}
