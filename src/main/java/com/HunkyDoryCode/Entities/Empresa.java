package com.HunkyDoryCode.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "empresa")
public class Empresa {
    //Columnas de los Atributos, de la clase Empresa:
    //Identificador Cedula del Nit:
    @Id
    private int nit;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private int telefono;

    //Relacion de uno a muchos con datos de tabla Empleados:
    @OneToMany(mappedBy = "enterprises")
    private Set<Empleado> empleados;


    //constructor Abstracto Empresa:
    public Empresa() {
    }

    //Metodo getters y setters de Empresa:
    public int getNit() {
        return nit;
    }
    public void setNit(int nit) {
        this.nit = nit;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    //Metodo Getters y Setters de la relacion de Empleado:
    public Set<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
}

