package consulfacil;


import org.junit.Test;
import static org.junit.Assert.*;


public class AlergiaTest {

    private Alergia _alergia;
    private String _nome;
    
    
    public AlergiaTest() throws Exception {
        
        _nome = "leite";
        _alergia = new Alergia(_nome);        
    
    }
    
    /**
     * Test of getNome method, of class Alergia.
     */
    @Test
    public void quando_obter_Nome_deve_retornar_sucesso() {
        String result =_alergia.getNome();
         assertEquals(result, _nome);
    }

     /**
     * Test of setNome method, of class Alergia.
     */
    @Test
    public void quando_alterar_Nome_deve_retornar_sucesso() {
        String result =  "ovo";
        _alergia.setNome(result);
        String result2 = _alergia.getNome();
        assertEquals(result, result2);
    }

}
