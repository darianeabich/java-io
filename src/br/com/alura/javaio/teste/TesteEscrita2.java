package br.com.alura.javaio.teste;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {
        //Fluxo de Saída com Arquivo
//        OutputStream fos = new FileOutputStream("arquivo2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));
        bw.write("It's a new dawn");
        bw.newLine();
//        bw.write(System.lineSeparator());
//        fw.write("\r\n"); // pode ser \r\n ou \n para criar nova linha
        bw.write("It's a new day");

        bw.close();
    }
}
