package consulfacil;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;


public class PacienteTest {
    
    private Paciente _paciente;
    private String _nome;
    private String _email;
    private Integer _senha;
    private Integer _telefone;
    private String _dtaNascimento;
    private Integer _cpf;
    private String _profissao;
    private Prontuario _prontuario;
    private Arquivo _arquivo;
    private Agenda _agenda;
    
    
    public PacienteTest() throws Exception {
    
        _nome = "paciente1";
        _email = "teste";
        _senha = 123456;
        _telefone = 1234565;
        _dtaNascimento = "16-11-2020";
        _cpf = 1223344;
        _profissao = "professor";
        _prontuario = new Prontuario ("A+");
        _arquivo = new Arquivo ();
        _agenda = new Agenda ();
        _paciente = new Paciente (_nome, _email, _senha, _telefone, _dtaNascimento, _cpf, _profissao);
    
    
    }
    
    /**
     * Test of getProntuario method, of class Paciente.
     */
    @Test
    public void quando_obter_Prontuario_deve_retornar_sucesso() {
        Prontuario result =_paciente.getProntuario();
         assertEquals(result, _prontuario);
        
    }

    /**
     * Test of setProntuario method, of class Paciente.
     */
    @Test
    public void quando_alterar_Prontuario_deve_retornar_sucesso() {
        Prontuario result = new Prontuario("A-");
        _paciente.setProntuario(result);
        Prontuario result2 = _paciente.getProntuario();
        assertEquals(result,result2 );
    }

    
     /**
     * Test of getArquivo method, of class Paciente.
     */
    @Test
    public void quando_obter_Arquivo_deve_retornar_sucesso() {
         Arquivo result =_paciente.getArquivo();
         assertEquals(result, _arquivo);
        
  
    }

    /**
     * Test of setArquivo method, of class Paciente.
     */
    @Test
    public void quando_alterar_Arquivo_deve_retornar_sucesso(){
        Arquivo result = new Arquivo();
        _paciente.setArquivo(result);
        Arquivo result2 = _paciente.getArquivo();
        assertEquals(result,result2 );
        
    }
    
    /**
     * Test of getAgenda method, of class Paciente.
     */
    @Test
    public void quando_obter_agenda_deve_retornar_sucesso() {
         Agenda result =_paciente.getAgenda();
         assertEquals(result, _agenda);
        
  
    }

    /**
     * Test of setAgenda method, of class Paciente.
     */
    @Test
    public void quando_alterar_agenda_deve_retornar_sucesso(){
        Agenda result = new Agenda();
        _paciente.setAgenda(result);
        Agenda result2 = _paciente.getAgenda();
        assertEquals(result,result2 );
        
        
    }


}
