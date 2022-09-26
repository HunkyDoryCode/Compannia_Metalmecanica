package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.Empresa;
import com.HunkyDoryCode.Services.ServiceEmpleado;
import com.HunkyDoryCode.Services.ServiceEmpresa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControlFront {
    //Crea elementos de tipo Strnig para visualizar las etiquetas HTML creadas:

    //Atributo de servicios Empresa:
    ServiceEmpresa se1;
    //Atributo de servicios Emmpleado:
    ServiceEmpleado sem1;


    //Constructor:
    public ControlFront(ServiceEmpresa se1, ServiceEmpleado sem1){
        this.se1 = se1;
        this.sem1 = sem1;


    }

    @GetMapping("/") //ruta raíz
    public String index(){
        return "index";
    }


    //Visualizacion del indexEnterprises sin relacion
    @GetMapping("/enterprises")
    public String enterprises(Model modelE){
        List<Empresa> enterprises = this.se1.getInformation();
        modelE.addAttribute("enterprises", enterprises);
        return "enterprises"; //que retorne el achivo  del html "enterprises.html"
    }

    //muestra la pagina de nuevo-empleado.html; El formulario de creacion nuevo empleado

    @GetMapping("/enterprises/nueva-empresa")
    public String nuevaEmpresa(Model modelEmpr){
        modelEmpr.addAttribute("enterprises", new Empresa());
        return "nueva-empresa";
    }


    @GetMapping("user/nuevo-empleado")
    public String nuevoEmpleado(Model modelEmpl){
        modelEmpl.addAttribute("user", new Empleado());
        return "nuevo-empleado";
    }


}


