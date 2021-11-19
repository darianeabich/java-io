package br.com.alura.javaio.teste;

import java.io.*;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
        //Fluxo de Saída com Arquivo
//        OutputStream fos = new FileOutputStream("arquivo2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo2.txt"));

//        PrintStream ps = new PrintStream(new File("arquivo2.txt"));

        PrintWriter ps = new PrintWriter("arquivo.txt");

        ps.println("It's a new dawn");
        ps.println();
        ps.println("It's a new day");

        ps.close();
    }
}
