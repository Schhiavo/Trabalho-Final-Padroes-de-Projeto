package Observer_State_Singleton;
import ClassesPadroes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstadoPacienteTeste {
	Paciente paciente;
	
	@BeforeEach
    public void setUp() {
        paciente = new Paciente();
    }

//PACIENTE EM ANAMNESE ----------------------------------------------------------------------------

    @Test
    public void naoDeveColocarEmAnamnesePacienteEmAnamnese() {
        paciente.setEstado(EstadoPacienteAnamnese.getInstance());
        assertFalse(paciente.colocarEmAnamnese());
    }

    @Test
    public void deveColocarEmObito() {
        paciente.setEstado(EstadoPacienteObito.getInstance());
        assertTrue(paciente.declararObito());
        assertEquals(EstadoPacienteObito.getInstance(), paciente.getEstado());
    }
    
    @Test
    public void deveColocarEmAlta() {
        paciente.setEstado(EstadoPacienteAlta.getInstance());
        assertTrue(paciente.declararAlta());
        assertEquals(EstadoPacienteAlta.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveInternar() {
        paciente.setEstado(EstadoPacienteInternado.getInstance());
        assertTrue(paciente.internar());
        assertEquals(EstadoPacienteInternado.getInstance(), paciente.getEstado());
    }
    
    
// PACIENTE INTERNADO --------------------------------------------------------------------------------------
    
    @Test
    public void naoDeveInternarPacienteInternado() {
        paciente.setEstado(EstadoPacienteInternado.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void deveColocarEmObito() {
        paciente.setEstado(EstadoPacienteObito.getInstance());
        assertTrue(paciente.declararObito());
        assertEquals(EstadoPacienteObito.getInstance(), paciente.getEstado());
    }
    
    @Test
    public void deveColocarEmAlta() {
        paciente.setEstado(EstadoPacienteAlta.getInstance());
        assertTrue(paciente.declararAlta());
        assertEquals(EstadoPacienteAlta.getInstance(), paciente.getEstado());
    }

    @Test
    public void deveColocarEmAnamnese() {
        paciente.setEstado(EstadoPacienteAnamnese.getInstance());
        assertTrue(paciente.colocarEmAnamnese());
        assertEquals(EstadoPacienteAnamnese.getInstance(), paciente.getEstado());
    }
    
// PACIENTE EM OBITO --------------------------------------------------------------------------------------
 
     @Test
    public void naoDeveDeclararObitoPacienteEmObito() {
        paciente.setEstado(EstadoPacienteObito.getInstance());
        assertFalse(paciente.declaraObito());
    }

    @Test
    public void naoDeveDarAltaPacienteEmObito() {
        paciente.setEstado(EstadoPacienteAlta.getInstance());
        assertFalse(paciente.declararAlta());
    }

    @Test
    public void naoDeveInternarPacienteEmObito() {
        paciente.setEstado(EstadoPacienteInternado.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void naoDeveColocarEmAnamnesePacienteEmObito() {
        paciente.setEstado(EstadoPacienteAnamnese.getInstance());
        assertFalse(paciente.colocarEmAnamnese());
    }
    

// PACIENTE EM ALTA--------------------------------------------------------------------------------------
    @Test
    public void naoDeveDarAltaPacienteEmAlta() {
        paciente.setEstado(EstadoPacienteAlta.getInstance());
        assertFalse(paciente.declararAlta());
    }

    @Test
    public void naoDeveDeclararObitoPacienteEmAlta() {
        paciente.setEstado(EstadoPacienteObito.getInstance());
        assertFalse(paciente.declararObito());
    }

    @Test
    public void naoDeveInternarPacienteEmAlta() {
        paciente.setEstado(EstadoPacienteInternado.getInstance());
        assertFalse(paciente.internar());
    }

    @Test
    public void naoDeveColocarEmAnamnesePacienteEmAlta() {
        paciente.setEstado(EstadoPacienteAnamnese.getInstance());
        assertFalse(paciente.colocarEmAnamnese());
    }
}