package consulfacil;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;



public class ProntuarioTest {

    private Prontuario _prontuario;
    private String _tipoSanguineo;
    private Alergia _alergia;
    private Medicamento _medicamento;
    private Usuario _usuario;
    
    
    public ProntuarioTest() throws Exception {
    
        _tipoSanguineo = "A+";
        _alergia = new Alergia ("leite");
        _medicamento = new Medicamento ("omeprazol");
        _usuario = new Usuario ("usuario1", "teste1", 123456, 112345, "22/11/2020");
        _prontuario = new Prontuario (_tipoSanguineo);
    
    
    }
    
    
    /**
     * Test of getTipoSanguineo method, of class Prontuario.
     */
    @Test
    public void quando_obter_TipoSanguineo_deve_retornar_sucesso() {
        String result =_prontuario.getTipoSanguineo();
         assertEquals(result, _tipoSanguineo);
    }

     /**
     * Test of setTipoSanguineo method, of class Prontuario.
     */
    @Test
    public void quando_alterar_TipoSanguineo_deve_retornar_sucesso() {
        String result =  "A-";
        _prontuario.setTipoSanguineo(result);
        String result2 = _prontuario.getTipoSanguineo();
        assertEquals(result, result2);
    }
    
     /**
     * Test of getUsuario method, of class Prontuario.
     */
    @Test
    public void quando_obter_Usuario_deve_retornar_sucesso() {
        Usuario result =_prontuario.getUsuario();
         assertEquals(result, _usuario);
        
    }

    /**
     * Test of setUsuario method, of class Prontuario.
     */
    @Test
    public void quando_alterar_Usuario_deve_retornar_sucesso() {
        Usuario result = new Usuario ("usuario2", "teste2", 123654, 114523, "21/11/2020");
        _prontuario.setUsuario(result);
        Usuario result2 = _prontuario.getUsuario();
        assertEquals(result,result2);
        
    }
    
    /**
     * Test of getAlergias method, of class Prontuario.
     */
    @Test
    public void quando_obter_Alergia_deve_retornar_sucesso() {
        Alergia result =_prontuario.getAlergias();
        assertEquals(result, _alergia);
        
    }

    /**
     * Test of setAlergias method, of class Prontuario.
     */
    @Test
    public void quando_alterar_Alergia_deve_retornar_sucesso() {
        Alergia result = new Alergia ("ovo");
        _prontuario.setAlergias(result);
        Alergia result2 = _prontuario.getAlergias();
        assertEquals(result,result2);
        
    }
    
    
     /**
     * Test of getMedicamentos method, of class Prontuario.
     */
    @Test
    public void quando_obter_Medicamento_deve_retornar_sucesso() {
        Medicamento result =_prontuario.getMedicamentos();
        assertEquals(result, _medicamento);
        
    }

    /**
     * Test of setMedicamentos method, of class Prontuario.
     */
    @Test
    public void quando_alterar_Medicamento_deve_retornar_sucesso() {
        Medicamento result = new Medicamento ("aspirina");
        _prontuario.setMedicamentos(result);
        Medicamento result2 = _prontuario.getMedicamentos();
        assertEquals(result,result2);
        
    }
    

}
