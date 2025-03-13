package Bridge_Builder_Visitor;

public class VisitorTHRIFT implements Visitor{
    @Override
    public String gerarRelatorioDeAtendimentos(AtendimentoMedico atendimentoMedico){
        return atendimentoMedico.getDados() + "#124@112";
    }
}