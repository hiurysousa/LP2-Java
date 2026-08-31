package entities;

public class Soma implements OperacaoMatematica{
    private int a;
    private int b;

    public Soma(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calcula(){
        return a+b;
    }
}
