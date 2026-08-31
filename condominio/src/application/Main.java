package application;
import entities.Casa;
import entities.Aluguel;
import entities.Venda;

public class Main {
    public static void main(String[] args){
        Casa casa1 = new Casa(5, 3, "Centro");
        Casa casa2 = new Casa(20, 10, "Sitio");
        Casa casa3 = new Aluguel(2,5, "Broadaway", 500);
        Casa casa4 = new Venda(10, 30, "Barão de Messejana", 70000);

        casa1.exibirCasa();
        casa2.exibirCasa();
        casa3.exibirCasa();
        casa4.exibirCasa();
    }
}
