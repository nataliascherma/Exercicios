import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero: ");
        int number = sc.nextInt();

        System.out.println("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Limite de saque: ");
        double limite = sc.nextDouble();

        Conta conta = new Conta(number, titular, saldo, limite);

        try{
            conta.saque(1000.0);
        }
        catch (ContaExceptions exc) {
            System.out.println("Erro no saque " + exc.getMessage());
        }

    }
}
