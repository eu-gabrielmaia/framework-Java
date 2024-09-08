package testehibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Cliente {

    @Id
    private int codCliente;

    @Column
    private String nome;

    @Column
    private int idade;

    @Column
    private int telefone;

    public Cliente(int codCliente, String nome, int idade, int telefone) {
        this.codCliente = codCliente;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
