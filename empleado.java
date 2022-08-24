import java.util.Scanner;

class Empleado {
    private String Nombres, Apellidos, id, cargo;
    private int edad;

    Empleado(String Nombres, String Apellidos, String id, String cargo, int edad){
        setNombres(Nombres);
        setApellidos(Apellidos);
        setId(id);
        setCargo(cargo);
        setEdad(edad);
    }

    /* Getters*/
    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public int getEdad() {
        return edad;
    }

    /* Setters */

    public void setNombres(String nombres) {
        this.Nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarEmpleado(){
        System.out.println("\nNombres: " + getNombres() + "\nApellidos: " + getApellidos() + "\nId: " + getId()+
                "\nCargo: " + getCargo() + "\nEdad: " + getEdad() );
    }
}