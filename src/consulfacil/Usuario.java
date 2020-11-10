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
public class Usuario {
    
    private String nome;
    private String email;
    private Integer senha ;
    private Integer telefone;
    private Date dtaNascimento;

    public Usuario(String nome, String email, Integer senha, Integer telefone, Date dtaNascimento) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.dtaNascimento = dtaNascimento;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Date getDtaNascimento() {
        return dtaNascimento;
    }

    public void setDtaNascimento(Date dtaNascimento) {
        this.dtaNascimento = dtaNascimento;
    }
    
    
    public void  alterarSenha(String nome, Integer senhaAntiga , Integer senhaNova){
       if (senhaAntiga.equals(getSenha()))
        setSenha(senhaNova);
    }
    
    public void  esqueciSenha(String nome, String email , Integer senhaNova){
       if (email.equals(getEmail()))
        setSenha(senhaNova);
    }
    
    
 
}
