package entities;

public class ContaPoupanca extends Conta{
    protected double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double taxaRendimento){
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento(){
        return this.taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros(){
        this.saldo += this.saldo * taxaRendimento;
    }

    @Override
    public void exibirExtrato(){
        super.exibirExtrato();
        System.out.printf(" | Taxa de Rendimento: %.1f ", getTaxaRendimento()*100);
    }
}
