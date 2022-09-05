package com.Hunkydorycode.Hunkydemo.Servicios;

//Importacion clase empleado del paquete o carpeta Empleado
import com.Hunkydorycode.Hunkydemo.Entidades.Empleado;

public class ServiciosEmpleado {
        //Atributo, creando un objeto abstracto (Es decir objeto que no tiende datos de otras clases):
        Empleado us1;

        //Creacion del constructor:
        public ServiciosEmpleado(){
            this.us1 = new Empleado("carlos", "carmondi@gmail.com", "latam", "FP");

        }
        //Creacion del metodo Empleado, para relacionar:
        public Empleado getEmpleado(){
            //retorna
            return us1;
        }
    }


