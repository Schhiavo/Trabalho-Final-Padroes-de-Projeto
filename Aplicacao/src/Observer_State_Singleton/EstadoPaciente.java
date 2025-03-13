package Observer_State_Singleton;
import ClassesPadroes.*;

public abstract class EstadoPaciente {
	public abstract String getEstado();
	
	public boolean colocarEmAnamnese(Paciente paciente) {
		return false;
	}
	
	public boolean internar(Paciente paciente) {
		return false;
	}
	
	public boolean declararAlta(Paciente paciente) {
		return false;
	}
	
	public boolean declararObito(Paciente paciente) {
		return false;
	}
	
}
