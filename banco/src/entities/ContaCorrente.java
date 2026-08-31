package entities;

public class ContaCorrente extends ContaAbstrata{

    public ContaCorrente(float saldo){
        super(saldo);
    }

    public void depositar(float valor){
       setSaldo(getSaldo() + valor);
    }

    public void sacar(float valor){
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso...");
        }
        System.out.println("Impossível efetuar a operação.");
    }

}
