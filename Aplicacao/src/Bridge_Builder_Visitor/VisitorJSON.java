package Bridge_Builder_Visitor;

public class VisitorJSON implements Visitor{
    @Override
    public String gerarRelatorioDeAtendimentos(AtendimentoMedico atendimentoMedico){
        return "{ \"Dados\": \"" + atendimentoMedico.getDados() + "\" }";
    }
}


