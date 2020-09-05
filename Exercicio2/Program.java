package Exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();





        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");



        System.out.println("Numero: ");
        int numero = sc.nextInt();
        System.out.println("Data (dd/mm/yyyy): ");
        Date data = sdf.parse(sc.next());




        System.out.println("Valor: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);
        System.out.println("Número de parcelas: ");
        int parc = sc.nextInt();





        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(data.getTime());
        String dataAtual = sdf.format(new Date());




        ContratoService contService = new ContratoService(new Paypal());
        contService.processaContrato(contrato, parc);

        

        }
}
