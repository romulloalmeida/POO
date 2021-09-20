package Aula07.Mesa;

import Aula07.Endereco;
import Aula07.Telefone;

public class Cliente {
    private String nome;
    private Telefone telefone;
    private Endereco endereco;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }
}
