/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Autor;
import Modelo.BaseDatos;
import Modelo.Direccion;
import Modelo.Socio;
import Modelo.Libro;
import Modelo.PrestamoLibroClase;
import Modelo.Ubicacion;
import Vista.ActualizarUbiLibro;
import Vista.Autor1;
import Vista.Biblioteca1;
import Vista.CatalogoLibros;
import Vista.ConocerSocios;
import Vista.DireccionSocio;
import Vista.IngresarLibros;
import Vista.IngresarNuevoSocio;
import Vista.Login;
import Vista.PrestamoLibros;
import Vista.UbicacionLibro1;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    private CatalogoLibros catalogoLibros;
    private PrestamoLibroClase prestamoLibroC;

    public Controlador(ActualizarUbiLibro actulizarUbiLibro, Biblioteca1 bibliotecaP, ConocerSocios conocerSocios, IngresarLibros ingresarLibros, IngresarNuevoSocio ingresarNuevoSocio, Login login, PrestamoLibros prestamosLibros, UbicacionLibro1 ubicacionLibro,DireccionSocio direccionSocio,Autor1 autor,CatalogoLibros catalogoLibros,PrestamoLibroClase prestamoLibroC) {
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
        this.catalogoLibros =catalogoLibros;
        this.prestamoLibroC=prestamoLibroC;
        
        
        ///////*****Ventana Actualizar Ubicacion Libro*******////////
        this.actulizarUbiLibro.getjBtnAceptar().addActionListener(this);
        this.actulizarUbiLibro.getjBtnAtras().addActionListener(this);
        this.actulizarUbiLibro.getjBtnLimpiar().addActionListener(this);
        
        ///////*****Ventana Biblioteca*******////////
        this.bibliotecaP.getjBtnBuscar().addActionListener(this);
        this.bibliotecaP.getjMnIngresarLibro().addActionListener(this);
        this.bibliotecaP.getjMnIngresarUs().addActionListener(this);
        this.bibliotecaP.getjMnListaSocio().addActionListener(this);
        this.bibliotecaP.getjMnPrestarLibro().addActionListener(this);
        this.bibliotecaP.getjMnSociosNoConfiables().addActionListener(this);
        this.bibliotecaP.getjMnUbiLibro().addActionListener(this);
        this.bibliotecaP.getjMnNuevoSocio().addActionListener(this);
        this.bibliotecaP.getjMnAutores().addActionListener(this);
            
        ///////*****Conocer Socios*******////////
        this.conocerSocios.getjBtnEliminar().addActionListener(this);
        this.conocerSocios.getjBtnNuevo().addActionListener(this);
        this.conocerSocios.getjBtnAtras().addActionListener(this);
        
        ///////*****Ingresar Libros*******////////
        this.ingresarLibros.getjBtnAtras().addActionListener(this);
        this.ingresarLibros.getjBtnGuardar().addActionListener(this);
        this.ingresarLibros.getjBtnAutor().addActionListener(this);
       
       
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
        this.login.getBtnCerrarSesion().addActionListener(this);
       
        ///////*****Ubicacion Libro*******////////
        this.ubicacionLibro.getjBtnActualizar().addActionListener(this);
        this.ubicacionLibro.getjBtnAtras().addActionListener(this);
        this.ubicacionLibro.getjBtnAceptar().addActionListener(this);
        
        ///////*****Prestamos Libro*******////////
        this.prestamosLibros.getjBtnBuscar().addActionListener(this);
        this.prestamosLibros.getBtnAtras().addActionListener(this);
        this.prestamosLibros.getjTxtTituloL().addActionListener(this);
        
        ///////*****Autor*******////////
        this.autor.getjBtnAtras().addActionListener(this);
        this.autor.getjBtnGuardar().addActionListener(this);
        this.autor.getjBntLimpiar().addActionListener(this);
        this.autor.getjTxtAlias().addActionListener(this);
        this.autor.getjTxtNacimiento().addActionListener(this);
        this.autor.getjTxtNacionalidad().addActionListener(this);
        this.autor.getjTxtNombre().addActionListener(this); 
        
        //////******Catalogo Libros*****/////
        this.catalogoLibros.getjBtnEliminar().addActionListener(this);
        this.catalogoLibros.getjBtnBuscar().addActionListener(this);
        this.catalogoLibros.getjBtnModificar().addActionListener(this);
        this.catalogoLibros.getjBtnSalir().addActionListener(this);
        this.catalogoLibros.getjBtnPrestar().addActionListener(this);
        this.catalogoLibros.getjBtnActualizar().addActionListener(this);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

// Catalogo Libros

        if (e.getSource().equals(catalogoLibros.getjBtnActualizar())) {
            ArrayList<Libro> lista =new ArrayList();
            if (catalogoLibros.getjLblBandera().getText().equals("LIBROS ESCRITOS")) {
                lista=baseDatos.librosAutores(prestamosLibros.getjTxtTituloL().getText());
                mostrar(lista);
            }else{
                if (bibliotecaP.getjTxtBuscar().getText().length()!=0) {
                    lista=baseDatos.buscarLibroT(bibliotecaP.getjTxtBuscar().getText());
                }else{
                    lista=baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText());
                }
                mostrar(lista);
            }
        }
        
         if (e.getSource().equals(catalogoLibros.getjBtnSalir())) {
            catalogoLibros.dispose();
            limpiarConocerSocios();
            bibliotecaP.show();
        }
        if (e.getSource().equals(catalogoLibros.getjBtnEliminar())) {
            
           try{
               int c;
                c=catalogoLibros.getjTblLibros().getSelectedRow();
                String g =String.valueOf(catalogoLibros.getjTblLibros().getModel().getValueAt(c,0));
               if (baseDatos.buscarLibro(g).equals("No encontrado")) {
                   JOptionPane.showMessageDialog(null, "Ya no quedan ejemplares");
               }else{
                   baseDatos.getLibrosTotal().remove(Integer.parseInt(baseDatos.buscarLibro(g)));
               } 
           }catch (Exception x){ 
               JOptionPane.showMessageDialog(null, "Ecojer una Fila");
           }
            ArrayList<Libro> lista =new ArrayList();
            if (catalogoLibros.getjLblBandera().getText().equals("LIBROS ESCRITOS")) {
                lista=baseDatos.librosAutores(prestamosLibros.getjTxtTituloL().getText());
                mostrar(lista);
            }else{
                if (bibliotecaP.getjTxtBuscar().getText().length()!=0) {
                    lista=baseDatos.buscarLibroT(bibliotecaP.getjTxtBuscar().getText());
                }else{
                    lista=baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText());
                }
                mostrar(lista);
            }
            
        }
        if (e.getSource().equals(catalogoLibros.getjBtnBuscar())) {
            ubicacionLibro.setLocation(catalogoLibros.getX(),catalogoLibros.getY()+304);
            ubicacionLibro.show();
        }
        
        
        if (e.getSource().equals(catalogoLibros.getjBtnModificar())) {
            
            try{ 
                int c;
                Libro aux;  
                c=catalogoLibros.getjTblLibros().getSelectedRow();
               limpiarNuevoLibro();
               ingresarLibros.setLocation(catalogoLibros.getX()+355,catalogoLibros.getY()+304);
               ingresarLibros.show();
               llenarVentanaNuevoLibro(
                       baseDatos.getLibrosTotal().get(
                               Integer.parseInt(
                                       baseDatos.buscarLibro(
                                               String.valueOf(
                                                       catalogoLibros.getjTblLibros().getModel().getValueAt((c),0)
                                               )
                                       )
                               )
                       )
               );
              
         }catch(Exception x){
        JOptionPane.showMessageDialog(null,"Escojer una fila");
          }
            

        }
        if (e.getSource().equals(catalogoLibros.getjBtnPrestar())) { 
            prestamoLibroC.actualizar(baseDatos);
            
                          
           try{
               int c;
                c=catalogoLibros.getjTblLibros().getSelectedRow();
            
                String g =String.valueOf(catalogoLibros.getjTblLibros().getModel().getValueAt(c,0));    
               if (baseDatos.buscarLibro(g).equals("No encontrado")) {
                   JOptionPane.showMessageDialog(null, "Ya no quedan ejemplares");
               }else{
                    
                    prestamoLibroC.setLibroPrestamo(baseDatos.getLibrosTotal().get(
                                   Integer.parseInt(baseDatos.buscarLibro(g)
                                   )));
                    prestamoLibroC.setSocioPrestamo(baseDatos.buscarSocio(
                                   login.getjTxtUsuario().getText(),
                                   login.getjTxtApellido().getText(),
                                   login.getjTxtNombre().getText()
                    ));
                    try{
                        int año=Integer.parseInt(catalogoLibros.getjTxtAño().getText());
                        int dia=Integer.parseInt(catalogoLibros.getjTxtDia().getText());
                        int mes=Integer.parseInt(catalogoLibros.getjTxtMes().getText());
                        
                         prestamoLibroC.setFecha(
                            catalogoLibros.getjTxtAño().getText()+"/"
                                    +catalogoLibros.getjTxtDia().getText()+"/"
                                    +catalogoLibros.getjTxtMes().getText());
                        if (prestamoLibroC.Prestamo(baseDatos)==1) {
                        baseDatos.getPrestamos().add(prestamoLibroC);
                        }

                    }catch(Exception h){
                        JOptionPane.showMessageDialog(null, "Fecha mal ingresada");
                    }
               } 
           }catch (Exception x){ 
               JOptionPane.showMessageDialog(null, "Ecojer una Fila");
           }
            ArrayList<Libro> lista =new ArrayList();
            
            if (catalogoLibros.getjLblBandera().getText().equals("LIBROS ESCRITOS")) {
                lista=baseDatos.librosAutores(prestamosLibros.getjTxtTituloL().getText());
                mostrar(lista);
            }else{
                if (bibliotecaP.getjTxtBuscar().getText().length()!=0) {
                    lista=baseDatos.buscarLibroT(bibliotecaP.getjTxtBuscar().getText());
                }else{
                    lista=baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText());
                }
                mostrar(lista);
            }
        }
        System.out.println("");
        
//login3
        if(e.getSource().equals(login.getjBtnAceptar())){
            if (baseDatos.buscarSocio(login.getjTxtUsuario().getText(),login.getjTxtApellido().getText(), login.getjTxtNombre().getText())!=null) {
                JOptionPane.showMessageDialog(null, "Completado");               
                login.dispose();
                login.getjTxtApellido().setEnabled(false);
                login.getjTxtNombre().setEnabled(false);
                login.getjTxtUsuario().setEnabled(false);
                prestamosLibros.getJlblUs().setText(login.getjTxtUsuario().getText());
            }else{
                JOptionPane.showMessageDialog(null, "Intente Denuevo");                
            }        
            bibliotecaP.show();
       }
        if (e.getSource().equals(login.getBtnCerrarSesion())) {
            login.getjTxtApellido().setEnabled(true);
            login.getjTxtNombre().setEnabled(true);
            login.getjTxtUsuario().setEnabled(true);
            prestamosLibros.getJlblUs().setText("No Iniciado Sesion");
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
            //bibliotecaP.dispose();
            ingresarNuevoSocio.show();
        }
        
        if (e.getSource().equals(bibliotecaP.getjMnIngresarUs())) {
            bibliotecaP.dispose();
            login.show();
        }
        if (e.getSource().equals(bibliotecaP.getjMnAutores())) {
           
            if (prestamosLibros.getJlblUs().getText().equals("No Iniciado Sesion")) {
                JOptionPane.showMessageDialog(null, "Necesita Ingresar Sesion ");
            }else{
                bibliotecaP.dispose();
                prestamosLibros.getjLblBuscar().setText("Autor");
                prestamosLibros.getjLblInstruccion().setText("Escriba el nombre del autor");
                Color c= new Color(241,169,89);
                prestamosLibros.getjPanel1().setBackground(c);
                
                prestamosLibros.setLocation(bibliotecaP.getX()+10,bibliotecaP.getY()+30);
                prestamosLibros.show();  
            }
        }
        if(e.getSource().equals(bibliotecaP.getjMnUbiLibro())){
           //bibliotecaP.dispose();
           ubicacionLibro.show();
       }
        if(e.getSource().equals(bibliotecaP.getjMnPrestarLibro())){
           bibliotecaP.dispose();
           prestamosLibros.getjLblBuscar().setText("Titulo");
            prestamosLibros.getjLblInstruccion().setText("Escriba el titulo del libro");
            Color c= new Color(247,191,125);
            prestamosLibros.getjPanel1().setBackground(c);
           prestamosLibros.setLocation(bibliotecaP.getX()+10,bibliotecaP.getY()+30);
           prestamosLibros.show();
       }
        if(e.getSource().equals(bibliotecaP.getjMnListaSocio())){
            
            if (prestamosLibros.getJlblUs().getText().equals("No Iniciado Sesion")) {
                JOptionPane.showMessageDialog(null, "Necesita Ingresar Sesion para Conocer lista de Socios");
            }else{
                ArrayList<Socio> lista =new ArrayList();
                bibliotecaP.dispose();
                    mostrarS();
                    conocerSocios.show();          
            }
            conocerSocios.getjLblBandera().setText("SOCIOS TOTALES");
       }
        if(e.getSource().equals(bibliotecaP.getjMnIngresarLibro())){
            //bibliotecaP.dispose();
            ingresarLibros.show();
       }
       
       if(e.getSource().equals(bibliotecaP.getjMnSociosNoConfiables())){
           if (prestamosLibros.getJlblUs().getText().equals("No Iniciado Sesion")) {
                JOptionPane.showMessageDialog(null, "Necesita Ingresar Sesion para Conocer lista de Socios");
            }else{
                ArrayList<Socio> lista =new ArrayList();
                    mostrarPlus();
                    conocerSocios.show();          
            }
           conocerSocios.getjLblBandera().setText("SOCIOS RIESGO");
           
       }
       if(e.getSource().equals(bibliotecaP.getjBtnBuscar())){
           
           if (prestamosLibros.getJlblUs().getText().equals("No Iniciado Sesion")) {
                JOptionPane.showMessageDialog(null, "Necesita Ingresar Sesion para pedir un libro");
            }else{
                             
                ArrayList<Libro> lista =new ArrayList();
                if (baseDatos.buscarLibroT(bibliotecaP.getjTxtBuscar().getText()).size()==0) {
                    JOptionPane.showMessageDialog(null, "Libro No encontrado");
                }else{
                    catalogoLibros.show(); 
                    bibliotecaP.dispose();
                    lista=baseDatos.buscarLibroT(bibliotecaP.getjTxtBuscar().getText());
                    mostrar(lista);
                }      
            }

           
           
       }
       
 //IngresarNuevoSocio
        if(e.getSource().equals(ingresarNuevoSocio.getjBtnCancelar())){
           ingresarNuevoSocio.dispose();
           //bibliotecaP.show();
           limpiarNuevoSocio();
       }
        if(e.getSource().equals(ingresarNuevoSocio.getjBtnAceptar())){
           
            String tipoVivienda;
            if (ingresarNuevoSocio.getjComboBox1().getSelectedIndex()==0) {
                tipoVivienda="Casa";
            }else{
                if(ingresarNuevoSocio.getjComboBox1().getSelectedIndex()==1){
                  tipoVivienda="Departamento";  
                }else{
                    if (ingresarNuevoSocio.getjComboBox1().getSelectedIndex()==2) {
                       tipoVivienda="Oficiona";  
                    }else{
                        tipoVivienda="Empresa"; 
                    }
                }
            }
            String Apellido="";
            if (ingresarNuevoSocio.getjTxtApellido2().getText().equals("      ( OPCIONAL )")) {
                Apellido="No Proporcionado";
            }else{
                Apellido=ingresarNuevoSocio.getjTxtApellido2().getText();
            }
            String num="";
            if (ingresarNuevoSocio.getjTxtConvencional().getText().equals("     ( OPCIONAL )")) {
                num="No Proporcionado";
            }else{
                num=ingresarNuevoSocio.getjTxtConvencional().getText();
            }
            Socio auxSocio =new Socio(
                    tipoVivienda, 
                    ingresarNuevoSocio.getjTxtCI().getText(), 
                    ingresarNuevoSocio.getjTxtNombre1().getText(), 
                    ingresarNuevoSocio.getjTxtApellido1().getText(), 
                    Apellido, 
                    ingresarNuevoSocio.getjTxtMovil().getText(),
                    num,
                    ingresarNuevoSocio.getjTxtUsuario().getText());
            
            auxSocio.getDirecciones().add(new Direccion(ingresarNuevoSocio.getjTxtCprincipal().getText()
                    ,ingresarNuevoSocio.getjTxtCsecuandaria().getText(), ingresarNuevoSocio.getjTxtNumeracion().getText()));
            int bandera=0;
            if (baseDatos.añadiSocio(auxSocio)==1) {
                System.out.println(tipoVivienda);
                JOptionPane.showMessageDialog(null, "Completado");
                ingresarNuevoSocio.dispose();
                limpiarNuevoSocio();
            }else{
                JOptionPane.showMessageDialog(null, "ERROR");
                bandera=1;
            }
            int x=1,c=0;            
        c=conocerSocios.getjTbtlSocios().getSelectedRow();      
        if (c!=-1) {                  
            String g =String.valueOf(conocerSocios.getjTbtlSocios().getModel().getValueAt(c,0));
            Socio auxS=datosSocio();               
      
            baseDatos.getSocios().remove(baseDatos.buscarSocio(g, g, g));
            
            x=0;

            ArrayList<Socio> Mat =new ArrayList();
            Mat=baseDatos.buscarSocioT(g, g, g);
            mostrarS();
        }else{
          for (int i = 0; i < baseDatos.getSocios().size(); i++) {
            if (baseDatos.getSocios().get(i).getDirecciones().size()==0) {
                    baseDatos.getSocios().remove(baseDatos.getSocios().get(i));
                    x=1;
                }else{
                    x=0;
                }
            }  
        }
        if (x==0) {
            if (bandera==0) {
                JOptionPane.showMessageDialog(null, "Se guardo con exito");
                ingresarNuevoSocio.dispose();
                bibliotecaP.show();
                limpiarNuevoSocio();
            }           
            
        }else{
            JOptionPane.showMessageDialog(null, "Socio ya registrado no se guardo");

        }
           
      
         
       }
        
//ConocerSocios
        if(e.getSource().equals(conocerSocios.getjBtnAtras())){
        conocerSocios.dispose();
        bibliotecaP.show();
        }
      
        if(e.getSource().equals(conocerSocios.getjBtnEliminar())){
            int c;
            c=conocerSocios.getjTbtlSocios().getSelectedRow();
               
             String usuario = String.valueOf(conocerSocios.getjTbtlSocios().getModel().getValueAt(c,0)); 
             String nombre = String.valueOf(conocerSocios.getjTbtlSocios().getModel().getValueAt(c,1));
             String apellido = String.valueOf(conocerSocios.getjTbtlSocios().getModel().getValueAt(c,3));
           try{   
            baseDatos.getSocios().remove(baseDatos.buscarSocio(usuario,apellido ,nombre));            
           }catch (Exception x){ 
                
               JOptionPane.showMessageDialog(null, "Ecojer una Fila");
           }
            if (conocerSocios.getjLblBandera().getText().equals("SOCIOS TOTALES")) {
                mostrarS();
            }else{
                mostrarPlus();
            }
                  
           
       }
      
        if(e.getSource().equals(conocerSocios.getjBtnNuevo())){
           conocerSocios.dispose();
           ingresarNuevoSocio.show();
       }
       
//IngresarLibros
        if(e.getSource().equals(ingresarLibros.getjBtnAtras())){
           ingresarLibros.dispose();
          // bibliotecaP.show();
       }
        
        if(e.getSource().equals(ingresarLibros.getjBtnAutor())){ 
            try{
            Libro auxLibro=datosLibro();
            int x = baseDatos.añadiLibro(auxLibro);
            autor.show();
            }
            catch(Exception b){
               JOptionPane.showMessageDialog(null, "Llenar datos de Libro");
                 JOptionPane.showMessageDialog(null, " Verificar que no existan espacios antes y despues de escribir");
                    }
        }
        
        if(e.getSource().equals(ingresarLibros.getjBtnGuardar())){  
        int x=1,c=0;            
        c=catalogoLibros.getjTblLibros().getSelectedRow();
            System.out.println(c);
            try{
        if (c!=(-1)) {                  
            String g =String.valueOf(catalogoLibros.getjTblLibros().getModel().getValueAt(c,0));
            String codigoAux =ingresarLibros.getjTxtCodigoLibro().getText();
            Libro auxLibro=datosLibro();               
            if (baseDatos.buscarLibro("PRUEBA").equals("No encontrado")) {
                baseDatos.añadiLibro(auxLibro);
            }
            for (int i = 0; i < baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(g))).getAutores().size() ; i++) {
                System.out.println(baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(g))).getAutores().get(i).getNombre());
                 baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(auxLibro.getCodigo()))).agregarAutor(baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(g))).getAutores().get(i));
            }
            
            baseDatos.getLibrosTotal().remove(Integer.parseInt(baseDatos.buscarLibro(g)));
            baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(auxLibro.getCodigo()))).setCodigo(codigoAux);
            x=0;

            ArrayList<Libro> lista =new ArrayList();
            lista=baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText());
            mostrar(lista);
        }else{
             Libro auxLibro=datosLibro();
             String codigoAux =ingresarLibros.getjTxtCodigoLibro().getText();
             baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(auxLibro.getCodigo()))).setCodigo(codigoAux);
          for (int i = 0; i < baseDatos.getLibrosTotal().size(); i++) {
            if (baseDatos.getLibrosTotal().get(i).getAutores().size()==0) {
                    baseDatos.getLibrosTotal().remove(baseDatos.getLibrosTotal().get(i));
                    x=1;
                }else{
                    x=0;
                }
            }  
        }
        if (x==0) {
           JOptionPane.showMessageDialog(null, "Se guardo con exito el libro");
           ingresarLibros.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Libro ya registrado no se guardo");

        }
        limpiarNuevoLibro();
         }
        catch(Exception v){
        JOptionPane.showMessageDialog(null, "Ingresar datos del LIBRO");
        }
}
       
//PrestamoLibro
        if(e.getSource().equals(prestamosLibros.getBtnAtras())){
           prestamosLibros.dispose();
           bibliotecaP.show();
       }
        if(e.getSource().equals(prestamosLibros.getjBtnBuscar())){
            bibliotecaP.dispose();
            bibliotecaP.getjTxtBuscar().setText("");
            if (prestamosLibros.getJlblUs().getText().equals("No Iniciado Sesion")) {
                JOptionPane.showMessageDialog(null, "Necesita Ingresar Sesion para pedir un libro");
            }else{
                catalogoLibros.show();               
                ArrayList<Libro> lista =new ArrayList();
                if (prestamosLibros.getjLblBuscar().getText().equals("Titulo")) {
                    catalogoLibros.getjLblBandera().setText("LIBROS CON ESE TITULO");
                    if (baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText()).size()==0) {
                        JOptionPane.showMessageDialog(null, "Libro No encontrado");      
                    }else{
                        prestamosLibros.dispose();
                        lista=baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText());
                        mostrar(lista);
                    }
                }
                if (prestamosLibros.getjLblBuscar().getText().equals("Autor")) {
                    catalogoLibros.getjLblBandera().setText("LIBROS ESCRITOS");
                   if (baseDatos.librosAutores(prestamosLibros.getjTxtTituloL().getText()).size()==0) {
                        JOptionPane.showMessageDialog(null, "Libro No encontrado");
                    }else{
                    prestamosLibros.dispose();
                    lista=baseDatos.librosAutores(prestamosLibros.getjTxtTituloL().getText());
                    mostrar(lista); 
                    }
                }
            }
        }
//UbicacionLibro1
        if(e.getSource().equals(ubicacionLibro.getjBtnAtras())){
           ubicacionLibro.dispose();
           //bibliotecaP.show();
       }

        if(e.getSource().equals(ubicacionLibro.getjBtnAceptar())){
            
            if (baseDatos.buscarLibro(ubicacionLibro.getjTxtCodigo().getText()).equals("No encontrado")) {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }else{
                Libro ubiAux = baseDatos.getLibrosTotal().get(
                        Integer.parseInt(
                                baseDatos.buscarLibro(
                                        ubicacionLibro.getjTxtCodigo().getText()
                                )
                        )
                );
                
                ubicacionLibro.getjLblArea().setText( baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(ubicacionLibro.getjTxtCodigo().getText()))).getArea());
                ubicacionLibro.getjLblEstante().setText(ubiAux.getUbicacion().getNumeroEstante()+"");
                ubicacionLibro.getjLblHabitacion().setText(ubiAux.getUbicacion().getNumeroHabitacion()+"");
                ubicacionLibro.getjLblPiso().setText(ubiAux.getUbicacion().getNumeroPiso()+"");
            }
        }
        if (e.getSource().equals(ubicacionLibro.getjBtnActualizar())) {
            actulizarUbiLibro.setLocation(ubicacionLibro.getX()+360,ubicacionLibro.getY());
            actulizarUbiLibro.getjTxtEstante().setText(ubicacionLibro.getjLblEstante().getText());
            actulizarUbiLibro.getjTxtHabitacion().setText(ubicacionLibro.getjLblHabitacion().getText());
            actulizarUbiLibro.getjTxtPiso().setText(ubicacionLibro.getjLblPiso().getText());
            actulizarUbiLibro.show();
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
        
         if(e.getSource().equals(autor.getjBntLimpiar())){
           autor.getjTxtAlias().setText("OPCIONAL");
           autor.getjTxtNacimiento().setText(null);
           autor.getjTxtNacionalidad().setText(null);
           autor.getjTxtNombre().setText(null);
       }
        if(e.getSource().equals(autor.getjBtnGuardar())){
            String alias="";
            try{
                if (alias.equals("OPCIONAL")||alias.length()==0) {
                alias="No `Propircionado";
            }
            Autor auxAutor=new Autor(                 
                    autor.getjTxtNombre().getText(),
                    alias,
                    autor.getjTxtNacionalidad().getText(), 
                    autor.getjTxtNacimiento().getText()
            );
            if (baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro("PRUEBA"))).agregarAutor(auxAutor)==1) {
                    JOptionPane.showMessageDialog(null, "Autor Ingresado");
                    autor.getjTxtAlias().setText("OPCIONAL");
                    autor.getjTxtNacimiento().setText(null);
                    autor.getjTxtNacionalidad().setText(null);
                    autor.getjTxtNombre().setText(null);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Autor NoIngresado");
            }
            }catch(Exception x){
                JOptionPane.showMessageDialog(null, "Autor No Ingresado");
            }
                    
        }
    
////Actualizar Ubucacion de Libro

     if(e.getSource().equals(actulizarUbiLibro.getjBtnAtras())){
          actulizarUbiLibro.dispose();
           ubicacionLibro.show();
       }
        if(e.getSource().equals(actulizarUbiLibro.getjBtnAceptar())){
           try{
               Ubicacion ubi = new Ubicacion(
                    Integer.parseInt(actulizarUbiLibro.getjTxtPiso().getText()),
                    Integer.parseInt(actulizarUbiLibro.getjTxtHabitacion().getText()),
                    Integer.parseInt(actulizarUbiLibro.getjTxtEstante().getText())
            );
               String[] area={"Generalidades","Filosofia","Religion","Ciencias Sociales","Filogia","Ciencias Naturales","Tecnicas y Ciencias Practicas","Arte y Literatura","Historia"};           
            for (int i = 0; i < baseDatos.getLibrosTotal().size(); i++) {
                if ( baseDatos.getLibrosTotal().get(i).getCodigo().equals(ubicacionLibro.getjTxtCodigo().getText())) {
                        if (baseDatos.getLibrosTotal().get(i).actualizarUbi(ubi, area[ actulizarUbiLibro.getjCbxArea().getSelectedIndex()])==1) {
                        JOptionPane.showMessageDialog(null, "Actualizado");
                        
                        actulizarUbiLibro.getjTxtEstante().setText(null);
                        actulizarUbiLibro.getjTxtHabitacion().setText(null);
                        actulizarUbiLibro.getjTxtPiso().setText(null);
                        
                         actulizarUbiLibro.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "No actualizado");
                    }
                }
            }
            ArrayList<Libro> lista =new ArrayList();
            if (catalogoLibros.getjLblBandera().getText().equals("LIBROS ESCRITOS")) {
                lista=baseDatos.librosAutores(prestamosLibros.getjTxtTituloL().getText());
                mostrar(lista);
            }else{
                lista=baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText());
                mostrar(lista);
            }
           }catch(Exception x){
                JOptionPane.showMessageDialog(null, "Autor No Ingresado");
            }
           
       }
        if(e.getSource().equals(actulizarUbiLibro.getjBtnLimpiar())){
          actulizarUbiLibro.getjTxtEstante().setText(null);
          actulizarUbiLibro.getjTxtHabitacion().setText(null);
          actulizarUbiLibro.getjTxtPiso().setText(null);
       }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////FUNCIONES ADICIONALES /////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private void mostrar(ArrayList<Libro> ar){
        String matris[][]=new String[ar.size()][5];
        
        for (int i = 0; i <ar.size() ; i++) {
            matris[i][0]=ar.get(i).getArea();
            matris[i][0]=ar.get(i).getCodigo();
            matris[i][1]=ar.get(i).getTitulo();
            matris[i][4]=ar.get(i).getAutores().toString();
            matris[i][3]=ar.get(i).getUbicacion().toString();
            if (ar.get(i).isDisponibilidad()==true) {
                matris[i][2]="Disponible";
            }else{
                matris[i][2]="No Disponible";
            }
            catalogoLibros.getjTblLibros().setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Codigo", "Titulo", "Disponibilidad", "Ubicacion", "Autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
            
        }       
    }
    
        private void mostrarPlus(){
        
        String Mat[][]=new String[baseDatos.getSocios().size()][10];
         Socio aux;
        for (int i = 0; i <baseDatos.sociosRiesgo().size() ; i++) {
            aux=baseDatos.sociosRiesgo().get(i);
            Mat[i][0]=aux.getUsuario();
            Mat[i][1]=aux.getNombre();
            Mat[i][2]=aux.getApellido2();
            Mat[i][3]=aux.getApellido1();
            Mat[i][4]=aux.getTelefonoConvencional();      
            Mat[i][5]=aux.getTelefonoMovil();
            Mat[i][6]=aux.getLibrosAdquiridos().size()+"";
            Mat[i][7]= " ";
            for (int j = 0; j < aux.getLibrosAdquiridos().size(); j++) {
                Mat[i][7]=aux.getLibrosAdquiridos().get(j).getTitulo()+Mat[i][7];
            }
            Mat[i][8]="";
            for (int j = 0; j < aux.getDirecciones().size(); j++) {
                Mat[i][8]=Mat[i][8]+" - "+ aux.getDirecciones().get(j).toString();
            }
            if (aux.getLibrosAdquiridos().size()>=10) {
                Mat[i][9]="Riesgo";
            }else{
                Mat[i][9]="Confiable";
            }

        }
        conocerSocios.getjTbtlSocios().setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Usuario", "Nombre", "Apellido 2", "Apellido", "Telefono Convencional", "Telefono Movil", "N Libros Prestados", "Titulo Libro", "Direccion", "Confiabilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
            
        }
        
    private void mostrarS(){
        String Mat[][]=new String[baseDatos.getSocios().size()][10];
         Socio aux;
        for (int i = 0; i <baseDatos.getSocios().size() ; i++) {
            aux=baseDatos.getSocios().get(i);
            
            Mat[i][0]=aux.getUsuario();
            Mat[i][1]=aux.getNombre();
            Mat[i][2]=aux.getApellido2();
            Mat[i][3]=aux.getApellido1();
            Mat[i][4]=aux.getTelefonoConvencional();      
            Mat[i][5]=aux.getTelefonoMovil();
            Mat[i][6]=aux.getLibrosAdquiridos().size()+"";
            Mat[i][7]="";
            for (int j = 0; j < aux.getLibrosAdquiridos().size(); j++) {
                Mat[i][7]=aux.getLibrosAdquiridos().get(j).getTitulo()+Mat[i][7]+" - ";
            }
            Mat[i][8]="";
            for (int j = 0; j < aux.getDirecciones().size(); j++) {
                Mat[i][8]=Mat[i][8]+ aux.getDirecciones().get(j).toString();
            }
            if (aux.getLibrosAdquiridos().size()>=10) {
                Mat[i][9]="Riesgo";
            }else{
                Mat[i][9]="Confiable";
            }

        }
        conocerSocios.getjTbtlSocios().setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Usuario", "Nombre", "Apellido 2", "Apellido", "Telefono Convencional", "Telefono Movil", "N Libros Prestados", "Titulo Libro", "Direccion", "Confiabilidad"
            }
        ));
         
            
        }
        
   
        
    private void limpiarNuevoSocio(){
    ingresarNuevoSocio.getjTxtApellido1().setText("");
    ingresarNuevoSocio.getjTxtCI().setText("");
    ingresarNuevoSocio.getjTxtConvencional().setText("     ( OPCIONAL )");
    ingresarNuevoSocio.getjTxtCprincipal().setText("");
    ingresarNuevoSocio.getjTxtCsecuandaria().setText("");
    ingresarNuevoSocio.getjTxtMovil().setText("");
    ingresarNuevoSocio.getjTxtNombre1().setText("");
    ingresarNuevoSocio.getjTxtApellido2().setText("      ( OPCIONAL )");
    ingresarNuevoSocio.getjTxtNumeracion().setText("");
    ingresarNuevoSocio.getjTxtUsuario().setText("");
    }
    private void limpiarLogin(){
        login.getjTxtApellido().setText("");
        login.getjTxtNombre().setText("");
        login.getjTxtUsuario().setText("");
    }
    private void limpiarNuevoLibro(){
    ingresarLibros.getjTxtCodigoLibro().setText("");
    ingresarLibros.getjTxtTitulo().setText("");
    ingresarLibros.getjTxtNumeroHabitacion().setText("");
    ingresarLibros.getjTxtEstante().setText("");
    ingresarLibros.getjTxtNumeroPiso().setText("");
    
    }
    private void llenarVentanaNuevoLibro(Libro libro){
    ingresarLibros.getjTxtCodigoLibro().setText(libro.getCodigo());
    ingresarLibros.getjTxtTitulo().setText(libro.getTitulo());
    ingresarLibros.getjTxtNumeroHabitacion().setText(String.valueOf(libro.getUbicacion().getNumeroHabitacion()));
    ingresarLibros.getjTxtEstante().setText(String.valueOf(libro.getUbicacion().getNumeroEstante()));
    ingresarLibros.getjTxtNumeroPiso().setText(String.valueOf(libro.getUbicacion().getNumeroPiso()));    
    }

    private Libro datosLibro(){  
             Ubicacion ubiLib = new Ubicacion (
                    Integer.parseInt(ingresarLibros.getjTxtNumeroPiso().getText()),
                    Integer.parseInt(ingresarLibros.getjTxtNumeroHabitacion().getText()),
                    Integer.parseInt(ingresarLibros.getjTxtEstante().getText())
            );           
            int bandera =0;
            String[] area={"Filosofia","Religion","Ciencias Sociales","Filogia","Ciencias Naturales","Tecnicas","Ciencias Practicas","Arte y Literatura","Historia"};        
            Libro auxLibro=new Libro(
                    "PRUEBA",
                    ingresarLibros.getjTxtTitulo().getText(),
                    true,
                    ubiLib,
                    area[ingresarLibros.getjComboAreaLibro().getSelectedIndex()]
            );           
        return auxLibro;
       }
    
     
    private void limpiarConocerSocios(){
        catalogoLibros.getjTblLibros().setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Codigo", "Titulo", "Disponibilidad", "Ubicacion", "Autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    private Socio datosSocio(){  
             Direccion di = new Direccion (
                     ingresarNuevoSocio.getjTxtNumeracion().getText(),
                     ingresarNuevoSocio.getjTxtCprincipal().getText(),
                    ingresarNuevoSocio.getjTxtCsecuandaria().getText()        
             );           
            int bandera =0;
            String[] Tvivienda={"Casa","Departamento","Oficina","Empresa"};        
            Socio auxSo=new Socio(
                    Tvivienda[ingresarNuevoSocio.getjComboBox1().getSelectedIndex()],
                    ingresarNuevoSocio.getjTxtCI().getText(),
                    ingresarNuevoSocio.getjTxtNombre1().getText(),
                    ingresarNuevoSocio.getjTxtApellido1().getText(),
                    ingresarNuevoSocio.getjTxtApellido2().getText(),
                     ingresarNuevoSocio.getjTxtMovil().getText(),
                     ingresarNuevoSocio.getjTxtConvencional().getText(),
                    ingresarNuevoSocio.getjTxtUsuario().getText()                     
            );           
        return auxSo;
       }
}
     
    
