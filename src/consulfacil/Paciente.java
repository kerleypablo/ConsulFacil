/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulfacil;

import java.util.Date;

/**
 *
 * @author Kerley Pablo
 */
public class Paciente extends Usuario {
    
    private Integer cpf;
    private String profissao;
    private Prontuario prontuario;
    private Arquivo arquivo;

    public Paciente(String nome, String email, Integer senha, Integer telefone, Date dtaNascimento, Integer cpf ,String profissao) {
        super(nome, email, senha, telefone, dtaNascimento);
        
       this.cpf = cpf;
       this.profissao = profissao;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public void setProntuario(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }
    
    
    
    public void addNota(String nota){
        arquivo.addNota(nota);
    }
    
    
    
    
    
    
}
