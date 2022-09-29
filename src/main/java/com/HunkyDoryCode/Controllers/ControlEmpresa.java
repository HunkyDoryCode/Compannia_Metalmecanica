package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empresa;
import com.HunkyDoryCode.Services.ServiceEmpresa;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class ControlEmpresa {
    //Atributo de la relacion de ServiceEmpresa:
    ServiceEmpresa se1;

    //Constructor de la relacion de ServiceEmpresa:
    public ControlEmpresa(ServiceEmpresa se1){
        this.se1 = se1;
    }

    //GET:
    /*
    @GetMapping("/enterprise")
    public List<Empresa> information(){
        return this.se1.getInformation();
    }


     */

    //POST -> Crea

    //Relacion del modelador del ControllFront de enterprises.html
    @PostMapping("/enterprises")
    public RedirectView crearEmpresa(@ModelAttribute Empresa emp, Model modelEmpr){
        modelEmpr.addAttribute(emp);
        this.se1.crearEmpresa(emp);
        return new RedirectView("/enterprises");
    }



    //PATCH:
    @PutMapping("/enterprises/{id}")
    public RedirectView actualizardatoEmpresa(@PathVariable(value = "id")Long id, @RequestBody Empresa Emp){
        this.se1.actualizarEmpresa(id, Emp);
        return  new RedirectView("/enterprises");

    }

    //DELETE:

    @DeleteMapping("/enterprisesE/{id}")
    public RedirectView eliminardatoEmpresa(@PathVariable Long id) {
        this.se1.eliminEmpresa(id);
        return  new RedirectView("/enterprises");
    }


}
