package entities;
import entities.Casa;

public class Venda extends Casa {
    private float valorVenda;

    public Venda (int numPortas, int numJanelas, String endereco, float valorVenda){
        super(numPortas, numJanelas, endereco);
        this.valorVenda = valorVenda;
    }

    public float getValorVenda(){
        return this.valorVenda;
    }

    public void setValorVenda(float valorVenda){
        this.valorVenda = valorVenda;
    }
}
