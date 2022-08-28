import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {

    public static void main (String[] args) {
        //Objeto empleado instanciado con la clase Empleado
        Empleado empleado = new Empleado("carlos", "carmondi@gmai.com", "latam", "FP");
        //Objeto empleado instanciado con la clase Movimiento Dinero
        MovimientoDinero movimiento = new MovimientoDinero(1000, "Pago Luz");
        //Objeto empleado instanciado con la clase Empresa
        Empresa empresa = new Empresa("latam", "Carrera 87", 876878, 876876);



        //Impresion Objeto Empresa:
        System.out.println(empleado);

        //Impresion objeto MovimientoDinero
        movimiento.setMonto(-2000);//
        System.out.println(movimiento.getMonto());

        //Impresion objeto Empresa
        System.out.println(empresa);


        //Consultar al usuario:
        Scanner entrada = new Scanner(in);
        String name;
        System.out.println("Ingrese el nombre");
        name = entrada.nextLine();
        empleado.setNombre(name);
        System.out.println(empleado);

        //consulto la movimiento dinero

        Scanner entradaysalida = new Scanner(in);
        String movement;
        System.out.println("Registre el monto");
        movement = entradaysalida.nextLine();
        movimiento.setConcepto(movement);
        System.out.println(movimiento);

        //consulto la empresa

        Scanner entidades = new Scanner(in);
        String bussines;
        System.out.println("Que entidad es");
        bussines = entidades.nextLine();
        empresa.setEmpresa(bussines);
        System.out.println(bussines);
        
    }





        /*
        //creación arreglo
        List<Empleado> listaEmpleados = new ArrayList<>();
        //agrego elementos
        listaEmpleados.add(empleado);
        */


        //for para recorrer el array listaEmpleados
        /*for(int i=0; i<listaEmpleados.size();i++){
            System.out.println(listaEmpleados.get(0).toString());
        }*/




}

