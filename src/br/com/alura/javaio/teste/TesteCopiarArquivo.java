package br.com.alura.javaio.teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        //Fluxo de Entrada com Arquivo
        InputStream fis = s.getInputStream(); //System.in; //new FileInputStream("arquivo.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        //Fluxo de Saída com Arquivo
        OutputStream fos = s.getOutputStream(); //System.out; //new FileOutputStream("arquivo3.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha  = br.readLine();
        }
        br.close();
        bw.close();
    }
}
