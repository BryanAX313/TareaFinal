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
       bibliotecaP.setLocation(340, 150);
       bibliotecaP.setVisible(true);
       ConocerSocios conocerSocios=new ConocerSocios();
       IngresarLibros ingresarLibros=new IngresarLibros();
       IngresarNuevoSocio ingresarNuevoSocio =new IngresarNuevoSocio();
       PrestamoLibros prestamosLibros=new PrestamoLibros();
       UbicacionLibro1 ubicacionLibro=new UbicacionLibro1();
       DireccionSocio direccionSocio =new DireccionSocio();
       Autor1 autor =new Autor1();
       CatalogoLibros cat = new CatalogoLibros();
       PrestamoLibroClase prestamoLibroC =new PrestamoLibroClase();
       
       Controlador control=new Controlador( 
               actulizarUbiLibro,
               bibliotecaP,
               conocerSocios,
               ingresarLibros,
               ingresarNuevoSocio,
               login,prestamosLibros,
               ubicacionLibro,
               direccionSocio,
               autor,cat,
               prestamoLibroC
       );
       BaseDatos baseDatos = BaseDatos.getInstancia();
       
       Libro lb=new Libro ("123BA","EDO",true,new Ubicacion(1,1,1),"");
       Libro lb2=new Libro ("124BA","EDO",true,new Ubicacion(2,1,1),"");
       Libro lb3=new Libro ("125BA","EDO",true,new Ubicacion(3,1,1),"");
       Libro lb4=new Libro ("126BA","EDO",true,new Ubicacion(4,1,1),"");
       Libro lb5=new Libro ("127BA","EDO",true,new Ubicacion(5,1,1),"");
       Libro lb6=new Libro ("128BA","EDO",true,new Ubicacion(6,1,1),"");
       Libro lb7=new Libro ("214BA","EDO",true,new Ubicacion(7,2,1),"");
       Libro lb8=new Libro ("211BA","EDO",true,new Ubicacion(8,1,1),"");
       Libro lb9=new Libro ("200BA","EDO",true,new Ubicacion(9,1,1),"");
       Libro lb10=new Libro ("201BA","EDO",true,new Ubicacion(10,1,1),"");
       
       Libro lb11=new Libro ("123GE","EDO",true,new Ubicacion(1,1,1),"");
       Libro lb12=new Libro ("124GE","EDO",true,new Ubicacion(2,1,1),"");
       Libro lb13=new Libro ("125GE","EDO",true,new Ubicacion(3,1,1),"");
       Libro lb14=new Libro ("126GE","EDO",true,new Ubicacion(4,1,1),"");
       Libro lb15=new Libro ("127GE","EDO",true,new Ubicacion(5,1,1),"");
       Libro lb16=new Libro ("128GE","EDO",true,new Ubicacion(6,1,1),"");
       Libro lb17=new Libro ("214GE","EDO",true,new Ubicacion(7,2,1),"");
       Libro lb18=new Libro ("211GE","EDO",true,new Ubicacion(8,1,1),"");
       Libro lb19=new Libro ("200GE","EDO",true,new Ubicacion(9,1,1),"");
       Libro lb20=new Libro ("201GE","EDO",true,new Ubicacion(10,1,1),"");
       
       Libro lb21=new Libro ("123","EDO",true,new Ubicacion(1,1,1),"");
       Libro lb22=new Libro ("124","EDO",true,new Ubicacion(2,1,1),"");
       Libro lb23=new Libro ("125","EDO",true,new Ubicacion(3,1,1),"");
       Libro lb24=new Libro ("126","EDO",true,new Ubicacion(4,1,1),"");
       Libro lb25=new Libro ("127","EDO",true,new Ubicacion(5,1,1),"");
       Libro lb26=new Libro ("128","EDO",true,new Ubicacion(6,1,1),"");
       Libro lb27=new Libro ("214","EDO",true,new Ubicacion(7,2,1),"");
       Libro lb28=new Libro ("211","EDO",true,new Ubicacion(8,1,1),"");
       Libro lb29=new Libro ("200","EDO",true,new Ubicacion(9,1,1),"");
       Libro lb30=new Libro ("201","EDO",true,new Ubicacion(10,1,1),"");
       
       //String tipoVivienda, String cedulaId, String nombre, String apellido1, String apellido2, String telefonoMovil, String telefonoConvencional,String usuario
       Socio s = new Socio("Casa","1726229311","Bryan","Asimbaya","Cando","091634923","0284654","BryanAx");
       Socio s1=new Socio("Casa","1725117854","Gabriela","Echeverria","Hidalgo","0999475169","4520816","GabyEH");
       
       Socio s2=new Socio("Casa",           "1722621214",   "Cristhian",    "Armijos",      "Perez",        "0999475169",   "0289678",  "CrisAA");
       Socio s3=new Socio("Departamento",   "12621621",     "Esteban",      "Chamorro",     "Hernandez",    "0999475169",   "0288716",  "EstabanS");
       Socio s4=new Socio("Casa",           "1725117854",   "Camila",       "Castro",       "Tipan",        "0999475169",   "0253816",  "Cam12");
       Socio s5=new Socio("Casa",           "1725117854",   "Ismael",       "Cando",        "Tipantuña",    "0999475169",   "0288961",  "IsmaC");
       Socio s6=new Socio("Departamento",   "1725111785",   "Pedro",        "Zabala",       "Sosa",         "0999475169",   "0267816",  "SP12");
       Socio s7=new Socio("Departamento",   "17251125111",  "Maria",        "Andrango",     "Cando",        "0999475169",   "0280816",  "MariB");
       Socio s8=new Socio("Casa",           "17225111854",  "Estefania",    "Sangoluisa",   "Pallasco",     "0999475169",   "0231896",  "Tefa");
       
       s.agregarDireccion(new Direccion ("La Cocha", "Aurelio Garcia", "17"));   
       s1.agregarDireccion(new Direccion ("Rio Zamora", "San Juan", "73"));
       
       s2.agregarDireccion(new Direccion ("Quitumbe", "Sol Naciente", "18"));   
       s3.agregarDireccion(new Direccion ("Rio Pedro", "San Blas", "42"));
       s4.agregarDireccion(new Direccion ("Maldonado", "Eugenio Espejo", "12"));   
       s5.agregarDireccion(new Direccion ("Marimba 12", "Beaterio", "53"));
       s6.agregarDireccion(new Direccion ("Caupicho", "Santo Tomas", "23"));   
       s7.agregarDireccion(new Direccion ("Pinta", "Tejar", "08"));
       s8.agregarDireccion(new Direccion ("El Recreo", "Maldonado", "56")); 
       
       baseDatos.añadiSocio(s);     //Asimbaya
       baseDatos.añadiSocio(s1);    //Echeverria
       
       baseDatos.añadiSocio(s2);
       baseDatos.añadiSocio(s3);
       baseDatos.añadiSocio(s4);
       baseDatos.añadiSocio(s5);
       baseDatos.añadiSocio(s6);
       baseDatos.añadiSocio(s7);
       baseDatos.añadiSocio(s8);
       
       
       
       baseDatos.añadiLibro(lb2);
       baseDatos.añadiLibro(lb);
       baseDatos.añadiLibro(lb3);
       baseDatos.añadiLibro(lb4);
       baseDatos.añadiLibro(lb5);
       baseDatos.añadiLibro(lb6);
       baseDatos.añadiLibro(lb7);
       baseDatos.añadiLibro(lb8);
       baseDatos.añadiLibro(lb9);
       baseDatos.añadiLibro(lb10);
       
       baseDatos.añadiLibro(lb11);
       baseDatos.añadiLibro(lb12);
       baseDatos.añadiLibro(lb13);
       baseDatos.añadiLibro(lb14);
       baseDatos.añadiLibro(lb15);
       baseDatos.añadiLibro(lb16);
       baseDatos.añadiLibro(lb17);
       baseDatos.añadiLibro(lb18);
       baseDatos.añadiLibro(lb19);
       baseDatos.añadiLibro(lb20);
       
       baseDatos.añadiLibro(lb21);
       baseDatos.añadiLibro(lb22);
       baseDatos.añadiLibro(lb23);
       baseDatos.añadiLibro(lb24);
       baseDatos.añadiLibro(lb25);
       baseDatos.añadiLibro(lb26);
       baseDatos.añadiLibro(lb27);
       baseDatos.añadiLibro(lb28);
       baseDatos.añadiLibro(lb29);
       baseDatos.añadiLibro(lb30);

       
    }
    
}
