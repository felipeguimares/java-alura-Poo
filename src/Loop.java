import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme");
        String filme =  leitura.nextLine();
        System.out.println("Qual o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual a nota você dá para esse filme");
        double nota = leitura.nextDouble();
    }
}
