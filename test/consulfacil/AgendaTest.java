package consulfacil;

import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;


public class AgendaTest {

    private Agenda _agenda;
    private Date _data;
    private Paciente _paciente;
    private Medico _medico;
    private Consultorio _consultorio;
    
    
    public AgendaTest() throws Exception {
        
        _paciente = new Paciente("paciente1", "teste", 123456, 1234565,"16-11-2020", 156489, "teste");
        _medico = new Medico("medico1","teste",123456,12312312,"16/11/2020",456456,456456,"geral");
        _consultorio = new Consultorio("testenome",123456549,"rua teste");
        _agenda = new Agenda ();
        _agenda.setPaciente (_paciente);
        _agenda.setMedico (_medico);
        _agenda.setConsultorio (_consultorio);
    
    
    }
    
    
     /**
     * Test of getPaciente method, of class Agenda.
     */
    @Test
    public void quando_obter_paciente_deve_retornar_sucesso() {
        Paciente result =_agenda.getPaciente();
         assertEquals(_paciente, result);
        
        
        
    }

    /**
     * Test of setPaciente method, of class Agenda.
     */
    @Test
    public void quando_alterar_paciente_deve_retornar_sucesso() {
        Paciente result = new Paciente("paciente2", "teste2", 123456, 1234565,"23/11/2020", 156489, "teste");
        _agenda.setPaciente(result);
        Paciente result2 = _agenda.getPaciente();
        assertEquals(result,result2 );
    }
    
    
    /**
     * Test of getMedico method, of class Agenda.
     */
    @Test
    public void quando_obter_Medico_deve_retornar_sucesso() {
        Medico result =_agenda.getMedico();
        assertEquals(result, _medico);
        
    }

    /**
     * Test of setMedico method, of class Agenda.
     */
    @Test
    public void quando_alterar_Medico_deve_retornar_sucesso() {
        Medico result = new Medico("medico2","teste2",123456,12312312,"23/11/2020",456456,456456,"geral");
        _agenda.setMedico(result);
        Medico result2 = _agenda.getMedico();
        assertEquals(result,result2 );
        
    }
    
    
     /**
     * Test of getConsultorio method, of class Agenda.
     */
    @Test
    public void quando_obter_Consultorio_deve_retornar_sucesso() {
        Consultorio result =_agenda.getConsultorio();
         assertEquals(result, _consultorio);
        
    }

    /**
     * Test of setConsultorio method, of class Agenda.
     */
    @Test
    public void quando_alterar_Consultorio_deve_retornar_sucesso() {
        Consultorio result = new Consultorio("testenome2",123456549,"rua teste");
        _agenda.setConsultorio(result);
        Consultorio result2 = _agenda.getConsultorio();
        assertEquals(result,result2 );
    }
    

}
