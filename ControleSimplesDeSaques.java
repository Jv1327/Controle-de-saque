import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;

        while (true) {
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    double valorDeposito = Double.parseDouble(scanner.nextLine());
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSaque = Double.parseDouble(scanner.nextLine());
                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Programa encerrado.");
                        scanner.close();
                        return;
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
