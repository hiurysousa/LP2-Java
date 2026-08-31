package entities;

public class Casa {
    private int numPortas;
    private int numJanelas;
    private String endereco;

    public Casa(int numPortas, int numJanelas, String endereco){
        this.numPortas = numPortas;
        this.numJanelas = numJanelas;
        this.endereco = endereco;
    }

    public void addPorta(){
        numPortas++;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getNumJanelas() {
        return numJanelas;
    }

    public void setNumJanelas(int numJanelas) {
        this.numJanelas = numJanelas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirCasa(){
        System.out.printf("Casa -> numPortas: %d | numJanelas: %d | endereco: %s\n", this.numPortas, this.numJanelas, this.getEndereco());
    }

}