package entities;
import entities.Casa;

public class Aluguel extends Casa{
    private float valorAluguel;

    public Aluguel(int numPortas, int numJanelas, String endereco, float valorAluguel) {
        super(numPortas, numJanelas, endereco);

        this.valorAluguel = valorAluguel;
    }

    public void setValorAluguel(float valorAluguel){
        this.valorAluguel = valorAluguel;
    }

    public float getValorAluguel(){
        return valorAluguel;
    }

    public void exibirCasa(){
        super.exibirCasa();
        System.out.printf(" | Valor do Aluguel: R$ %.2f", getValorAluguel());
    }

}
