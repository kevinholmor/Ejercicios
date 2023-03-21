public class BankAccount {
        private String propietario;
        private double saldo;

        public BankAccount(String propietario, double saldo) {
            this.propietario = propietario;
            this.saldo = saldo;
        }

        public BankAccount(String propietario) {
            this(propietario, 0.0);
        }

        public String getPropietario() {
            return propietario;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public String toString() {
            return "CuentaBancaria{propietario='" + propietario + "', saldo=" + saldo + "}";
        }

    public static class CuentaBancaria {
        private double saldo;

        public CuentaBancaria(double saldoInicial) {
            saldo = saldoInicial;
        }

        public void depositar(double cantidad) {
            saldo += cantidad;
        }

        public void retirar(double cantidad) {
            if (cantidad > saldo) {
                System.out.println("No hay suficiente saldo en la cuenta");
            } else {
                saldo -= cantidad;
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public class EjemploCuentaBancaria {
        public static void main(String[] args) {
            CuentaBancaria cuenta = new CuentaBancaria(1000.0);
            cuenta.depositar(500.0);
            System.out.println("Saldo después del depósito: " + cuenta.getSaldo());
            cuenta.retirar(200.0);
            System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
            cuenta.retirar(1500.0);
            System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
        }
    }


}
