package Bridge_Builder_Visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VisitorTeste {

    AtendimentoBuilder builder = new AtendimentoBuilder();
    builder.setMedico = "Medico_Exemplo";
    builder.setPaciente = "Paciente_Exemplo";
    builder.setDiagnostico = "Cirrose";
    AtendimentoDetalhado atendimentoDetalhado = new AtendimentoDetalhado(builder);
    Presencial atendimentoPresencial = new Presencial();
    Telemedicina atendimentoTelemedicina = new Telemedicina();


	@Test
    public void testeVisitorTHRIFT() {
        AtendimentoMedico atendimento = new AtendimentoMedico(atendimentoPresencial, atendimentoDetalhado);
        Visitor visitor = new VisitorTHRIFT();
        assertEquals("Médico: Medico_Exemplo , Paciente: Paciente_Exemplo, Diagnóstico:  Cirrose #124@112", atendimento.aceitar(visitor));
    }

    @Test
    public void testVisitorJson() {
        AtendimentoMedico atendimento = new AtendimentoMedico(atendimentoPresencial, atendimentoDetalhado);
        Visitor visitor = new VisitorJSON();
        assertEquals("{ \"Dados\": Médico: Medico_Exemplo , Paciente: Paciente_Exemplo, Diagnóstico:  Cirrose #124@112 }", atendimento.aceitar(visitor));
    }

    @Test
    public void testVisitorXML() {
        AtendimentoMedico atendimento = new AtendimentoMedico(atendimentoPresencial, atendimentoDetalhado);
        Visitor visitor = new VisitorXML();
        assertEquals("<Information> Médico: Medico_Exemplo , Paciente: Paciente_Exemplo, Diagnóstico:  Cirrose #124@112 </Information>", atendimento.aceitar(visitor));
    }
}