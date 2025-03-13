package Bridge_Builder_Visitor;

public abstract class Atendimento {
	protected TipoAtendimento tipoAtendimento;

    public Atendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public abstract void realizarAtendimento();
}
