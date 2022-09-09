package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.MovimientoDinero;
import com.HunkyDoryCode.Services.ServiceEmpleado;
import com.HunkyDoryCode.Services.ServiceMovimientoDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlMovimientoDinero {
    ServiceMovimientoDinero mov1 = new ServiceMovimientoDinero();
    MovimientoDinero ept1;
    @PostMapping("/movimiento")
    public MovimientoDinero ControlMovimientoDinero(@RequestBody MovimientoDinero MovDin){
        return this.mov1.getMovimientoDinero(MovDin);

    }
    @GetMapping("/movimiento")
    MovimientoDinero movimientoDinero(){
        return this.ept1;
    }


}
