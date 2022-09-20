package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empresa;
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

    //Constructor:
    public ControlFront(ServiceEmpresa se1){
        this.se1 = se1;
    }
    /*
    @GetMapping("/") //ruta raíz
    public String index(){
        return "index";
    }

     */

    //Visualizacion del indexEnterprises sin relacion
    @GetMapping("/enterprises")
    public String enterprises(Model modelE){
        List<Empresa> enterprises = this.se1.getInformation();
        modelE.addAttribute("enterprises", enterprises);
        return "enterprises"; //que retorne el achivo  del html "enterprises.html"
    }

}


