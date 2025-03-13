package Bridge_Builder_Visitor;

public class AtendimentoDetalhado {
	private String medico;
    private String paciente;
    private String diagnostico;

    private AtendimentoDetalhado(AtendimentoBuilder builder) {
        this.medico = builder.medico;
        this.paciente = builder.paciente;
        this.diagnostico = builder.diagnostico;
    }

    public String getDescricao() {
        return "Médico: " + medico + ", Paciente: " + paciente + ", Diagnóstico: " + diagnostico;
    }
}
