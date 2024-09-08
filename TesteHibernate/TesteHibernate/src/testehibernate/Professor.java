package testehibernate;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table

public class Professor {

    @Id
    private int codProf;

    @Column
    private String nome;

    @Column
    private double salario;

    @Column
    private int cargaHoraria;

    public Professor(int codProf, String nome, double salario, int cargaHoraria) {
        this.codProf = codProf;
        this.nome = nome;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }


    public int getCodProf() {
        return codProf;
    }

    public void setCodProf(int codProf) {
        this.codProf = codProf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
