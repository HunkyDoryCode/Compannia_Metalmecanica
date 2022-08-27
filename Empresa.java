public class Empresa {
    private String empresa, direccion;
    private int telefono, nit;
    //constructor

    public Empresa(String empresa, String direccion, int telefono, int nit) {
        this.empresa = empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    //GETTERS AND SETTERS

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "empresa='" + empresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", nit=" + nit +
                '}';
    }
}


