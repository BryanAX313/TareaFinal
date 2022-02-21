/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

import Controlador.Controlador;
import Vista.ActualizarUbiLibro;
import Vista.Biblioteca1;
import Vista.ConocerSocios;
import Vista.DireccionSocio;
import Vista.IngresarLibros;
import Vista.IngresarNuevoSocio;
import Vista.Login;
import Vista.PrestamoLibros;
import Vista.UbicacionLibro1;
import Vista.Autor1;
import Vista.CatalogoLibros;

/**
 *
 * @author Gabriela
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Login login=new Login();
       ActualizarUbiLibro  actulizarUbiLibro=new ActualizarUbiLibro();
       Biblioteca1 bibliotecaP=new Biblioteca1();
       bibliotecaP.setVisible(true);
       ConocerSocios conocerSocios=new ConocerSocios();
       IngresarLibros ingresarLibros=new IngresarLibros();
       IngresarNuevoSocio ingresarNuevoSocio =new IngresarNuevoSocio();
       PrestamoLibros prestamosLibros=new PrestamoLibros();
       UbicacionLibro1 ubicacionLibro=new UbicacionLibro1();
       DireccionSocio direccionSocio =new DireccionSocio();
       Autor1 autor =new Autor1();
       CatalogoLibros cat = new CatalogoLibros();
       Controlador control=new Controlador( 
               actulizarUbiLibro,
               bibliotecaP,
               conocerSocios,
               ingresarLibros,
               ingresarNuevoSocio,
               login,prestamosLibros,
               ubicacionLibro,
               direccionSocio,
               autor,cat
       );
       
       Libro lb=new Libro ("123","EDO",true,new Ubicacion(1,1,1),"");
       Libro lb2=new Libro ("124","EDO",true,new Ubicacion(2,1,1),"");
       Libro lb3=new Libro ("125","EDO",true,new Ubicacion(3,1,1),"");
       Libro lb4=new Libro ("126","EDO",true,new Ubicacion(4,1,1),"");
       Libro lb5=new Libro ("127","EDO",true,new Ubicacion(5,1,1),"");
       Libro lb6=new Libro ("128","EDO",true,new Ubicacion(6,1,1),"");
       
       BaseDatos baseDatos = BaseDatos.getInstancia();
       baseDatos.añadiLibro(lb2);
       baseDatos.añadiLibro(lb);
       baseDatos.añadiLibro(lb3);
       baseDatos.añadiLibro(lb4);
       baseDatos.añadiLibro(lb5);
       baseDatos.añadiLibro(lb6);

       
    }
    
}
