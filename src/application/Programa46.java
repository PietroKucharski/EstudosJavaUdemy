package application;

import entities.Product07;

import java.io.*;
import java.util.*;

public class Programa46 {
    public static void main(String[] args) {
        /*Exercício proposto
        Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos. Cada item possui um
        nome, preço unitário e quantidade, separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
        localizado em uma subpasta chamada "out" a partir da pasta original do arquivo de origem, contendo apenas o nome
        e o valor total para aquele item (preço unitário multiplicado pela quantidade)

        Classs Product07 -> name:String; price:Double; quantity:Integer; totalValue():Double
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product07> list = new ArrayList<>();

        System.out.println("Enter a file path: ");
        String strFilePath = sc.nextLine();

        File sourceFile = new File(strFilePath);
        String sourceFolderPath = sourceFile.getParent();

        boolean success = new File(sourceFolderPath + "\\out").mkdir();

        String targetFileStr = sourceFolderPath + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(strFilePath))) {
            String itemCsv = br.readLine();

            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product07(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product07 item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.totalValue()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
