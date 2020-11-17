/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulfacil;


import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Kerley Pablo
 */
public class ConsultaTest {
    
    private Consulta _consulta; 
    private Agenda _agenda;
    private Paciente _paciente;
    private Medico _medico;
    private Consultorio _consultorio;
    private Double _valor;
    private String _tipo;
    private Convenio _convenio;
    private Consulta _consulta2;
    
    
    
   
    
    public ConsultaTest() throws Exception {
        _agenda = new Agenda();
        _paciente = new Paciente("paciente1", "teste", 123456, 1234565,"16-11-2020", 156489, "teste");
        _medico = new Medico("medico1","teste",123456,12312312,"16/11/2020",456456,456456,"geral");
        _consultorio = new Consultorio("testenome",123456549,"rua teste");
        _valor = 200.0;
        _tipo = "geral";
        _convenio = new Convenio("unimed");
        _consulta  = new Consulta(_agenda, _paciente, _medico, _consultorio, _valor, _tipo);
        
        _consulta2  = new Consulta(_agenda, _paciente, _medico, _consultorio, _tipo , _convenio);
   
        
    }

    /**
     * Test of getAgenda method, of class Consulta.
     */
    @Test
    public void quando_obter_agenda_deve_retornar_sucesso() {
         Agenda result =_consulta.getAgenda();
         assertEquals(result, _agenda);
        
  
    }

    /**
     * Test of setAgenda method, of class Consulta.
     */
    @Test
    public void quando_alterar_agenda_deve_retornar_sucesso(){
        Agenda result = new Agenda();
        _consulta.setAgenda(result);
        Agenda result2 = _consulta.getAgenda();
        assertEquals(result,result2 );
        
        
    }

    /**
     * Test of getPaciente method, of class Consulta.
     */
    @Test
    public void quando_obter_paciente_deve_retornar_sucesso() {
        Paciente result =_consulta.getPaciente();
         assertEquals(_paciente, result);
        
        
        
    }

    /**
     * Test of setPaciente method, of class Consulta.
     */
    @Test
    public void quando_alterar_paciente_deve_retornar_sucesso() {
        Paciente result = new Paciente("paciente2", "teste", 123456, 1234565,"16/11/2020", 156489, "teste");
        _consulta.setPaciente(result);
        Paciente result2 = _consulta.getPaciente();
        assertEquals(result,result2 );
    }

    /**
     * Test of getMedico method, of class Consulta.
     */
    @Test
    public void quando_obter_Medico_deve_retornar_sucesso() {
        Medico result =_consulta.getMedico();
         assertEquals(result, _medico);
        
    }

    /**
     * Test of setMedico method, of class Consulta.
     */
    @Test
    public void quando_alterar_Medico_deve_retornar_sucesso() {
         Medico result = new Medico("medico2","teste",123456,12312312,"16/11/2020",456456,456456,"geral");
        _consulta.setMedico(result);
        Medico result2 = _consulta.getMedico();
        assertEquals(result,result2 );
        
    }

    /**
     * Test of getConsultorio method, of class Consulta.
     */
    @Test
    public void quando_obter_Consultorio_deve_retornar_sucesso() {
        Consultorio result =_consulta.getConsultorio();
         assertEquals(result, _consultorio);
        
    }

    /**
     * Test of setConsultorio method, of class Consulta.
     */
    @Test
    public void quando_alterar_Consultorio_deve_retornar_sucesso() {
        Consultorio result = new Consultorio("testenome2",123456549,"rua teste");
        _consulta.setConsultorio(result);
        Consultorio result2 = _consulta.getConsultorio();
        assertEquals(result,result2 );
    }

    /**
     * Test of getValor method, of class Consulta.
     */
    @Test
    public void quando_obter_Valor_deve_retornar_sucesso() {
         Double result =_consulta.getValor();
         assertEquals(result, _valor);
    }

    /**
     * Test of setValor method, of class Consulta.
     */
    @Test
    public void quando_alterar_Valor_deve_retornar_sucesso() {
        Double result =  300.0;
        _consulta.setValor(result);
        double result2 = _consulta.getValor();
        assertEquals(result, result2, 300.0);
    }

    /**
     * Test of getTipo method, of class Consulta.
     */
    @Test
    public void quando_obter_Tipo_deve_retornar_sucesso() {
        String result =_consulta.getTipo();
         assertEquals(result, _tipo);
    }

    /**
     * Test of setTipo method, of class Consulta.
     */
    @Test
    public void quando_alterar_Tipo_deve_retornar_sucesso() {
        String result =  "cirurgao";
        _consulta.setTipo(result);
        String result2 = _consulta.getTipo();
        assertEquals(result, result2);
    }

    /**
     * Test of getConvenio method, of class Consulta.
     */
    @Test
    public void quando_obter_Convenio_deve_retornar_sucesso() {
        Convenio result =_consulta2.getConvenio();
         assertEquals(result, _convenio);
        
    }

    /**
     * Test of setConvenio method, of class Consulta.
     */
    @Test
    public void quando_alterar_Convenio_deve_retornar_sucesso() {
        Convenio result = new Convenio("outro");
        _consulta.setConvenio(result);
        Convenio result2 = _consulta.getConvenio();
        assertEquals(result,result2 );
        
    }
    
}
