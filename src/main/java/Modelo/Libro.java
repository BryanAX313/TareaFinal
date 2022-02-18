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
public class Libro {
    private String codigo,titulo;
    private ArrayList<Autor> autores =new ArrayList(); /// 
    
    private boolean disponibilidad;
    
    private Ubicacion ubicacion ;
    
    private String area;
    
    public Libro(String codigo, String titulo, boolean disponibilidad, Ubicacion ubicacion, String area) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponibilidad = disponibilidad;
        this.ubicacion = ubicacion;
        this.area=area;
    }
    public int actualizarUbi (Ubicacion ubi,String areaAux){
        int completado=0;
            setUbicacion(ubi);
            setArea(areaAux);
            if (area.equals(areaAux)&&ubicacion.equals(ubi)) {
            completado=1;
        }
        return completado;
    }
    
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    public int agregarAutor(Autor di){
        int estado =0;
        for (int i = 0; i <autores.size(); i++) {
            if (di==autores.get(i)) {
                estado=1;
            }
        }
        if (estado==0) {
           autores.add(di);
            estado=1;      
        }else{
            estado=0;
        }
        return estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
