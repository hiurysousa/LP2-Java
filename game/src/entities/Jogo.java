package entities;

public abstract class Jogo {
    private String titulo;
    private float preco;

    public Jogo(String titulo, float preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public float getPreco(){
        return this.preco;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public abstract void exibirJogo();

}
