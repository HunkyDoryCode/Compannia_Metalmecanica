import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {

    public static void main (String[] args) {
        //objetos
        Empleado empleado = new Empleado("carlos", "carmondi@gmai.com", "latam", "FP");
        MovimientoDinero movimiento = new MovimientoDinero(1000, "Pago Luz");
        Empresa empresa = new Empresa("latam", "Carrera 87", 876878, 876876);

        movimiento.setMonto(-2000);
        System.out.println(movimiento.getMonto());
        //creación arreglo
        List<Empleado> listaEmpleados = new ArrayList<>();
        //agrego elementos
        listaEmpleados.add(empleado);
        //for para recorrer el array listaEmpleados
        /*for(int i=0; i<listaEmpleados.size();i++){
            System.out.println(listaEmpleados.get(0).toString());
        }*/

        //consulto al usuario
        Scanner entrada = new Scanner(in);
        String name;
        System.out.println("Ingrese el nombre");
        name = entrada.nextLine();
        empleado.setNombre(name);
        System.out.println(empleado);
    }
}
