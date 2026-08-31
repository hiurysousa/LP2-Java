package application;
import entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Joao", 1000);
        Funcionario f2 = new Funcionario("Pamela", 2000);
        Funcionario f3 = new Funcionario("Maria", 1500);
        Gerente g1 = new Gerente("Hiury", 8000, 750);
        Gerente g2 = new Gerente("Rita", 7500, 300);
        Gerente g3 = new Gerente("Noah", 6000, 200);
        ArrayList<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(f1, f2, f3, g1, g2, g3));


        for (int i = 0; i < funcionarios.size(); i++){
            Funcionario func = funcionarios.get(i);
            System.out.printf(func.getNome() + ": R$ %.2f\n", func.calcularSalario());
        }


    }
}