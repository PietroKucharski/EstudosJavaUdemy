package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa43 {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\pietr\\Documents\\JavaUdemy\\Arquivos_teste\\out.txt";

        // Acrescentando o parâmetro true depois de path dentro do FileWriter ele irá recriar o arquivo e acrescentar novas informações
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
