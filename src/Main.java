import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldoInicial = 2500.00;
        double valorRecebido = 0;
        double valorTransferido = 0;
        int operacoes = 0;

        boolean continuar = true;
        while (continuar) {
            System.out.println("*******************************");
            System.out.println("Dados inciais do cliente");
            System.out.println("");
            System.out.println("Nome: Felipe Guimarães");
            System.out.println("Tipo de Conta: Corrente");
            System.out.println(String.format("Saldo Inicial : %.2f", saldoInicial));
            System.out.println("*******************************");
            System.out.println("Operações");
            System.out.println("");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");
            System.out.println("");

            System.out.println("Digite a opção desejada");
            operacoes = leitor.nextInt();
            switch (operacoes) {
                case 1:
                    System.out.println(String.format("Seu saldo é %.2f", saldoInicial));
                    break;
                case 2:
                    System.out.println("Qual o valor recebido?");
                    valorRecebido = leitor.nextDouble();
                    saldoInicial += valorRecebido;
                    System.out.println(String.format("Saldo Atualizado : %.2f", saldoInicial));
                    break;
                case 3:
                    System.out.println("Qual o valor que deseja transferir: ");
                    valorTransferido = leitor.nextDouble();
                    if (valorTransferido > saldoInicial) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldoInicial -= valorTransferido;
                        System.out.println(String.format("Saldo atualizado: %.2f", saldoInicial));
                    }
                    break;
                case 4:
                    System.out.println("Até mais!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}