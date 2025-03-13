package Observer_State_Singleton;
import ClassesPadroes.*;
public class EstadoPacienteAnamnese extends EstadoPaciente {
	private EstadoPacienteAnamnese() {};
	private static EstadoPacienteAnamnese instance = new EstadoPacienteAnamnese();
	
	public static EstadoPacienteAnamnese getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Em anamnese";
	}
	
	public boolean internar(Paciente paciente) {
		paciente.setEstado(EstadoPacienteInternado.getInstance());
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
