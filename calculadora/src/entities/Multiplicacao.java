package entities;

public class Multiplicacao implements OperacaoMatematica{
    private int a;
    private int b;

    public Multiplicacao(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calcula(){
        return a*b;
    }
}
