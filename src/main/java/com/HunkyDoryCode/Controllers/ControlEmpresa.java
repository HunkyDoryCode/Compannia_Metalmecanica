package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empresa;
import com.HunkyDoryCode.Services.ServiceEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/empresa")
    public List<Empresa> empresa(){
        return this.se1.getrepositorio();
    }
    @PostMapping("/empresa")
    public Empresa crearEmpresa(@RequestBody Empresa emp){
        return this.se1.crearRegistro(emp);
    }


}
