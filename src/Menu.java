public class Menu {
    public static int Menu;{
        Scanner entrada = new Scanner(System.in);
        int option;

        System.out.println("[1] Saldo");
        System.out.println("[2] Retirar");
        System.out.println("[3] Depositar");
        System.out.println("[0] Salir");

        return option;
    }

    public static void main(String[] args) throws IOException {
        int option = 0;
        String saldo;
        BankAccount account = new BankAccount(
                saldo:2000.00
                propietario:"Jose",


        );

        do{
            option=Menu();
        }while(option !=0);
        System.out.println("La opcion seleccionada es: "+ valTemp);
    }

    private static void Menu() {
    }
}
