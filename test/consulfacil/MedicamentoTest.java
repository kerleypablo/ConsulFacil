package consulfacil;


import org.junit.Test;
import static org.junit.Assert.*;


public class MedicamentoTest {

    private Medicamento _medicamento;
    private String _NomeMedic;
    
    
    public MedicamentoTest() throws Exception {
        
        _NomeMedic = "aspirina";
        _medicamento = new Medicamento(_NomeMedic);        
    
    }
    
    /**
     * Test of getNomeMedic method, of class Medicamento.
     */
    @Test
    public void quando_obter_NomeMedic_deve_retornar_sucesso() {
        String result =_medicamento.getNomeMedic();
         assertEquals(result, _NomeMedic);
    }

     /**
     * Test of setNomeMedic method, of class Medicamento.
     */
    @Test
    public void quando_alterar_NomeMedic_deve_retornar_sucesso() {
        String result =  "omeprazol";
        _medicamento.setNomeMedic(result);
        String result2 = _medicamento.getNomeMedic();
        assertEquals(result, result2);
    }

}
 
