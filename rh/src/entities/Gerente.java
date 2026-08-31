package entities;

public class Gerente extends Funcionario{
    private double bonificacao;

    public Gerente(String nome, double salarioBase, double bonificacao){
        super(nome, salarioBase);
        this.bonificacao = bonificacao;
    }

    public double getBonificacao(){
        return bonificacao;
    }

    public void setBonificacao(double bonificacao){
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + bonificacao;
    }
}
