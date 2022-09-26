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
    //Crea el modelo de la ruta del Frontcontrolador:
    @PostMapping("/enterprises")
    public RedirectView crearEmpresa(@ModelAttribute Empresa emp, Model modelEmpr){
        modelEmpr.addAttribute(emp);
        this.se1.crearEmpresa(emp);
        return new RedirectView("/enterprises");
    }



    //PATCH:
    @PutMapping("/enterprises/{id}")
    public Empresa actualizardatoEmpresa(@PathVariable(value = "id")Long id, @RequestBody Empresa Emp){
        return this.se1.actualizarEmpresa(id, Emp);
    }

    //DELETE:

    @DeleteMapping("/enterprises/{id}")
    public Empresa eliminardatoEmpresa(@PathVariable(value = "id")Long id){
        return this.se1.eliminEmpresa(id);
    }


}
