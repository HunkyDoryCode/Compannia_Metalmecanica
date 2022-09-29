package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Services.ServiceEmpleado;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControlEmpleado {
    ServiceEmpleado sem1;


    public ControlEmpleado(ServiceEmpleado sem1){
        this.sem1 = sem1;

    }



    //GET
    /*
    @GetMapping("/users")
    public List<Empleado> informacion(){
        return this.sem1.getInformacion();
    }
    */

    //POST:
    /*
    @PostMapping("/users")
    public Empleado crearEmpleado(@RequestBody Empleado emplea){
        return this.sem1.crearEmpleado(emplea);
    }

     */


    //POST:
    //Relacion del modelador del ControllFront de la pagina usuer.html:
    @PostMapping("/user")
    public RedirectView crearEmpleado(@ModelAttribute Empleado emplea, Model modelEmpl){
        modelEmpl.addAttribute(emplea);
        this.sem1.crearEmpleado(emplea);
        return new RedirectView("/user");
    }






    //PATCH:

    @PutMapping("/user/{id}")
    public Empleado actualizarEmpresa(@PathVariable Long id, @RequestBody Empleado emplea){
        return this.sem1.actualizarEmpleado(id, emplea);
    }



    //Delete
    @DeleteMapping("/user/{id}")
    public Empleado eliminarEmpresa(@PathVariable(value = "id") Long id){
        return this.sem1.eleminEmpleado(id);
    }

}
