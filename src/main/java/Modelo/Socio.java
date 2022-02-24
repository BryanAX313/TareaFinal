/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braya
 */
public class Socio {
    private String tipoVivienda,usuario;
    private String cedulaId,nombre,apellido1,apellido2,telefonoMovil,telefonoConvencional;
    private ArrayList<Libro> librosAdquiridos=new ArrayList();
    private ArrayList<Direccion> direcciones=new ArrayList();

    public Socio(String tipoVivienda, String cedulaId, String nombre, String apellido1, String apellido2, String telefonoMovil, String telefonoConvencional,String usuario) {
        this.tipoVivienda = tipoVivienda;
        this.cedulaId = cedulaId;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefonoMovil = telefonoMovil;
        this.telefonoConvencional = telefonoConvencional;
        this.usuario=usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
  
    public int agregarDireccion(Direccion di){
        int estado =0;
        for (int i = 0; i <direcciones.size(); i++) {
            if (di==direcciones.get(i)) {
                estado=1;
            }
        }
        if (estado==0) {
            direcciones.add(di);
            estado=1;
           
        }
        return estado;
    }
 
    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

  

    public String getCedulaId() {
        return cedulaId;
    }

    public void setCedulaId(String cedulaId) {
        this.cedulaId = cedulaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public String getTelefonoConvencional() {
        return telefonoConvencional;
    }

    public void setTelefonoConvencional(String telefonoConvencional) {
        this.telefonoConvencional = telefonoConvencional;
    }

    public ArrayList<Libro> getLibrosAdquiridos() {
        return librosAdquiridos;
    }

    public void setLibrosAdquiridos(ArrayList<Libro> librosAdquiridos) {
        this.librosAdquiridos = librosAdquiridos;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

   


    
    
}
