package Observer_State_Singleton;

public class EstadoPacienteObito {
    private EstadoPacienteObito() {};
	private static EstadoPacienteObito instance = new EstadoPacienteObito();
	
	public static EstadoPacienteObito getInstance() {
		return instance;
	}
	
	public String getEstado() {
		return "Estado de óbito";
	}
}
