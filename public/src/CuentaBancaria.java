public class CuentaBancaria {
    private int numeroCuenta, saldo;
    public String tipoCuenta;

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void mostrarDetalles(){
        System.out.println("Numero de cuenta: "+numeroCuenta+", Saldo: "+saldo+", Tipo de Cuenta: "+tipoCuenta);
    }

}
