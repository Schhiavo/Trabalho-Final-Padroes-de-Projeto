package Bridge_Builder_Visitor;

public class AtendimentoBuilder {
	private String medico;
    private String paciente;
    private String diagnostico;

    public AtendimentoBuilder setMedico(String medico) {
        this.medico = medico;
        return this;
    }

    public AtendimentoBuilder setPaciente(String paciente) {
        this.paciente = paciente;
        return this;
    }

    public AtendimentoBuilder setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
        return this;
    }

    public AtendimentoDetalhado build() {
        return new AtendimentoDetalhado(this);
    }
}
