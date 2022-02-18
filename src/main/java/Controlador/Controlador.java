/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Direccion;
import Modelo.Socio;
import Vista.ActualizarUbiLibro;
import Vista.Autor1;
import Vista.Biblioteca1;
import Vista.ConocerSocios;
import Vista.DireccionSocio;
import Vista.IngresarLibros;
import Vista.IngresarNuevoSocio;
import Vista.Login;
import Vista.PrestamoLibros;
import Vista.UbicacionLibro1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
    private DireccionSocio direccionSocio;
    private Autor1 autor;
    private ActualizarUbiLibro actualizarubiLibro;

    public Controlador(ActualizarUbiLibro actulizarUbiLibro, Biblioteca1 bibliotecaP, ConocerSocios conocerSocios, IngresarLibros ingresarLibros, IngresarNuevoSocio ingresarNuevoSocio, Login login, PrestamoLibros prestamosLibros, UbicacionLibro1 ubicacionLibro,DireccionSocio direccionSocio,Autor1 autor) {
        this.actulizarUbiLibro = actulizarUbiLibro;
        this.bibliotecaP = bibliotecaP;
        this.conocerSocios = conocerSocios;
        this.ingresarLibros = ingresarLibros;
        this.ingresarNuevoSocio = ingresarNuevoSocio;
        this.login = login;
        this.prestamosLibros = prestamosLibros;
        this.ubicacionLibro = ubicacionLibro;
        this.direccionSocio = direccionSocio;
        this.autor=autor;
        
        ///////*****Ventana Actualizar Ubicacion Libro*******////////
        this.actulizarUbiLibro.getjBtnAceptar().addActionListener(this);
        this.actulizarUbiLibro.getjBtnAtras().addActionListener(this);
        
        ///////*****Ventana Biblioteca*******////////
        this.bibliotecaP.getjBtnBuscar().addActionListener(this);
        this.bibliotecaP.getjMnIngresarLibro().addActionListener(this);
        this.bibliotecaP.getjMnIngresarUs().addActionListener(this);
        this.bibliotecaP.getjMnListaSocio().addActionListener(this);
        this.bibliotecaP.getjMnPrestarLibro().addActionListener(this);
        this.bibliotecaP.getjMnSociosNoConfiables().addActionListener(this);
        this.bibliotecaP.getjMnUbiLibro().addActionListener(this);
        this.bibliotecaP.getjMnNuevoSocio().addActionListener(this);
            
        ///////*****Conocer Socios*******////////
        this.conocerSocios.getjBtnAceptar().addActionListener(this);
        this.conocerSocios.getjBtnActualizar().addActionListener(this);
        this.conocerSocios.getjBtnAtras().addActionListener(this);
        
        ///////*****Ingresar Libros*******////////
        this.ingresarLibros.getjBtnAtras().addActionListener(this);
        this.ingresarLibros.getjBtnGuardar().addActionListener(this);
        this.ingresarLibros.getjBtnNuevo().addActionListener(this);
        this.ingresarLibros.getjBtnAutor().addActionListener(this);
        this.ingresarLibros.getjBtnEliminar().addActionListener(this);
       
        ///////*****Ingresar Nuevo socio*******////////
        this.ingresarNuevoSocio.getjBtnAceptar().addActionListener(this);
        this.ingresarNuevoSocio.getjBtnCancelar().addActionListener(this);

        ///////****DireccionSocio****//////////////
        this.direccionSocio.getjBtnAtras().addActionListener(this);
        this.direccionSocio.getjBtnGuardar().addActionListener(this);
       
        ///////*****Login*******////////
        this.login.getjBtnAceptar().addActionListener(this);
        this.login.getjBtnCancelar().addActionListener(this);
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
        
        ///////*****Autor*******////////
        this.autor.getjBtnAtras().addActionListener(this);
        this.autor.getjBtnEliminar().addActionListener(this);
        this.autor.getjBtnGuardar().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
//login
        if(e.getSource().equals(login.getjBtnAceptar())){
            if (baseDatos.buscarSocio(login.getjTxtUsuario().getText(),login.getjTxtApellido().getText(), login.getjTxtNombre().getText())==1) {
                JOptionPane.showMessageDialog(null, "Completado");
                limpiarLogin();
                login.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Intente Denuevo");
                limpiarLogin();
            }        
            bibliotecaP.show();
       }
        if(e.getSource().equals(login.getjBtnRegistrarse())){
           login.dispose();
           ingresarNuevoSocio.show();          
           limpiarLogin();
       }
        if (e.getSource().equals(login.getjBtnCancelar())) {
            login.dispose();
            limpiarLogin();
            bibliotecaP.show();
        }
        
//BibliotecaP
        
        if (e.getSource().equals(bibliotecaP.getjMnNuevoSocio())){
            ingresarNuevoSocio.show();
        }
        if (e.getSource().equals(bibliotecaP.getjMnIngresarUs())) {
            login.show();
        }
        
        if(e.getSource().equals(bibliotecaP.getjMnUbiLibro())){
          // bibliotecaP.dispose();
           ubicacionLibro.show();
       }
        if(e.getSource().equals(bibliotecaP.getjMnPrestarLibro())){
           //bibliotecaP.dispose();
           prestamosLibros.show();
       }
        if(e.getSource().equals(bibliotecaP.getjMnListaSocio())){
          //  bibliotecaP.dispose();
            conocerSocios.show();
       }if(e.getSource().equals(bibliotecaP.getjMnIngresarLibro())){
         //   bibliotecaP.dispose();
            ingresarLibros.show();
       }
       
       if(e.getSource().equals(bibliotecaP.getjMnSociosNoConfiables())){
           conocerSocios.show();
       }
       
       
 //IngresarNuevoSocio
        if(e.getSource().equals(ingresarNuevoSocio.getjBtnCancelar())){
           ingresarNuevoSocio.dispose();
           bibliotecaP.show();
           limpiarNuevoSocio();
       }
        if(e.getSource().equals(ingresarNuevoSocio.getjBtnAceptar())){
            ingresarNuevoSocio.dispose();
            bibliotecaP.show();
            String tipoVivienda;
            if (ingresarNuevoSocio.getjComboBox1().getSelectedIndex()==1) {
                tipoVivienda="Casa";
            }else{
                if(ingresarNuevoSocio.getjComboBox1().getSelectedIndex()==2){
                  tipoVivienda="Departamento";  
                }else{
                    if (ingresarNuevoSocio.getjComboBox1().getSelectedIndex()==3) {
                       tipoVivienda="Oficiona";  
                    }else{
                        tipoVivienda="Empresa"; 
                    }
                }
            }
            Socio auxSocio =new Socio(tipoVivienda, ingresarNuevoSocio.getjTxtCI().getText(), ingresarNuevoSocio.getjTxtNombre1().getText()
                    , ingresarNuevoSocio.getjTxtApellido1().getText(), ingresarNuevoSocio.getjTxtApellido2().getText()
                    , ingresarNuevoSocio.getjTxtMovil().getText(),ingresarNuevoSocio.getjTxtConvencional().getText(),ingresarNuevoSocio.getjTxtUsuario().getText());
            
            auxSocio.getDirecciones().add(new Direccion(ingresarNuevoSocio.getjTxtCprincipal().getText()
                    ,ingresarNuevoSocio.getjTxtCsecuandaria().getText(), ingresarNuevoSocio.getjTxtNumeracion().getText()));

            if (baseDatos.añadiSocio(auxSocio)==1) {
               JOptionPane.showMessageDialog(null, "Completado");
            }else{
                JOptionPane.showMessageDialog(null, "ERROR");
            }
            limpiarNuevoSocio();

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
        if(e.getSource().equals(ingresarLibros.getjBtnEliminar())){
           
       }
        if(e.getSource().equals(ingresarLibros.getjBtnAutor())){
           ingresarLibros.dispose();
           autor.show();
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
            ubicacionLibro.dispose();
            actulizarUbiLibro.show();
       }
        if(e.getSource().equals(ubicacionLibro.getjBtnAceptar())){
          
       }
//DireccionSocio
        if(e.getSource().equals(direccionSocio.getjBtnAtras())){
           direccionSocio.dispose();
           ingresarNuevoSocio.show();
        }
        if(e.getSource().equals(direccionSocio.getjBtnGuardar())){
           
       }
///Autor/-*/**/*/*
        if(e.getSource().equals(autor.getjBtnAtras())){
           autor.dispose();
           ingresarLibros.show();
       }
    //    if(e.getSource().equals(direccionSocio.getjBtnEliminar())){
           
      // }
        if(e.getSource().equals(direccionSocio.getjBtnGuardar())){
           
       }
////Actualizar Abucacion de Libro
     if(e.getSource().equals(actulizarUbiLibro.getjBtnAtras())){
          actulizarUbiLibro.dispose();
           ubicacionLibro.show();
       }
        if(e.getSource().equals(actulizarUbiLibro.getjBtnAtras())){
           
       }
    }
    private void limpiarNuevoSocio(){
    ingresarNuevoSocio.getjTxtApellido1().setText("");
    ingresarNuevoSocio.getjTxtCI().setText("");
    ingresarNuevoSocio.getjTxtConvencional().setText("");
    ingresarNuevoSocio.getjTxtCprincipal().setText("");
    ingresarNuevoSocio.getjTxtCsecuandaria().setText("");
    ingresarNuevoSocio.getjTxtMovil().setText("");
    ingresarNuevoSocio.getjTxtNombre1().setText("");
    ingresarNuevoSocio.getjTxtApellido2().setText("");
    ingresarNuevoSocio.getjTxtNumeracion().setText("");
    ingresarNuevoSocio.getjTxtUsuario().setText("");
    }
    private void limpiarLogin(){
        login.getjTxtApellido().setText("");
        login.getjTxtNombre().setText("");
        login.getjTxtUsuario().setText("");
    }
}
