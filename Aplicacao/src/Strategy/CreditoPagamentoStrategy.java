package Strategy;

public class CreditoPagamentoStrategy implements PagamentoStrategy{
    private string numeroDoCartao;
    public CreditoPagamentoStrategy(String numeroDoCartao){
        this.numeroDoCartao = numeroDoCartao;
    }
    @Override
    public void pagar(double quantidade){
        return "Pago R$ " + quantidade + "com cartão de crédito " + this.numeroDoCartao;
    }
}