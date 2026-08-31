package entities;

public abstract class Conta {
    protected int numero;
    protected String titular;
    protected double saldo;

    Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero(){
        return numero;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo-=valor;
        } else {
            System.out.println("Saldo insuficiente para realizar saque.");
        }
    }

    public void exibirExtrato(){
        System.out.printf("Numero: %d | Titular: %s | Saldo: R$ %.2f", getNumero(), getTitular(), getSaldo());
    }

}
