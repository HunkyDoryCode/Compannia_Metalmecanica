package com.HonkyDoryCode.Empleado;

public class Empleado {
    import java.util.Scanner;

    class Empleado {
        private String Nombres;
        private String Correo;
        private String Empresa;
        private String cargo;

        //Constructor

        public Empleado(String nombres, String correo, String empresa, String cargo) {
            Nombres = nombres;
            Correo = correo;
            Empresa = empresa;
            this.cargo = cargo;
        }

    }

    //Getters and Setters
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
