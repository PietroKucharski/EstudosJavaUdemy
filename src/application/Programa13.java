package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Exercicio 01 - negativos
            Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
            e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
        */

        /*
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");


        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }*/

        /*
        Exercicio 02 - soma_vetor
            Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
            - Imprimir todos os elementos do vetor
            - Mostrar na tela a soma e a média dos elementos do vetor
        */

        /*
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / n;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("VALORES = %.1f ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);*/

        /*
        Exercicio 03 - alturas
            Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
            tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
            bem como os nomes dessas pessoas caso houver
        */

        /*System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double somaDasAlturas = 0.0;

        for (int i = 0; i < n; i++) {
            somaDasAlturas += altura[i];
        }

        double mediaDasAlturas = somaDasAlturas / n;

        int qtdMenor = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                qtdMenor++;
            }
        }

        double procentMenorIdade = ((double) qtdMenor / n) * 100.0;


        System.out.printf("\nAltura media = %.2f\n", mediaDasAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", procentMenorIdade);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }*/

        /*
        Exercicio 04 - numeros_pares
            Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
            tela todos os números pares, e também a quantidade de números pares.
        */

        /* System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        int qtdPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d  ", vetor[i]);
                qtdPares++;
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + qtdPares);*/

        /*
        Exercicio 05 - soma_vetores
            Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
            terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
            o vetor C gerado.
        */

        /* System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  \n", vetorC[i]);
        }*/

        /*
        Exercicio 06 - abaixo_da_media
            Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
            mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
            os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
        */

        /* System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double somaNumerosVetor = 0;

        for (int i = 0; i < n; i++) {
            somaNumerosVetor += numeros[i];
        }

        double media = somaNumerosVetor / n;
        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i++) {
            if(numeros[i] < media) {
                System.out.printf("%.1f\n", numeros[i]);
            }
        }*/

        /*
        Exercício 07 - maior_posicao
            Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
            o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
            considerando a primeira posição como 0 (zero).
        */

        /* System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double maiorValor = vetor[0];
        int posicaoMaiorValor = 0;

        for (int i = 1; i < n; i++) {
            if(vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
        System.out.print("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);*/

        /*
        Exercício 08 - media_pares
            Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
            aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
            digitado, mostrar a mensagem "NENHUM NUMERO PAR"
        */

        /*System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int somaValoresPares = 0;
        int numerosPares = 0;

        for (int i = 0; i < n; i++) {

            if (vetor[i] % 2 == 0) {
                somaValoresPares += vetor[i];
                numerosPares++;
            }
        }

        if (numerosPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double mediaPares = (double) somaValoresPares / numerosPares;

            System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
        }*/

        /*
        Exercício 09 - mais_velho
            Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
            devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
            da pessoa mais velha
        */

        /*System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);

            System.out.print("Nome: ");
            nome[i] = sc.next();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int idadeMaior = idade[0];
        int indicePessoaMaisVelha = 0;


        for (int i = 0; i > n; i++) {
            if (idade[i] < idadeMaior) {
                idadeMaior = idade[i];
                indicePessoaMaisVelha = i;
            }

        }

        System.out.printf("PESSOA MAIS VELHA: %s", nome[indicePessoaMaisVelha]);*/

        /*
        Exercício 10 - aprovados
            Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
            no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
            os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
            igual a 6.0 (seis).
        */

        /* System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] primeiraNota = new double[n];
        double[] segundaNota = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            primeiraNota[i] = sc.nextDouble();
            segundaNota[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < n; i++) {
            if((primeiraNota[i] + segundaNota[i]) / 2 >= 6.0) {
                System.out.printf("%s \n", nomes[i]);
            }
        }*/

        /*
        Exercício 11 - dados_pessoas
             Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
             que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
             de homens
        */

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            sc.nextLine();

            System.out.printf("Gênero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];

        for (int i = 0; i < n; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            } else if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }

        double somaAlturasMulheres = 0.0;

        int qtdMulheresTotais = 0;
        int qtdHomensTotais = 0;


        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') {
                qtdHomensTotais++;
            } else {
                somaAlturasMulheres += altura[i];
                qtdMulheresTotais++;
            }
        }

        double mediaAlturaMulheres = somaAlturasMulheres / qtdMulheresTotais;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d\n", qtdHomensTotais);
    }
}
