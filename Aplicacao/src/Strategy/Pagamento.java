package Strategy;

public class Pagamento{
    private PagamentoStrategy pagamentoStrategy;

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy){
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void pagarValor(double quantidade){
        if(this.pagamentoStrategy == null){
            return "Estratégia de pagamento não definida";
        }
        pagamentoStrategy.pagar(quantidade);
    }

}