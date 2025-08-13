package AulaModulo4.AulaQuatroEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex1 {
    public static void main(String[] args) throws IOException {

        FileWriter write = new FileWriter("arquivos.txt");
        write.write("Conteúdo a ser gravado no arquivo.");
        write.close();

        /*String conteudo = Files.readString(Paths.get("arquivos.txt"));
        System.out.println(conteudo);*/

    }
}
