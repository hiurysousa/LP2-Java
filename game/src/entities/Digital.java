package entities;

public class Digital extends Jogo{
    private int codigo;

    public Digital(String titulo, float preco, int codigo){
        super(titulo, preco);
        this.codigo = codigo;
    }

    public void exibirJogo(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Código: " + this.codigo);
    }
}
