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
    private ArrayList<Socio>socios=new ArrayList();
    private ArrayList<Libro>librosTotal=new ArrayList();
    private ArrayList<PrestamoLibroClase>prestamos=new ArrayList();

    private BaseDatos() {
    }
    
    public static BaseDatos getInstancia(){
        if(instancia==null){
            instancia=new BaseDatos();
        }
        return instancia;       
    }
    public Socio buscarSocio(String usuario,String apellido,String nombre){
        Socio compleatdo=null;
        for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).getApellido1().equals(apellido)&&socios.get(i).getNombre().equals(nombre)&&socios.get(i).getUsuario().equals(usuario)) {
               compleatdo=socios.get(i);
            }
        }
        return compleatdo;
        
    }
    
    public int añadiSocio(Socio nuevoSocio){
        int completado=0, existe=0, noeExiste=0;
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
    
    public ArrayList<Socio> sociosRiesgo(){
        ArrayList<Socio> sociosRiesgo= new ArrayList();
        for (int i = 0; i <socios.size(); i++) {
            System.out.println(i);
            if (socios.get(i).getLibrosAdquiridos().size()>9) {
                System.out.println("IF");
                System.out.println(socios.get(i).getCedulaId());
                sociosRiesgo.add(socios.get(i));
               //System.out.println("IF");
                //System.out.println(socios.get(i).getCedulaId());
            }
        }
        return sociosRiesgo; 
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
    public ArrayList<Socio> buscarSocioT(String usuario,String apellido,String nombre){
             ArrayList<Socio>posicionSocioBuscado=new ArrayList();
             for (int i = 0; i <socios.size(); i++) {
            if (socios.get(i).getApellido1().equals(apellido)&&socios.get(i).getNombre().equals(nombre)&&socios.get(i).getUsuario().equals(usuario)) {
            }   
        }      
       return posicionSocioBuscado; 
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

    public ArrayList<PrestamoLibroClase> getPrestamos() {
        return prestamos;
    }

    public void Prestamo(PrestamoLibroClase pres){      
        System.out.println(pres.getSocioPrestamo().getUsuario()+pres.getLibroPrestamo().getTitulo()+pres.getFecha());
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
