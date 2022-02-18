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
    }
    
}
