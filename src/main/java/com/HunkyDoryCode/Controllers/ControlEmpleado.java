package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Services.ServiceEmpleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpleado {
    ServiceEmpleado sem1 = new ServiceEmpleado();
    Empleado emp1;
    public ControlEmpleado(){
        this.emp1 = this.sem1.getEmpleado();

    }
    @GetMapping("/empleado")
    Empleado empleado(){
        return this.emp1;
    }

}
