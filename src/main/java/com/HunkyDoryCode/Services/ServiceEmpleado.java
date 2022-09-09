package com.HunkyDoryCode.Services;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.MovimientoDinero;

public class ServiceEmpleado {
    Empleado emp1;
    public ServiceEmpleado(){
        this.emp1 = new Empleado("Alejandro Garcia", "alejo@gmail.com", "Mecanicas Garcia",
                "Administrador", null);
    }
    public Empleado getEmpleado(){
        return this.emp1;
    }
}
