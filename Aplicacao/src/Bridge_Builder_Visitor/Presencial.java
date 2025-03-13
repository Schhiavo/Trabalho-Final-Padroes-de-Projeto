package Bridge_Builder_Visitor;

public class Presencial implements TipoAtendimento {
	public void processarAtendimento(String detalhes) {
        System.out.println("Atendimento PRESENCIAL realizado: " + detalhes);
    }
}
