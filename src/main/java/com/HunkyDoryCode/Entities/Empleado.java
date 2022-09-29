package com.HunkyDoryCode.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "empleado")
public class Empleado {
    //Columnas de los Atributos, de la clase Empleado:
    //Identificador de Cedula del usuario:
    @Id
    private Long cedulaUsuario;

    @Column(name ="nombre")
    private String nombre;
    @Column(name ="correo")
    private String correo;
    /*
    @Column(name ="empresaEmpleadoPertenece")
    private String empresaEmpleadoPertenece;
     */
    @Column(name ="rolEmpleado")
    private String rolEmpleado;

    /*
    @Transient
    MovimientoDinero movimiento1;
     */


    //Agregar de muchas datos a uno, del Id Nit, de la relacion tabla Empresa:
    @ManyToOne(optional = false)
    //Union de de columna "nit"
    @JoinColumn(name = "nit",nullable = false) //debe relacionarlo con un empleado
    private Empresa enterprises;


    //Agregar de uno a muchos datos, con la relacion de tabla movimiento dinero:
    //maping de flecha direccionamiento "Empleado":
    @OneToMany(mappedBy = "empleado")
    private Set<MovimientoDinero> montoMovimiento;



    //constructor Abstracto:
    public Empleado() {
    }




    //Metodos Getters y Setters de los atributos Empleado:

    public Long getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(Long cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
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
    public String getRolEmpleado() {
        return rolEmpleado;
    }
    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }


    //Metodos getter y setters de la relacion MovimientoDinero:
    public Set<MovimientoDinero> getMontoMovimiento() {
        return montoMovimiento;
    }
    public void setMontoMovimiento(Set<MovimientoDinero> montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }



    //Metodos getter y setters de la relacion Empresa:
    public Empresa getEnterprises() {
        return enterprises;
    }
    public void setEnterprises(Empresa enterprises) {
        this.enterprises = enterprises;
    }
}
