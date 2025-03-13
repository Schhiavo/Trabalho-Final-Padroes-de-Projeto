package Strategy;

public class PixPagamentoStrategy implements PagamentoStrategy{
    private String chavePix;
    public PixPagamentoStrategy(String chavePix){
        this.chavePix = chavePix;
    }
    @Override
    public void pagar(double quantidade){
        return "Pago R$ " + quantidade + "via pix para a chave " + this.chavePix;
    }
}