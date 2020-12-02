package consulfacil;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import org.junit.Test;
import static org.junit.Assert.*;


public class MedicoTest {
    
    private Medico _medico;
    private String _nome;
    private String _email;
    private Integer _senha;
    private Integer _telefone;
    private String _dtaNascimento;
    private Integer _crm;
    private Integer _cnpj;
    private String _nomeEspc;
    private Arquivo _arquivo;
    private Paciente _paciente;
    private Consultorio _consultorio;
    private Especialidade _especialidade;
    private Agenda _agenda;
    
    
    public MedicoTest() throws Exception {
        
        _nome = "medico1";
        _email = "teste";
        _senha = 123456;
        _telefone = 12312312;
        _dtaNascimento = "16/11/2020";
        _crm = 456456;
        _cnpj = 456456;
        _nomeEspc = "geral";
        _arquivo = new Arquivo ();
        _paciente = new Paciente ("paciente1", "teste", 123456, 1234565,"16-11-2020", 156489, "teste");
        _consultorio = new Consultorio ("testenome",123456549,"rua teste");
        _especialidade = new Especialidade (_nomeEspc);
        _agenda = new Agenda ();
        _medico = new Medico (_nome, _email, _senha, _telefone, _dtaNascimento, _crm, _cnpj, _nomeEspc);
    
    }


/**
     * Test of getAgenda method, of class Medico.
     */
    @Test
    public void quando_obter_agenda_deve_retornar_sucesso() {
         Agenda result =_medico.getAgenda();
         assertEquals(result, _agenda);
        
  
    }

    /**
     * Test of setAgenda method, of class Medico.
     */
    @Test
    public void quando_alterar_agenda_deve_retornar_sucesso(){
        Agenda result = new Agenda();
        _medico.setAgenda(result);
        Agenda result2 = _medico.getAgenda();
        assertEquals(result,result2 );
        
        
    }
    
    /**
     * Test of getCrm method, of class Medico.
     */
    @Test
    public void quando_obter_Crm_deve_retornar_sucesso() {
         Integer result =_medico.getCrm();
         assertEquals(result, _crm);
    }

    /**
     * Test of setCrm method, of class Medico.
     */
    @Test
    public void quando_alterar_Crm_deve_retornar_sucesso() {
        Integer result = 456789;
        _medico.setCrm(result);
        Integer result2 = _medico.getCrm();
        assertEquals(result, result2, 456789);
    }

    
    /**
     * Test of getCnpj method, of class Medico.
     */
    @Test
    public void quando_obter_Cnpj_deve_retornar_sucesso() {
         Integer result =_medico.getCnpj();
         assertEquals(result, _cnpj);
    }

    /**
     * Test of setCnpj method, of class Medico.
     */
    @Test
    public void quando_alterar_Cnpj_deve_retornar_sucesso() {
        Integer result = 456789;
        _medico.setCnpj(result);
        Integer result2 = _medico.getCnpj();
        assertEquals(result, result2, 456789);
    }
    
    /**
     * Test of getArquivo method, of class Medico.
     */
    @Test
    public void quando_obter_Arquivo_deve_retornar_sucesso() {
         Arquivo result =_medico.getArquivo();
         assertEquals(result, _arquivo);
        
  
    }

    /**
     * Test of setArquivo method, of class Medico.
     */
    @Test
    public void quando_alterar_Arquivo_deve_retornar_sucesso(){
        Arquivo result = new Arquivo();
        _medico.setArquivo(result);
        Arquivo result2 = _medico.getArquivo();
        assertEquals(result,result2 );
        
        
    }
    
    /**
     * Test of getPacientes method, of class Medico.
     */
    @Test
    public void quando_obter_paciente_deve_retornar_sucesso() {
        Paciente result =_medico.getPacientes();
         assertEquals(_paciente, result);
        
        
        
    }

    /**
     * Test of setPacientes method, of class Medico.
     */
    @Test
    public void quando_alterar_paciente_deve_retornar_sucesso() {
        Paciente result = new Paciente("paciente2", "teste", 123456, 1234565,"16/11/2020", 156489, "teste");
        _medico.setPacientes(result);
        Paciente result2 = _medico.getPacientes();
        assertEquals(result,result2 );
    }

    
     /**
     * Test of getConsultorio method, of class Medico.
     */
    @Test
    public void quando_obter_Consultorio_deve_retornar_sucesso() {
        Consultorio result =_medico.getConsultorio();
         assertEquals(result, _consultorio);
        
    }

    /**
     * Test of setConsultorio method, of class Medico.
     */
    @Test
    public void quando_alterar_Consultorio_deve_retornar_sucesso() {
        Consultorio result = new Consultorio("testenome2",123456549,"rua teste");
        _medico.setConsultorio(result);
        Consultorio result2 = _medico.getConsultorio();
        assertEquals(result,result2 );
    }
    
    
    
     /**
     * Test of getEspecialidade method, of class Medico.
     */
    @Test
    public void quando_obter_Especialidade_deve_retornar_sucesso() {
        Especialidade result =_medico.getEspecialidade();
         assertEquals(result, _especialidade);
        
    }

    /**
     * Test of setEspecialidade method, of class Medico.
     */
    @Test
    public void quando_alterar_Especialidade_deve_retornar_sucesso() {
        Especialidade result = new Especialidade("cardiologista");
        _medico.setEspecialidade(result);
        Especialidade result2 = _medico.getEspecialidade();
        assertEquals(result,result2 );
    }
 
    
    


}
