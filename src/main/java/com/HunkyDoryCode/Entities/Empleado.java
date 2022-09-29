package com.HunkyDoryCode.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="correo")
    private String correo;
    @Column(name ="empresaEmpleadoPertenece")
    private String empresaEmpleadoPertenece;
    @Column(name ="rolEmpleado")
    private String rolEmpleado;

    @Transient
    MovimientoDinero movimiento1;

    //Agregar la relacion de muchos datos en un solo:

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registroMovimiento", nullable = false)
    @JsonIgnoreProperties(value = "empleados")
    private Empleado enterprises;


    public Empleado() {
    }

    public Empleado(String nombre, String correo, String empresaEmpleadoPertenece, String rolEmpleado, MovimientoDinero movimientoDinero1) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
        this.rolEmpleado = rolEmpleado;
        this.movimiento1 = movimientoDinero1;
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

    public String getEmpresaEmpleadoPertenece() {
        return empresaEmpleadoPertenece;
    }

    public void setEmpresaEmpleadoPertenece(String empresaEmpleadoPertenece) {
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public MovimientoDinero getMovimientoDinero1() {
        return movimiento1;
    }

    public void setMovimientoDinero1(MovimientoDinero movimientoDinero1) {
        this.movimiento1 = movimientoDinero1;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresaEmpleadoPertenece='" + empresaEmpleadoPertenece + '\'' +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                ", movimiento1=" + this.movimiento1 +
                '}';
    }
}
