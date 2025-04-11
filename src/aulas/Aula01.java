package aulas;

public class Aula01 {
    public static void main(String[] args) {
        // Com quebra de linha
        System.out.println("Hello World");
        System.out.println("Hello World");

        // Sem quebra de linha
        System.out.print("Hello World");
        System.out.print("Hello World");

        // Declaração de variável
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);

        // Formatação para casas decimais
        //Locale.setDefault(Locale.US); // Formatar para ponto ao invés de virgula
        System.out.printf("%.4f%n", x);

        // Fazer a concatenação de strings e variáveis
        System.out.println("Resultado = " + x + " metros");

        // Fazer a concatenação de strings e variáveis utilizando o printf
        System.out.printf("Resultado = %.2f metros%n", x);

        // Fazer a concatenação de strings e variáveis utilizando o printf com várias variáveis
        String nome = "Pietro";
        int idade = 23;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
    }
}
