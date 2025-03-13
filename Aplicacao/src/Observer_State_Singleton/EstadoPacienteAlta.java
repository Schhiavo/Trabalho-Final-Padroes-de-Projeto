package Observer_State_Singleton;

public class EstadoPacienteAlta extends EstadoPaciente {
	private EstadoPacienteAlta() {};
	private static EstadoPacienteAlta instance = new EstadoPacienteAlta();
	
	public static EstadoPacienteAlta getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Alta do episódio";
	}
	
}
