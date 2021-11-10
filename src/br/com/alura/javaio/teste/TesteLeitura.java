package br.com.alura.javaio.teste;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
        InputStream fis = new FileInputStream("arquivo.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine(); //ler somente uma linha (1ª)
        while (linha != null) { //iterar pelas linhas para exibir o texto inteiro
            System.out.println(linha);
            linha  = br.readLine();
        }
        br.close();
    }
}
