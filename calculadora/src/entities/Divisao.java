package entities;

public class Divisao implements OperacaoMatematica{
    private int a;
    private int b;

    public Divisao(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calcula(){
        return a/b;
    }
}
