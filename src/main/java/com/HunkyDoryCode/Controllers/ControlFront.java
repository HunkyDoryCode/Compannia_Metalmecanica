package com.HunkyDoryCode.Controllers;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.Empresa;
import com.HunkyDoryCode.Entities.MovimientoDinero;
import com.HunkyDoryCode.Services.ServiceEmpleado;
import com.HunkyDoryCode.Services.ServiceEmpresa;
import com.HunkyDoryCode.Services.ServiceMovimientoDinero;
import com.HunkyDoryCode.Services.userService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControlFront {
    //Crea elementos de tipo Strnig para visualizar las etiquetas HTML creadas:

    //Atributo de servicios Empresa:
    ServiceEmpresa se1;

    //Relacion de autenticacion de registro
    userService userService;
    //Atributo de servicios Emmpleado:
    ServiceEmpleado sem1;
    //Atributo de servicios Emmpleado:
    ServiceMovimientoDinero mov1;



    //Constructor:
    public ControlFront(ServiceEmpresa se1, ServiceEmpleado sem1, userService userService, ServiceMovimientoDinero mov1){
        this.se1 = se1;
        this.sem1 = sem1;
        this.userService = userService;
        this.mov1 = mov1;


    }
    //GetMappeados:

    //archivo index.html
    //Retorne de la utenticacion del usuario:
    @GetMapping("/") //ruta raíz
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        Object user = null;
        if(principal != null)
            user = this. userService.getOrCreateUser(principal.getClaims());
            model.addAttribute("user", user);
        return "index";
    }

    //archivo prueba.html
    @GetMapping("/index/prueba") //ruta raíz
    public String prueba(){
        return "prueba";
    }


    //Muestra la pagina de enterprises.html de Empresas
    @GetMapping("/enterprises")
    public String enterprises(Model modelE){
        List<Empresa> enterprises = this.se1.getInformation();
        modelE.addAttribute("enterprises", enterprises);
        return "enterprises"; //que retorne el achivo  del html "enterprises.html"

    }
    //Muestra la pagina de user.html de usuarios:
    @GetMapping("/user")
    public String user(Model modelU){
        List<Empleado> user = this.sem1.getInformacion();
        modelU.addAttribute("user", user);
        return "user"; //que retorne el achivo  del html "user.html"
    }

    //Muestra la pagina de mivimiento-cash.html de usuarios:
    @GetMapping("/movimiento")
    public String movimiento(Model modelM){
        List<MovimientoDinero> movimiento = this.mov1.getInformacion();
        modelM.addAttribute("movimiento", movimiento);
        return "movimiento"; //que retorne el achivo  del html "user.html"
    }





    //Muestra la pagina del formulario con relacion a la bases de datos Empresa:
    @GetMapping("/enterprises/nueva-empresa")
    public String nuevaEmpresa(Model modelEmpr){
        modelEmpr.addAttribute("enterprises", new Empresa());
        return "nueva-empresa";
    }

    //Muestra la pagina del formulario con relacion a la bases de datos Empleados:

    @GetMapping("/user/nuevos-empleados")
    public String nuevoEmpleado(Model modelEmpl){
        modelEmpl.addAttribute("user", new Empleado());
        return "nuevos-empleados";
    }
    //Muestra la pagina del formulario con relacion a la bases de datos movimiento:
    @GetMapping("/movimiento/nuevo-montodinero")
    public String nuevoMontoDinero(Model modelU){
        modelU.addAttribute("movimiento", new MovimientoDinero());
        return "nuevo-montodinero";
    }
}