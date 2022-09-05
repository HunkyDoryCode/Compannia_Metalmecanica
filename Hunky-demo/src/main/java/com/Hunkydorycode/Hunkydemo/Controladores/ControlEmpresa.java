package com.Hunkydorycode.Hunkydemo.Controladores;
//Importacion de la Entidades clase Empresa:
import com.Hunkydorycode.Hunkydemo.Entidades.Empresa;

//Importacion de la relacion Paquete o carpeta Servicios ServiciosEmpresa:
import com.Hunkydorycode.Hunkydemo.Servicios.ServiciosEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Enviar REQUERIMIENTOS:
@RestController
public class ControlEmpresa {
    //conviertamos en recursos:
    //Anotaciones:

    /*
    @GetMapping("/vista1")
    //Pruebas de visualizaciones:
    //metodo para visualizar el mensaje directo:

    public String visualizar(){
        //retornar el mensaje:
        return "Primera vista de una web con springboot Agosto 27";
    }

    //De nuevo nesecitamos mappear, para que se visualice en la pagina o url
    @GetMapping("/vista2")
    //Creacion de metodo con la clase "ControlEmpresa":
    public Empresa ControlEmpresa(){
        //Visualizacion de mostrar un objeto:
        Empresa enti1 = new Empresa("HunkyDoryCode", "CRA 88", 3894080, 89830803, null);
        return enti1;
    }
    */

    //Importar la relaicion ServicioEmpresa:
    //Creacion del atributo, para relacionar la informacio a modo de vista:
    ServiciosEmpresa services;

    //Creacion del Constructor de la clase "ControlEmpresa":
    public ControlEmpresa(){
        //En el contructor nos referemos, cada vez que hagamos busque en el navegador
        //dando la instancia resultado de la clase servidor "Servicios Empresa", como objeto abstracto:

        //nuevo objeto abtrastato en el constructor, instanciado y relacionado con ServiciosEmpresa
        this.services = new ServiciosEmpresa();
    }

    //Mapear: visualiza en la ruta de la pagina
    @GetMapping ("/enterprises")

    //Metodo para visualizar la informacion:
    public List<Empresa> verEmpresa(){
        //retornar pero imbocaremos el dato que creamos anteriormente:
        return this.services.getListaEntidades();
    }
}



