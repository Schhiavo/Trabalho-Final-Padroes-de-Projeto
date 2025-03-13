package Bridge_Builder_Visitor;

public class AtendimentoMedico extends Atendimento{
	private AtendimentoDetalhado detalhes;
    private String dados;

    public AtendimentoMedico(TipoAtendimento tipoAtendimento, AtendimentoDetalhado detalhes) {
        super(tipoAtendimento);
        this.detalhes = detalhes;
        this.dados = "Informações de exemplo";
    }

    @Override
    public void realizarAtendimento() {
        tipoAtendimento.processarAtendimento(detalhes.getDescricao());
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProntuario(this);
    }

    public getDados() {
        return this.dados;
    }
}
