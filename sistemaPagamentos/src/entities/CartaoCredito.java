package entities;

public class CartaoCredito implements Pagamento{
    public void processarPagamento(double valor){
        System.out.println("Pagamento de RS " + valor + " foi feito via Cartão de Crédito.");
    }

}
