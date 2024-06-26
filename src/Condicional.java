public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";
        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento do momento!");
        } else {
            System.out.println("Filme Clássico!");
        }
        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Bom Filme");
        } else {
            System.out.println("Assine já!");
        }
    }
}