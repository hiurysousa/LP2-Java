package application;
import entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Soma s1 = new Soma(10, 2);
        Subtracao s2 = new Subtracao(10,2);
        Multiplicacao m1 = new Multiplicacao(10,2);
        Divisao d1 = new Divisao(10,2);

        OperacaoMatematica[] objs = {s1, s2, m1, d1};

        for(int i = 0; i < objs.length; i++){
            System.out.println(objs[i].calcula());
        }

    }
}
