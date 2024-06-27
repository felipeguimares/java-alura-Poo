import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Qual a nota você dá para esse filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println(String.format("Media de avaliação %.2f",mediaAvaliacao/3));


    }
}
