
import entidades.Employee;
import entidades.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

    public class Program {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            List<Employee> list = new ArrayList<>();

            System.out.print("Digite o numero de funcionarios: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Funcionario " + i );
                System.out.print("Terceirizado? ");
                char ch = sc.next().charAt(0);
                System.out.print("Nome: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Quantidade de Horas: ");
                int hours = sc.nextInt();
                System.out.print("Valor por horas: ");
                double valuePerHour = sc.nextDouble();
                if (ch == 'y') {
                    System.out.print("Bonus adicional ");
                    double additionalCharge = sc.nextDouble();
                    list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
                } else {
                    list.add(new Employee(name, hours, valuePerHour));
                }
            }

            System.out.println();
            System.out.println("Pagamentos:");
            for (Employee emp : list) {
                System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
            }



            sc.close();
        }
    }
