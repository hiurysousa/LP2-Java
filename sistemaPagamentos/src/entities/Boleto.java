package entities;

public class Boleto implements Pagamento{
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$ " + valor + " foi feito via boleto.");
    }

}
