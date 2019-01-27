package com.example.user.sharedpref;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String nombre;
    private String correo;
    private String numero;


    public Contacto(String nombre, String correo, String numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

