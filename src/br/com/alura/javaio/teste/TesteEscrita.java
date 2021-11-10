package br.com.alura.javaio.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //Fluxo de Saída com Arquivo
        OutputStream fos = new FileOutputStream("arquivo2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("It's a new dawn");
//        bw.newLine();
        bw.newLine();
        bw.write("It's a new day");

        bw.close();
    }
}
