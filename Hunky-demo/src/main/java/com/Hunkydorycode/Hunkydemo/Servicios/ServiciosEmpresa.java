package com.Hunkydorycode.Hunkydemo.Servicios;

//Importacion clase empleado del paquete o carpeta Empresa
import com.Hunkydorycode.Hunkydemo.Entidades.Empresa;

//Importacion del arraylist, con relacion a la entidad y controlador:
import java.util.ArrayList;
//Importacion de la lista
import java.util.List;

public class ServiciosEmpresa {
        //Atributos del tipo empresa, ya que vamos a interactuar sobre un objeto:
        Empresa entidad1;
        Empresa entidad2;
        //Creacion del objeto:
        //Tabla de la cuenta, movimientos, empleados entre otros.
        List<Empresa> listaEntidades;
        //nuevo atributo para buscar la informacion de ServiciosEmpresa, sin crear el objeto pero sin instanciar

        //lo relacionamos con ServiciosEmpleados, pero cree una instancia con un objeto abstracto:
        ServiciosEmpleado emp = new ServiciosEmpleado();



        //Creacion Constructores de ServicioEmpresa:
        public ServiciosEmpresa(){
            //Instanciamos:
            this.entidad1 = new Empresa("HunkyDoryCode", "CRA 88", 3894080, 89830803, null);
            this.entidad2 = new Empresa("Hunkydorycode", "Calle 110", 7894513, 83794790, null);

            //Nuevo contructor, con objeto abstracto para utilizar listas e instanciandolo con ArrayList():
            this.listaEntidades = new ArrayList<>();

            //Creacion del objeto de la lista:
            //Agregar o adicionar los elementos del arraylist:
            listaEntidades.add(entidad1);
            listaEntidades.add(entidad2);
        }


        //Metodo getter ->obtenemos los datos de la Lista Empresa:
        public List<Empresa> getListaEntidades(){
            //retornar:
            return this.listaEntidades;

        }
    }


