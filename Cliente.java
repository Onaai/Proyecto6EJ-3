public class Cliente implements Runnable {
    private CuentaBancaria cuenta;

    public Cliente(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        // Simular operaciones de retiro y depósito
        cuenta.depositar(100);
        cuenta.retirar(50);
    }
}
