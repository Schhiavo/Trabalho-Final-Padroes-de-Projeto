package ClassesPadroes;
import Observer_State_Singleton.*;
import Abstract_Factory.*;
import Bridge_Builder_Visitor.*;
import Strategy.*;
import java.util.Observable;

public class Paciente extends Observable {
	private Registro registro;
	private String nome;
	private EstadoPaciente estado;
	
	public Paciente(RegistroFactory registroFactory) {
		this.estado = EstadoPacienteAnamnese.getInstance();
		this.registro = registroFactory.createRegistro();
	     
	}
	
	public String emitirRegistro() {
        return this.registro.emitir();
    }
		
	public boolean colocarEmAnamnese() {
		setChanged();
        notifyObservers();
		return estado.colocarEmAnamnese(this);
	}
	
	public boolean internar() {
		setChanged();
        notifyObservers();
		return estado.internar(this);
	}
	
	public boolean declararAlta() {
		setChanged();
        notifyObservers();
		return estado.declararAlta(this);
	}
	
	public boolean declaraObito() {
		setChanged();
        notifyObservers();
		return estado.declararObito(this);
	}
	
	public void setEstado(EstadoPaciente estado) {
		this.estado = estado;
	}
	
	public String getNomeEstado() {
        return estado.getEstado();
    }
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public EstadoPaciente getEstado() {
    	return estado;
    }

}
