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
    private ActualizarUbiLibro actualizarubiLibro;
    private CatalogoLibros catalogoLibros;

    public Controlador(ActualizarUbiLibro actulizarUbiLibro, Biblioteca1 bibliotecaP, ConocerSocios conocerSocios, IngresarLibros ingresarLibros, IngresarNuevoSocio ingresarNuevoSocio, Login login, PrestamoLibros prestamosLibros, UbicacionLibro1 ubicacionLibro,DireccionSocio direccionSocio,Autor1 autor,CatalogoLibros catalogoLibros) {
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
        this.conocerSocios.getjBtnNuevo().addActionListener(this);
        
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
        this.autor.getjBtnEliminar().addActionListener(this);
        this.autor.getjBtnGuardar().addActionListener(this);
        this.autor.getjTxtAlias().addActionListener(this);
        this.autor.getjTxtNacimiento().addActionListener(this);
        this.autor.getjTxtNacionalidad().addActionListener(this);
        this.autor.getjTxtNombre().addActionListener(this); 
        
        //////******Catalogo Libros*****/////
        this.catalogoLibros.getjBtnEliminar().addActionListener(this);
        this.catalogoLibros.getjBtnBuscar().addActionListener(this);
        this.catalogoLibros.getjBtnModificar().addActionListener(this);
        this.catalogoLibros.getjBtnSalir().addActionListener(this);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
// Catalogo Libros
        if (e.getSource().equals(catalogoLibros.getjBtnSalir())) {
            catalogoLibros.dispose();
        }
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
       if(e.getSource().equals(bibliotecaP.getjBtnBuscar())){
           bibliotecaP.dispose();
           ubicacionLibro.show();
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
           
       }
        if(e.getSource().equals(conocerSocios.getjBtnNuevo())){
           conocerSocios.dispose();
           ingresarNuevoSocio.show();
       }
//IngresarLibros
        if(e.getSource().equals(ingresarLibros.getjBtnAtras())){
           ingresarLibros.dispose();
           bibliotecaP.show();
       }
        
        if(e.getSource().equals(ingresarLibros.getjBtnAutor())){
                autor.show(); 
                //codigo y titulo
            Ubicacion ubiLib = new Ubicacion (
                    Integer.parseInt(ingresarLibros.getjTxtNumeroPiso().getText()),
                    Integer.parseInt(ingresarLibros.getjTxtNumeroHabitacion().getText()),
                    Integer.parseInt(ingresarLibros.getjTxtEstante().getText())
            );
            
            int bandera =0;
            String[] area={"Filosofia","Religion","Ciencias Sociales","Filogia","Ciencias Naturales","Tecnicas","Ciencias Practicas","Arte y Literatura","Historia"};
            for (int i = 0; i < 8; i++) {
                if (ingresarLibros.getjComboBox1().getItemAt(i).equals(area[i])) {
                    bandera=i;
                }
            }
            
            Libro auxLibro=new Libro(
                    ingresarLibros.getjTxtCodigoLibro().getText(),
                    ingresarLibros.getjTxtTitulo().getText(),
                    true,
                    ubiLib,
                    ingresarLibros.getjComboBox1().getItemAt(bandera)
            );
            System.out.println(ingresarLibros.getjTxtCodigoLibro().getText());
            
            int x = baseDatos.añadiLibro(auxLibro);
            ///            
            
            }
 
        if(e.getSource().equals(ingresarLibros.getjBtnGuardar())){
            int x=1;
            for (int i = 0; i < baseDatos.getLibrosTotal().size(); i++) {
                if (baseDatos.getLibrosTotal().get(i).getAutores().size()==0) {
                        baseDatos.getLibrosTotal().remove(baseDatos.getLibrosTotal().get(i));
                        x=1;
                    }else{
                        x=0;
                    }
                }               
            if (x==0) {
               JOptionPane.showMessageDialog(null, "Se guardo con exito el libro");
            }else{
                JOptionPane.showMessageDialog(null, "Libro ya registrado no se guardo");
                
            }
            limpiarNuevoLibro();
        }
       
//PrestamoLibro
        if(e.getSource().equals(prestamosLibros.getBtnAtras())){
           prestamosLibros.dispose();
           bibliotecaP.show();
       }
        if(e.getSource().equals(prestamosLibros.getjBtnBuscar())){
            if (prestamosLibros.getJlblUs().getText().equals("No Iniciado Sesion")) {
                JOptionPane.showMessageDialog(null, "Necesita Ingresar Sesion para pedir un libro");
            }else{
                catalogoLibros.show();               
                ArrayList<Libro> lista =new ArrayList();
                if (baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText()).size()==0) {
                    JOptionPane.showMessageDialog(null, "Libro No encontrado");
                }else{
                    lista=baseDatos.buscarLibroT(prestamosLibros.getjTxtTituloL().getText());
                    mostrar(lista);
                }      
            }
       }
//UbicacionLibro1
        if(e.getSource().equals(ubicacionLibro.getjBtnAtras())){
           ubicacionLibro.dispose();
           bibliotecaP.show();
       }

        if(e.getSource().equals(ubicacionLibro.getjBtnAceptar())){
            
            if (baseDatos.buscarLibro(ubicacionLibro.getjTxtCodigo().getText()).equals("No encontrado")) {
                JOptionPane.showMessageDialog(null, "No encontrado");
            }else{
                Ubicacion ubiAux = baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(ubicacionLibro.getjTxtCodigo().getText()))).getUbicacion();
                ubicacionLibro.getjLblArea().setText( baseDatos.getLibrosTotal().get(Integer.parseInt(baseDatos.buscarLibro(ubicacionLibro.getjTxtCodigo().getText()))).getArea());
                ubicacionLibro.getjLblEstante().setText(ubiAux.getNumeroEstante()+"");
                ubicacionLibro.getjLblHabitacion().setText(ubiAux.getNumeroHabitacion()+"");
                ubicacionLibro.getjLblPiso().setText(ubiAux.getNumeroPiso()+"");
            }
        }
        if (e.getSource().equals(ubicacionLibro.getjBtnActualizar())) {
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
        if(e.getSource().equals(autor.getjBtnEliminar())){
           
       }
        if(e.getSource().equals(autor.getjBtnGuardar())){
            Autor auxAutor=new Autor(
                    autor.getjTxtNombre().getText(),
                    autor.getjTxtAlias().getText(),
                    autor.getjTxtNacionalidad().getText(), 
                    autor.getjTxtNacimiento().getText()
            );
            for (int i = 0; i < baseDatos.getLibrosTotal().size(); i++) {
                System.out.println("zsaddadaw");
                if (baseDatos.getLibrosTotal().get(i).getAutores().size()==0) {
                    if (baseDatos.getLibrosTotal().get(i).agregarAutor(auxAutor)==1) {
                        System.out.println("if");
                        JOptionPane.showMessageDialog(null, "Autor Ingresado");
                    }else{
                        JOptionPane.showMessageDialog(null, "Autor NoIngresado");
                        System.out.println("else");
                    }
                }
            }
       }
        
        
////Actualizar Ubucacion de Libro
     if(e.getSource().equals(actulizarUbiLibro.getjBtnAtras())){
          actulizarUbiLibro.dispose();
           ubicacionLibro.show();
       }
        if(e.getSource().equals(actulizarUbiLibro.getjBtnAceptar())){
           Ubicacion ubi = new Ubicacion(
                    Integer.parseInt(actulizarUbiLibro.getjTxtPiso().getText()),
                    Integer.parseInt(actulizarUbiLibro.getjTxtHabitacion().getText()),
                    Integer.parseInt(actulizarUbiLibro.getjTxtEstante().getText())
            );
           int bandera =0;
            String[] area={"Filosofia","Religion","Ciencias Sociales","Filogia","Ciencias Naturales","Tecnicas","Ciencias Practicas","Arte y Literatura","Historia"};
            for (int i = 0; i < 8; i++) {
                if (actulizarUbiLibro.getjCbxArea().getItemAt(i).equals(area[i])) {
                    bandera=i;
                }
            }
            
            for (int i = 0; i < baseDatos.getLibrosTotal().size(); i++) {
                if ( baseDatos.getLibrosTotal().get(i).getCodigo().equals(ubicacionLibro.getjTxtCodigo().getText())) {
                    if (baseDatos.getLibrosTotal().get(i).actualizarUbi(ubi, area[bandera])==1) {
                        JOptionPane.showMessageDialog(null, "Actualizado");
                    }else{
                        JOptionPane.showMessageDialog(null, "No actualizado");
                    }
                }
            }
       }
    }
    private void mostrar(ArrayList<Libro> ar){
        String matris[][]=new String[ar.size()][5];
        
        for (int i = 0; i <ar.size() ; i++) {
            matris[i][0]=ar.get(i).getArea();
            matris[i][1]=ar.get(i).getCodigo();
            matris[i][2]=ar.get(i).getTitulo();
            matris[i][3]=ar.get(i).getAutores().toString();      
            matris[i][4]=ar.get(i).getUbicacion().toString();
            if (ar.get(i).isDisponibilidad()==true) {
                matris[i][0]="Disponible";
            }else{
                matris[i][0]="No Disponible";
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
    private void limpiarNuevoLibro(){
    ingresarLibros.getjTxtCodigoLibro().setText("");
    ingresarLibros.getjTxtTitulo().setText("");
    ingresarLibros.getjTxtNumeroHabitacion().setText("");
    ingresarLibros.getjTxtEstante().setText("");
    ingresarLibros.getjTxtNumeroPiso().setText("");
    
    }
}
