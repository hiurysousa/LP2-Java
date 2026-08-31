package entities;

public abstract class ContaAbstrata {
    private float saldo;

    ContaAbstrata(float saldo){
        this.saldo = saldo;
    }

    public abstract void depositar(float valor);
    public abstract void sacar(float valor);

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
