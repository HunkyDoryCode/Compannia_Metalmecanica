package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empresa;
import com.HunkyDoryCode.Services.ServiceEmpresa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlEmpresa {
    /*

    ServiceEmpresa se1 = new ServiceEmpresa();
    Empresa emp1;
    public ControlEmpresa(){
        this.emp1 = this.se1.GetEmpresa();
    }
    @GetMapping("/empresa")
    public Empresa empresa(){

        return this.emp1;
    }

     */
    ServiceEmpresa se1;

    public ControlEmpresa(ServiceEmpresa se1){
        this.se1 = se1;
    }

    //GET:
    /*
    @GetMapping("/enterprise")
    public List<Empresa> information(){
        return this.se1.getInformation();
    }

    //POST
    @PostMapping("/enterprise")
    public Empresa crearEmpresa(@RequestBody Empresa emp){
        return this.se1.crearEmpresa(emp);
    }

     */

    //PUT
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
