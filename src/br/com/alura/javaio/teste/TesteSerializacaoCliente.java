package br.com.alura.javaio.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Nico");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("12345679895");
//
////        Criação do objeto
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
    }
}
