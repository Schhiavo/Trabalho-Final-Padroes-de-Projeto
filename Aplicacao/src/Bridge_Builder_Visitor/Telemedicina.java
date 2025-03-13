package Bridge_Builder_Visitor;

public class Telemedicina implements TipoAtendimento {
	public void processarAtendimento(String detalhes) {
        System.out.println("Atendimento por TELEMEDICINA realizado: " + detalhes);
    }
}
