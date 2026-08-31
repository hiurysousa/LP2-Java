package application;
import entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ContaCorrente c1 = new ContaCorrente(10, "Hiury", 200);
        ContaPoupanca c2 = new ContaPoupanca(20, "Ryan", 0.05);
        ArrayList<Conta> contas = new ArrayList<Conta>();

        contas.add(c1);
        contas.add(c2);

        c1.depositar(1000);
        c1.sacar(1200);

        c2.depositar(1000);
        c2.renderJuros();

        for (int i = 0 ; i < contas.size(); i++){
            Conta cont = contas.get(i);
            cont.exibirExtrato();
            System.out.println("\n");
        }
    }
}
