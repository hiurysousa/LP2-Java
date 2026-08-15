public class Casa {
    private int numPortas;
    private int numJanelas;
    private String endereco;

    Casa(int numPortas, int numJanelas, String endereco){
        this.numPortas = numPortas;
        this.numJanelas = numJanelas;
        this.endereco = endereco;
    }

    Casa(String endereco){
        this.endereco = endereco;
    }

    Casa(){

    }

    public void addPorta(){
        numPortas++;
    }
}
