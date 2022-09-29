package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.MovimientoDinero;
import com.HunkyDoryCode.Services.ServiceEmpleado;
import com.HunkyDoryCode.Services.ServiceMovimientoDinero;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControlMovimientoDinero {
    ServiceMovimientoDinero mov1;

    public ControlMovimientoDinero(ServiceMovimientoDinero mov1){

        this.mov1 = mov1;
    }




    //GET:
    /*
    @GetMapping("/movements")
    public List<MovimientoDinero> informacion(){
        return this.mov1.getInformacion();
    }

    //POST:
    @PostMapping("/movements")
    public MovimientoDinero crearEmpleado(@RequestBody MovimientoDinero MovDin){
        return this.mov1.crearMovimientoDinero(MovDin);
    }
     */

    //Relacion del modelador del ControllFront de la pagina Movimiento.html
    //Post:
    @PostMapping("/movimiento")
    public RedirectView crearMovimientos(@ModelAttribute MovimientoDinero MovDin, Model modelU){
        modelU.addAttribute(MovDin);
        this.mov1.crearMovimientoDinero(MovDin);
        return new RedirectView("/movimiento");
    }

    //PATCH:
    @PutMapping("/enterprises/{id}/movements")
    public MovimientoDinero actualizarEmpresa(@PathVariable Long id, @RequestBody MovimientoDinero MovDin){
        return  this.mov1.actualizarMovimientoDinero(id, MovDin);
    }

    //DELETE:
    @DeleteMapping("/enterprises/{id}/movements")
    public  MovimientoDinero eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.mov1.eliminarMovimientoDinero(id);
    }

}