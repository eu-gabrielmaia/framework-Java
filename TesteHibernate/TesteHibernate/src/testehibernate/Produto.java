package testehibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Produto {

    @Id
    private int codProduto;

    @Column
    private String descricao;

    @Column
    private double preco;

    @Column
    private int quantidade;

    public Produto(int codProduto, String descricao, double preco, int quantidade) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
