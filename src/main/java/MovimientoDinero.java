public class MovimientoDinero {
    private double monto;
    private String concepto;

    //constructor

    public MovimientoDinero(double monto, String concepto) {
        this.monto = monto;
        this.concepto = concepto;
    }

    //setters and getters
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public double saldo(){
        int saldo = 0;
        return saldo;
    }
    public String registroPor(){
        String usuario="";

        return usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + getMonto() +
                ", concepto='" + getConcepto() + '\'' +
                '}';
    }
}


