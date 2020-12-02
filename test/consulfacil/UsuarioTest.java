package consulfacil;

import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {

    private Usuario _usuario;
    private String _nome;
    private String _email;
    private Integer _senha ;
    private Integer _telefone;
    private String _dtaNascimento ;
    
    
    public UsuarioTest() throws Exception {
        
        _nome = "usuario1";
        _email = "teste1";
        _senha = 123456;
        _telefone = 112345;
        _dtaNascimento = "22/11/2020";
        _usuario = new Usuario (_nome, _email, _senha, _telefone, _dtaNascimento);
    
    
    }
    
    
    /**
     * Test of getNome method, of class Usuario.
     */
    @Test
    public void quando_obter_Nome_deve_retornar_sucesso() {
        String result =_usuario.getNome();
         assertEquals(result, _nome);
    }

     /**
     * Test of setNome method, of class Usuario.
     */
    @Test
    public void quando_alterar_Nome_deve_retornar_sucesso() {
        String result =  "usuario2";
        _usuario.setNome(result);
        String result2 = _usuario.getNome();
        assertEquals(result, result2);
    }
    
    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void quando_obter_Email_deve_retornar_sucesso() {
        String result =_usuario.getEmail();
         assertEquals(result, _email);
    }

     /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void quando_alterar_Email_deve_retornar_sucesso() {
        String result =  "teste2";
        _usuario.setEmail(result);
        String result2 = _usuario.getEmail();
        assertEquals(result, result2);
    }
    
    /**
     * Test of getSenha method, of class Usuario.
     */
    @Test
    public void quando_obter_Senha_deve_retornar_sucesso() {
         Integer result =_usuario.getSenha();
         assertEquals(result, _senha);
    }

    /**
     * Test of setSenha method, of class Usuario.
     */
    @Test
    public void quando_alterar_Senha_deve_retornar_sucesso() {
        Integer result = 123654;
        _usuario.setSenha(result);
        Integer result2 = _usuario.getSenha();
        assertEquals(result, result2, 123654);
    }
    
    
     /**
     * Test of getTelefone method, of class Usuario.
     */
    @Test
    public void quando_obter_Telefone_deve_retornar_sucesso() {
         Integer result =_usuario.getTelefone();
         assertEquals(result, _telefone);
    }

    /**
     * Test of setTelefone method, of class Usuario.
     */
    @Test
    public void quando_alterar_Telefone_deve_retornar_sucesso() {
        Integer result = 112354;
        _usuario.setTelefone(result);
        Integer result2 = _usuario.getTelefone();
        assertEquals(result, result2, 112354);
    }
    
     /**
     * Test of getDtaNascimento method, of class Usuario.
     */
    @Test
    public void quando_obter_DtaNascimento_deve_retornar_sucesso() {
        String result =_usuario.getDtaNascimento();
         assertEquals(result, _dtaNascimento);
    }

     /**
     * Test of setDtaNascimento method, of class Usuario.
     */
    @Test
    public void quando_alterar_DtaNascimento_deve_retornar_sucesso() {
        String result =  "21/11/2020";
        _usuario.setDtaNascimento(result);
        String result2 = _usuario.getDtaNascimento();
        assertEquals(result, result2);
    }




}
