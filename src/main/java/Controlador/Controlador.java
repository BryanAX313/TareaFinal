/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Vista.ActualizarUbiLibro;
import Vista.Biblioteca1;
import Vista.ConocerSocios;
import Vista.IngresarLibros;
import Vista.IngresarNuevoSocio;
import Vista.Login;
import Vista.PrestamoLibros;
import Vista.UbicacionLibro1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author braya
 */
public class Controlador implements ActionListener{
    private BaseDatos baseDatos=BaseDatos.getInstancia();
    private ActualizarUbiLibro actulizarUbiLibro;
    private Biblioteca1 bibliotecaP;
    private ConocerSocios conocerSocios;
    private IngresarLibros ingresarLibros;
    private IngresarNuevoSocio ingresarNuevoSocio;
    private Login login;
    private PrestamoLibros prestamosLibros;
    private UbicacionLibro1 ubicacionLibro;

    public Controlador(ActualizarUbiLibro actulizarUbiLibro, Biblioteca1 bibliotecaP, ConocerSocios conocerSocios, IngresarLibros ingresarLibros, IngresarNuevoSocio ingresarNuevoSocio, Login login, PrestamoLibros prestamosLibros, UbicacionLibro1 ubicacionLibro) {
        this.actulizarUbiLibro = actulizarUbiLibro;
        this.bibliotecaP = bibliotecaP;
        this.conocerSocios = conocerSocios;
        this.ingresarLibros = ingresarLibros;
        this.ingresarNuevoSocio = ingresarNuevoSocio;
        this.login = login;
        this.prestamosLibros = prestamosLibros;
        this.ubicacionLibro = ubicacionLibro;
        ///////*****Ventana Actualizar Ubicacion Libro*******////////
        //Botones***
        this.actulizarUbiLibro.getjBtnAceptar().addActionListener(this);
        this.actulizarUbiLibro.getjBtnAtras().addActionListener(this);
        //TextField****
        this.actulizarUbiLibro.getjTxtEstante().addActionListener(this);
        this.actulizarUbiLibro.getjTxtHabitacion().addActionListener(this);
        this.actulizarUbiLibro.getjTxtPiso().addActionListener(this);
        
        ///////*****Ventana Biblioteca*******////////
        this.bibliotecaP.getjMnIngresarLibro().addActionListener(this);
        this.bibliotecaP.getjMnListaSocio().addActionListener(this);
        this.bibliotecaP.getjMnPrestarLibro().addActionListener(this);
        this.bibliotecaP.getjMnUbiLibro().addActionListener(this);
        
        ///////*****Conocer Socios*******////////
        this.conocerSocios.getjBtnAceptar().addActionListener(this);
        this.conocerSocios.getjBtnActualizar().addActionListener(this);
        this.conocerSocios.getjBtnAtras().addActionListener(this);
        
        ///////*****Ingresar Libros*******////////
        ///Botones***
        this.ingresarLibros.getjBtnAtras().addActionListener(this);
        this.ingresarLibros.getjBtnGuardar().addActionListener(this);
        this.ingresarLibros.getjBtnNuevo().addActionListener(this);
        ///TextField***
        this.ingresarLibros.getjTxtAlias().addActionListener(this);
        this.ingresarLibros.getjTxtCodigoLibro().addActionListener(this);
        this.ingresarLibros.getjTxtFecha().addActionListener(this);
        this.ingresarLibros.getjTxtNacionalidad().addActionListener(this);
        this.ingresarLibros.getjTxtTitulo().addActionListener(this);
        
        ///////*****Ingresar Nuevo socio*******////////
        ///Botones***
        this.ingresarNuevoSocio.getjBtnAceptar().addActionListener(this);
        this.ingresarNuevoSocio.getjBtnAtras().addActionListener(this);
        this.ingresarNuevoSocio.getjBtnNuevo().addActionListener(this);
        ///TextField///
        this.ingresarNuevoSocio.getjTxtApellido1().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtApellido2().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtConvencional().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtCprincipal().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtCsecundaria().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtMovil().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtNombre1().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtNombre2().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtNumeracion().addActionListener(this);
        this.ingresarNuevoSocio.getjTxtUsuario().addActionListener(this);
        
        ///////*****Login*******////////
        ///Botones***
        this.login.getjBtnAceptar().addActionListener(this);
        ///TextField***
        this.login.getjTxtApellido().addActionListener(this);
        this.login.getjTxtNombre().addActionListener(this);
        this.login.getjTxtUsuario().addActionListener(this);
        this.login.getjBtnRegistrarse().addActionListener(this);
        
        ///////*****Ubicacion Libro*******////////
        this.ubicacionLibro.getjBtnActualizar().addActionListener(this);
        this.ubicacionLibro.getjBtnAtras().addActionListener(this);
        this.ubicacionLibro.getjBtnBorrar().addActionListener(this);
        this.ubicacionLibro.getjBtnAceptar().addActionListener(this);
        ///////*****Prestamos Libro*******////////
        this.prestamosLibros.getjBtnBuscar().addActionListener(this);
        this.prestamosLibros.getjBtnAtras().addActionListener(this);
        this.prestamosLibros.getjTxtSocio1().addActionListener(this);
        this.prestamosLibros.getjTxtTituloL().addActionListener(this);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
//login
        if(e.getSource().equals(login.getjBtnAceptar())){
           login.dispose();
           bibliotecaP.show();
       }
        if(e.getSource().equals(login.getjBtnRegistrarse())){
           login.dispose();
           ingresarNuevoSocio.show();
       }
        
//BibliotecaP
        
        if(e.getSource().equals(bibliotecaP.getjMnUbiLibro())){
           bibliotecaP.dispose();
           ubicacionLibro.show();
       }
        if(e.getSource().equals(bibliotecaP.getjMnPrestarLibro())){
           bibliotecaP.dispose();
           prestamosLibros.show();
       }
        if(e.getSource().equals(bibliotecaP.getjMnListaSocio())){
            bibliotecaP.dispose();
            conocerSocios.show();
       }if(e.getSource().equals(bibliotecaP.getjMnIngresarLibro())){
            bibliotecaP.dispose();
            ingresarLibros.show();
       }
       
 //IngresarNuevoSocio
        if(e.getSource().equals(ingresarNuevoSocio.getjBtnAtras())){
           ingresarNuevoSocio.dispose();
           login.show();
       }
        if(e.getSource().equals(ingresarNuevoSocio.getjBtnAceptar())){
           
       }
        if(e.getSource().equals(ingresarNuevoSocio.getjBtnNuevo())){
           
       }
//ConocerSocios
        if(e.getSource().equals(conocerSocios.getjBtnAtras())){
           conocerSocios.dispose();
           bibliotecaP.show();
       }
        if(e.getSource().equals(conocerSocios.getjBtnActualizar())){
           
       }
        if(e.getSource().equals(conocerSocios.getjBtnAceptar())){
           ;
       }
//IngresarLibros
        if(e.getSource().equals(ingresarLibros.getjBtnAtras())){
           ingresarLibros.dispose();
           bibliotecaP.show();
       }
        if(e.getSource().equals(ingresarLibros.getjBtnGuardar())){
           
       }
        if(e.getSource().equals(ingresarLibros.getjBtnNuevo())){
           
       }
//PrestamoLibro
        if(e.getSource().equals(prestamosLibros.getjBtnAtras())){
           prestamosLibros.dispose();
           bibliotecaP.show();
       }
        if(e.getSource().equals(prestamosLibros.getjBtnBuscar())){
           
       }
//UbicacionLibro1
        if(e.getSource().equals(ubicacionLibro.getjBtnAtras())){
           ubicacionLibro.dispose();
           bibliotecaP.show();
       }
        if(e.getSource().equals(ubicacionLibro.getjBtnBorrar())){
           
       }
        if(e.getSource().equals(ubicacionLibro.getjBtnActualizar())){
           
       }
        if(e.getSource().equals(ubicacionLibro.getjBtnAceptar())){
          
       }
    }
    
}
