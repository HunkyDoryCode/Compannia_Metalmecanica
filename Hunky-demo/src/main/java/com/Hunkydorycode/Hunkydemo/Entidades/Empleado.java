package com.Hunkydorycode.Hunkydemo.Entidades;

public class Empleado {
    private String nombre;
    private String correo;
    private String empresaEmpleado;
    private String rol;

    //Nuevo atributo:



    //constructor

    public Empleado(String nombre, String correo, String empresaEmpleado, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleado = empresaEmpleado;
        this.rol = rol;
    }


    //GETTERS AND SETTERS


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

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaEmpleado='" + empresaEmpleado + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}


