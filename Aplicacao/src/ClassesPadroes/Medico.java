package ClassesPadroes;
import Observer_State_Singleton.*;
import Abstract_Factory.*;
import Bridge_Builder_Visitor.*;
import Strategy.*;
import java.util.Observable;

public class Medico implements Observer {
	private String nome;
	private String ultimaNotificacao;
	private AtendimentoMedico atendimentoMedico;
	
	public Medico(String nome) {
		this.nome = nome;
	}
	
	public String getUltimaNotificacao() {
		return this.ultimaNotificacao;
	}
	
	public void update(Observable paciente, Object arg1) {
		this.ultimaNotificacao = paciente.toString(); 
	}

}
