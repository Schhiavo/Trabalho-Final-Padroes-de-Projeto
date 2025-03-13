package Observer_State_Singleton;

public class EstadoPacienteInternado extends EstadoPaciente{
	private EstadoPacienteInternado() {};
	private static EstadoPacienteInternado instance = new EstadoPacienteInternado();
	
	public static EstadoPacienteInternado getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Internado";
	}
	
	public boolean colocarEmAnamnese(Paciente paciente) {
		paciente.setEstado(EstadoPacienteAnamnese.getInstance());
		return true;
	}
	
	public boolean declararObito(Paciente paciente) {
		paciente.setEstado(EstadoPacienteObito.getInstance());
		return true;
	}
	
	public boolean declararAlta(Paciente paciente) {
		paciente.setEstado(EstadoPacienteAlta.getInstance());
		return true;
	}
}
