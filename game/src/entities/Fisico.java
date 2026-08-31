package entities;

public class Fisico extends Jogo{
    private String lote;

    public Fisico(String titulo, float preco, String lote){
        super(titulo, preco);
        this.lote = lote;
    }

    public void exibirJogo(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Lote: " + this.lote);
    }
}
