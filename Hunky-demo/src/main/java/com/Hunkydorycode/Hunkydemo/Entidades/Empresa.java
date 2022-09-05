package com.Hunkydorycode.Hunkydemo.Entidades;

public class Empresa {
    //Atributos:
    private String empresa;
    private String direccion;
    private int telefono;
    private int nit;

    //Nuevo Atributo:
    private Empleado empleados;

    //Constructor:

    public Empresa(String empresa, String direccion, int telefono, int nit, Empleado empleados) {
        this.empresa = empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        //del nuevo atributo
        this.empleados = empleados;
    }


    //Getter y Setters:

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Empleado getEmpleados(){
        return empleados;
    }

    //getter y setter del nuevo atributo, para crear los arraylist de los objetos instaciados por cada clase:
    public void setEmpleados(Empleado empleados){
        this.empleados = empleados;
    }

    //parte relacional

    @Override
    public String toString() {
        return "Empresa{" +
                "empresa='" + empresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", nit=" + nit +
                ", empleados=" + empleados +
                '}';
    }
}



