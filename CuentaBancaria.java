public class CuentaBancaria {
    private int saldo;

    // Códigos de colores ANSI
    public static final String ANSI_RESET = "\u001B[0m"; // Restablecer el color
    public static final String ANSI_RED = "\u001B[31m";  // Rojo
    public static final String ANSI_GREEN = "\u001B[32m"; // Verde

    // Constructor para inicializar la cuenta con un saldo inicial
    public CuentaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }


    public synchronized void retirar(int cantidad) {
        if (saldo >= cantidad) {
            System.out.println(ANSI_RED + Thread.currentThread().getName() + " esta retirando: " + cantidad + ANSI_RESET);
            saldo -= cantidad;
            System.out.println(Thread.currentThread().getName() + " completo la transacción. Saldo actual: " + saldo);
        } else {
            System.out.println(Thread.currentThread().getName() + " no pudo retirar: Fondos insuficientes. Saldo actual: " + saldo);
        }
    }

    // Método sincronizado para depositar dinero
    public synchronized void depositar(int cantidad) {
        System.out.println(ANSI_GREEN + Thread.currentThread().getName() + " esta depositando: " + cantidad + ANSI_RESET);
        saldo += cantidad;
        System.out.println(Thread.currentThread().getName() + " completo la transacción. Saldo actual: " + saldo);
    }

    // Método para consultar el saldo actual
    public int consultarSaldo() {
        return saldo;
    }
}
