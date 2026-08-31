package application;
import entities.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Boleto();
        ArrayList<Pagamento> pags = new ArrayList<>();
        pags.add(p1);
        pags.add(p2);

        for (int i = 0; i < pags.size(); i++){
            pags.get(i).processarPagamento(50);
        }
    }
}
