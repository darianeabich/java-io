package br.com.alura.javaio.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no BytebankOne.
 *
 * @author dariane.abich
 * @version 0.1
 */
public class Cliente implements Serializable {

    private static final long serialVersionUID = 6177349415805533843L;

    String nome;
    String cpf;
    String profissao;

    public String getNomeCpf(){
        return nome + "," + cpf;
    }

    public String getNomeCpfProfissao(){
        return nome + "," + cpf + ", " + profissao;
    }

    public Cliente() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
