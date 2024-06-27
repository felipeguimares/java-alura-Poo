//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao ScreenWatch");
        int anoDeLancamento = 2022;
        double media = (9.8 + 6.3 + 8.0) / 3;
        String sinopse = """
                         Filme: Top Gun: Maverick
                         Estrelado por Tom Cruise
                         Muito Bom!
                         Ano de Lançamento: 
                         """ +anoDeLancamento;
        System.out.println(sinopse);
        int classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
}



