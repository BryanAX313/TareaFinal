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
        this.bibliotecaP.getjMnCrearUsuario().addActionListener(this);
        this.bibliotecaP.getjMnIngresarLibro().addActionListener(this);
        this.bibliotecaP.getjMnListaSocio().addActionListener(this);
        this.bibliotecaP.getjMnLogIn().addActionListener(this);
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
        
        ///////*****Ingresar Libros*******////////
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
        
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
