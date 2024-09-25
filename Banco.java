public class Banco {
    public static void main(String[] args) {
        // Crear una cuenta bancaria con saldo inicial de 200
        CuentaBancaria cuenta = new CuentaBancaria(200);

        // Crear varios clientes (threads) que operarán sobre la cuenta bancaria
        Thread cliente1 = new Thread(new Cliente(cuenta), "Cliente 1");
        Thread cliente2 = new Thread(new Cliente(cuenta), "Cliente 2");
        Thread cliente3 = new Thread(new Cliente(cuenta), "Cliente 3");

        // Iniciar los threads
        cliente1.start();
        cliente2.start();
        cliente3.start();
    }
}
