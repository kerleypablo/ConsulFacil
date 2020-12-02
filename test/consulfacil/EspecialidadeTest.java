package consulfacil;


import org.junit.Test;
import static org.junit.Assert.*;


public class EspecialidadeTest {

    private Especialidade _especialidade;
    private String _nome;
    
    
    public EspecialidadeTest() throws Exception {
        
        _nome = "clinico geral";
        _especialidade = new Especialidade(_nome);        
    
    }
    
    /**
     * Test of getNome method, of class Especialidade.
     */
    @Test
    public void quando_obter_Nome_deve_retornar_sucesso() {
        String result =_especialidade.getNome();
         assertEquals(result, _nome);
    }

     /**
     * Test of setNome method, of class Especialidade.
     */
    @Test
    public void quando_alterar_Nome_deve_retornar_sucesso() {
        String result =  "gastroenterologista";
        _especialidade.setNome(result);
        String result2 = _especialidade.getNome();
        assertEquals(result, result2);
    }

}
 
