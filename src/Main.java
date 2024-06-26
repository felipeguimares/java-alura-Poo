public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao ScreenMatch");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        //Validação para informar se está na assinatura ou não o filme
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // Média calculada do filme
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Nota do filme " + media);
        String sinopse;
        sinopse = """
                Filme de aventura
                Estrelado por Tom Cruise
                Ano de Lançamento: """ + anoDeLancamento;
        System.out.println(sinopse);



    }
}




