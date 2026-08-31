package entities;

public class ContaCorrente extends Conta{
    protected double limiteChequeEspecial;

    public ContaCorrente(int numero, String titular, double chequeEspecial){
        super(numero, titular);
        this.limiteChequeEspecial = chequeEspecial;
    }

    public double getLimiteChequeEspecial(){
        return this.limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double chequeEspecial){
        this.limiteChequeEspecial += chequeEspecial;
    }

    @Override
    public void sacar(double valor){
        if (valor <= getSaldo() + this.limiteChequeEspecial){
            this.saldo -= valor;
            System.out.printf("Saque efetuado com sucesso. Saldo atual: %.2f\n", this.saldo);
        } else {
            System.out.println("Não foi possível finalizar a operação.");
        }
    }

    @Override
    public void exibirExtrato(){
        super.exibirExtrato();
        System.out.printf(" | Cheque Especial: R$ %.2f", getLimiteChequeEspecial());
    }

}
