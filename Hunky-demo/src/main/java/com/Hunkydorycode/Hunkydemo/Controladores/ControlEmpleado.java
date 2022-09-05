package com.Hunkydorycode.Hunkydemo.Controladores;

//Importacion el paquete o carpeta de la Entidad de la clase Empleado:
import com.Hunkydorycode.Hunkydemo.Entidades.Empleado;
//Importacion del paquete ServicioEmpleado:
import com.Hunkydorycode.Hunkydemo.Servicios.ServiciosEmpleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlEmpleado {
    //Atributo:
    //Relacion del paquete o carpeta ServicioEmpleado:
    ServiciosEmpleado servicesE;

    //Constructor de Controlempleado:
    public ControlEmpleado(){
        //Creacion del constructor con objeto abstracto ServicesE, instanciandolo y relacionandolo con ServicioEmpleado:
        this.servicesE = new ServiciosEmpleado();
    }

    //visualizacion:
    @GetMapping("/users")

    //Crear metodo publico
    public Empleado ControlEmpleado(){
        //retorno la informacion
        return this.servicesE.getEmpleado();
    }
}
