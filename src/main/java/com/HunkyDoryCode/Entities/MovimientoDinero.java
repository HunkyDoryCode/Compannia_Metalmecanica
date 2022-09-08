package com.HunkyDoryCode.Entities;

import javax.persistence.*;

@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @Column(name = "montoMovimiento")
    private double montoMovimento;
    @Column(name = "conceptoMovimiento")
    private String conceptoMovimiento;

    public MovimientoDinero() {
    }

    public MovimientoDinero(double montoMovimento, String conceptoMovimiento) {
        this.montoMovimento = montoMovimento;
        this.conceptoMovimiento = conceptoMovimiento;
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
}
