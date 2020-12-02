package consulfacil;


import org.junit.Test;
import static org.junit.Assert.*;


public class ConvenioTest {

    private Convenio _convenio;
    private String _nome;
    
    
    public ConvenioTest() throws Exception {
        
        _nome = "unimed";
        _convenio = new Convenio(_nome);        
    
    }
    
    /**
     * Test of getNome method, of class Convenio.
     */
    @Test
    public void quando_obter_Nome_deve_retornar_sucesso() {
        String result =_convenio.getNome();
         assertEquals(result, _nome);
    }

     /**
     * Test of setNome method, of class Convenio.
     */
    @Test
    public void quando_alterar_Nome_deve_retornar_sucesso() {
        String result =  "amil";
        _convenio.setNome(result);
        String result2 = _convenio.getNome();
        assertEquals(result, result2);
    }

}
 
