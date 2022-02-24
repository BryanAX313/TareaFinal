/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author braya
 */
public class Direccion {
    private String callePrincipal,calleSecundaria,numeracion;

    public Direccion(String callePrincipal, String calleSecundaria, String numeracion) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    @Override
    public String toString() {
        return " - C Principal: " + callePrincipal + "  - C Secundaria: " + calleSecundaria + "  - Numeracion: " + numeracion ;
    }
    
}
