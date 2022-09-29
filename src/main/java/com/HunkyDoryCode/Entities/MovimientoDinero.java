package com.HunkyDoryCode.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {
    //Columnas de los Atributos, de la clase MovimientoDinero:
    //Identificador Cedula de todos los id's:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id3;
    @Column(name = "montoMovimiento")
    private double montoMovimento;
    @Column(name = "conceptoMovimiento")
    private String conceptoMovimiento;


    //Agregar de uno a muchos datos, con el id cedulaUsuario de la relacion Empleado:
    @ManyToOne(optional = false)
    //Union de de columna "cedulaUsuario"
    @JoinColumn(name = "cedulaUsuario",nullable = false) //debe relacionarlo con un empleado
    private Empleado empleado;



    //constructor Abstracto Movimiento:
    public MovimientoDinero() {
    }

    public long getId3() {
        return Id3;
    }

    public void setId3(long id3) {
        Id3 = id3;
    }

    public double getMontoMovimento() {
        return montoMovimento;
    }

    public void setMontoMovimento(double montoMovimento) {
        this.montoMovimento = montoMovimento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    //Metodos getters y setters de la relacion Empleado:
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
