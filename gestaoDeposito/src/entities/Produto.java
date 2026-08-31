/* 2. Produto de Estoque
Atributos: nome, preco, quantidade
Métodos: adicionarQuantidade(), removerQuantidade() (não deixa ficar negativo), calcularValorTotal() */

package entities;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;

    public Produto(String nome, double preco, double quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /* GETTERS */
    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public double getQuantidade(){
        return this.quantidade;
    }

    /* SETTERS */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(double quantidade){
        this.quantidade += quantidade;
    }

    public void removerQuantidade(double quantidade){
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("\n ** Não é possível remover uma quantidade acima do estoque. **");
        }

    }

    @Override
    public String toString(){
        return "Produto: " + nome + " | Preço: R$ " + preco + " | Quantidade: " + quantidade;
    }
}
