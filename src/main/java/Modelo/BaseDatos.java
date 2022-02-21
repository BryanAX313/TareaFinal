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
    public int buscarSocio(String usuario,String apellido,String nombre){
        int compleatdo=0;
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).getApellido1().equals(apellido)&&socios.get(i).getNombre().equals(nombre)&&socios.get(i).getUsuario().equals(usuario)) {
               compleatdo=1; 
            }
        }
        return compleatdo;
    }
    public int añadiSocio(Socio nuevoSocio){
        int completado=0, existe=0, noeExiste=0;
        System.out.println("No entra");
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).equals(nuevoSocio)) {             
                existe=1;
            }else{
                noeExiste=1;
            }         
        }
        if (noeExiste==1) {
            socios.add(nuevoSocio);
            completado=1;
        }else{
            if (existe==0) {
                socios.add(nuevoSocio);
                completado=1;
            }else{
                completado=0;
            }
        }    
        return completado;
    }
    public int añadiLibro(Libro nuevolibro){
        int completado=0, existe=0;
        for (int i = 0; i <librosTotal.size(); i++) {
            if (librosTotal.get(i).equals(nuevolibro)) {
                 existe=1;
            }  
        }
        if (existe==0) {
            librosTotal.add(nuevolibro);
             completado=1;
        }else{       
            completado=0;
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
    
    public String buscarLibro(String codigo){
        String posicionlibroBuscado="";               
        int bandera=0;
        for (int i = 0; i <librosTotal.size(); i++) {
            
            if (librosTotal.get(i).getCodigo().equals(codigo)) {            
                posicionlibroBuscado="si";
                bandera=i;
            }           
        }
        if (posicionlibroBuscado.equals("si")) {
            posicionlibroBuscado=String.valueOf(bandera);
        }else{
            posicionlibroBuscado="No encontrado";
        }
                    
       return posicionlibroBuscado; 
    }
    public ArrayList<Libro> buscarLibroT(String Titulo){
        ArrayList<Libro>posicionlibroBuscado=new ArrayList();
        for (int i = 0; i <librosTotal.size(); i++) {
            if (librosTotal.get(i).getTitulo().equals(Titulo)) {
                posicionlibroBuscado.add(librosTotal.get(i));
            }
        }      
       return posicionlibroBuscado; 
    }
    public ArrayList LibrosDisponibles(){
        ArrayList<Libro> librosDisponibles=new ArrayList();
        for (int i = 0; i <librosTotal.size(); i++) {
            if (librosTotal.get(i).isDisponibilidad()==true) {
                librosDisponibles.add(librosTotal.get(i));
            }
        }
        return librosDisponibles;
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
