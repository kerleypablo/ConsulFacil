package consulfacil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;


public class ArquivoTest {
    
    private Arquivo _arquivo;
    private Medico _medico;
    private Paciente _paciente;
    private File _receita;
    private File _pedidoexame;
    private String _nota;
    
    
    public ArquivoTest() throws Exception {
    
        _medico = new Medico("medico1","teste",123456,12312312,"16/11/2020",456456,456456,"geral");
        _paciente = new Paciente("paciente1", "teste", 123456, 1234565,"16-11-2020", 156489, "teste");
        _receita = new File ("teste1.txt");
        _receita.createNewFile();
        _pedidoexame = new File ("teste10.txt");
        _pedidoexame.createNewFile();
        _nota = "teste";
        _arquivo = new Arquivo ();
        _arquivo.setMedico (_medico);
        _arquivo.setPaciente (_paciente);
        _arquivo.setReceita (_receita);
        _arquivo.setPedidoExame (_pedidoexame);
        _arquivo.setNota (_nota);
    
    
    }
    
    
     /**
     * Test of getReceita method, of class Arquivo.
     */
    @Test
    public void quando_obter_receita_deve_retornar_sucesso() {
        File result =_arquivo.getReceita();
         assertEquals(_receita, result);
        
        
        
    }

    /**
     * Test of setReceita method, of class Arquivo.
     */
    @Test
    public void quando_alterar_receita_deve_retornar_sucesso() {
        File result = new File ("teste2.txt");
        result.createNewFile();
        _arquivo.setReceita(result);
        File result2 = _arquivo.getReceita();
        assertEquals(result,result2 );
    }
    
     /**
     * Test of getPedidoExame method, of class Arquivo.
     */
    @Test
    public void quando_obter_PedidoExame_deve_retornar_sucesso() {
        File result =_arquivo.getPedidoExame();
         assertEquals(_pedidoexame, result);
        
        
        
    }

    /**
     * Test of setPedidoExame method, of class Arquivo.
     */
    @Test
    public void quando_alterar_PedidoExame_deve_retornar_sucesso() {
        File result = new File ("teste20.txt");
        result.createNewFile();
        _arquivo.setPedidoExame(result);
        File result2 = _arquivo.getPedidoExame();
        assertEquals(result,result2 );
    }
    
    
    /**
     * Test of getNota method, of class Arquivo.
     */
    @Test
    public void quando_obter_Nota_deve_retornar_sucesso() {
        String result =_arquivo.getNota();
         assertEquals(result, _nota);
    }

     /**
     * Test of setNota method, of class Arquivo.
     */
    @Test
    public void quando_alterar_Nota_deve_retornar_sucesso() {
        String result =  "teste2";
        _arquivo.setNota(result);
        String result2 = _arquivo.getNota();
        assertEquals(result, result2);
    }
    
    
    /**
     * Test of getMedico method, of class Arquivo.
     */
    @Test
    public void quando_obter_Medico_deve_retornar_sucesso() {
        Medico result =_arquivo.getMedico();
        assertEquals(result, _medico);
        
    }

    /**
     * Test of setMedico method, of class Arquivo.
     */
    @Test
    public void quando_alterar_Medico_deve_retornar_sucesso() {
        Medico result = new Medico("medico2","teste2",123456,12312312,"23/11/2020",456456,456456,"geral");
        _arquivo.setMedico(result);
        Medico result2 = _arquivo.getMedico();
        assertEquals(result,result2 );
        
    }
    
     /**
     * Test of getPaciente method, of class Arquivo.
     */
    @Test
    public void quando_obter_paciente_deve_retornar_sucesso() {
        Paciente result =_arquivo.getPaciente();
         assertEquals(_paciente, result);
        
        
        
    }

    /**
     * Test of setPaciente method, of class Arquivo.
     */
    @Test
    public void quando_alterar_paciente_deve_retornar_sucesso() {
        Paciente result = new Paciente("paciente2", "teste2", 123456, 1234565,"23/11/2020", 156489, "teste");
        _arquivo.setPaciente(result);
        Paciente result2 = _arquivo.getPaciente();
        assertEquals(result,result2 );
    }


}
