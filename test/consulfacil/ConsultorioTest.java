package consulfacil;


import org.junit.Test;
import static org.junit.Assert.*;


public class ConsultorioTest {

    private Consultorio _consultorio;
    private String _nome;
    private Integer _telefone;
    private String _endereco;
    private Medico _medico;

    
    public ConsultorioTest() throws Exception {
        
        _nome = "testenome";
        _telefone = 123456549;
        _endereco = "rua teste";
        _medico = new Medico("medico1","teste",123456,12312312,"16/11/2020",456456,456456,"geral");
        _consultorio = new Consultorio(_nome, _telefone, _endereco);        
    
    }
    
    /**
     * Test of getMedico method, of class Consultorio.
     */
    @Test
    public void quando_obter_Medico_deve_retornar_sucesso() {
        Medico result =_consultorio.getMedico();
         assertEquals(result, _medico);
        
    }

    /**
     * Test of setMedico method, of class Consultorio.
     */
    @Test
    public void quando_alterar_Medico_deve_retornar_sucesso() {
        Medico result = new Medico("medico2","teste",123456,12312312,"16/11/2020",456456,456456,"geral");
        _consultorio.setMedico(result);
        Medico result2 = _consultorio.getMedico();
        assertEquals(result,result2);
        
    }
    
    /**
     * Test of getNome method, of class Consultorio.
     */
    @Test
    public void quando_obter_Nome_deve_retornar_sucesso() {
        String result =_consultorio.getNome();
         assertEquals(result, _nome);
    }

     /**
     * Test of setNome method, of class Consultorio.
     */
    @Test
    public void quando_alterar_Nome_deve_retornar_sucesso() {
        String result =  "testenome2";
        _consultorio.setNome(result);
        String result2 = _consultorio.getNome();
        assertEquals(result, result2);
    }
    
    
    /**
     * Test of getTelefone method, of class Consultorio.
     */
    @Test
    public void quando_obter_Telefone_deve_retornar_sucesso() {
         Integer result =_consultorio.getTelefone();
         assertEquals(result, _telefone);
    }

    /**
     * Test of setTelefone method, of class Consultorio.
     */
    @Test
    public void quando_alterar_Telefone_deve_retornar_sucesso() {
        Integer result = 123321456;
        _consultorio.setTelefone(result);
        Integer result2 = _consultorio.getTelefone();
        assertEquals(result, result2, 123321456);
    }
    
    
    /**
     * Test of getEndereco method, of class Consultorio.
     */
    @Test
    public void quando_obter_Endereco_deve_retornar_sucesso() {
        String result =_consultorio.getEndereco();
         assertEquals(result, _endereco);
    }

     /**
     * Test of setEndereco method, of class Consultorio.
     */
    @Test
    public void quando_alterar_Endereco_deve_retornar_sucesso() {
        String result = "rua teste2";
        _consultorio.setEndereco(result);
        String result2 = _consultorio.getEndereco();
        assertEquals(result, result2);
    }



}
