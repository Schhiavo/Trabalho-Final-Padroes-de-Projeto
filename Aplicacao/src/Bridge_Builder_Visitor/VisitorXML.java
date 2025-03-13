package Bridge_Builder_Visitor;

public class VisitorXML implements Visitor{
    @Override
    public String gerarRelatorioDeAtendimentos(AtendimentoMedico atendimentoMedico){
        return "\" <Information> \" \"" + atendimentoMedico.getDados() + "\ </Information>";
    }
}