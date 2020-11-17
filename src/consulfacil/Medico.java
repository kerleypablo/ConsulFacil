/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulfacil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

/**
 *
 * @author Kerley Pablo
 */
public class Medico extends Usuario {
    
    private Integer crm;
    private Integer cnpj;
    private Arquivo arquivo;
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Consultorio> consultorio = new ArrayList<>();
    private List<Especialidade> especialidade = new ArrayList<>();
    private Agenda agenda;
    
 

    public Medico(String nome, String email, Integer senha, Integer telefone, String dtaNascimento, Integer crm , Integer cnpj, String nomeEspc) {
        super(nome, email, senha, telefone, dtaNascimento);
        
        this.cnpj = cnpj;
        this.crm = crm;
        Especialidade E1 = new Especialidade(nomeEspc); 
        especialidade.add(E1);
        
        
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
    
    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    
    
    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Consultorio> getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(List<Consultorio> consultorio) {
        this.consultorio = consultorio;
    }

    public List<Especialidade> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(List<Especialidade> especialidade) {
        this.especialidade = especialidade;
    }
    
    public void  addEspecialidade(String nome ){
        Especialidade e1 = new Especialidade(nome);
        especialidade.add(e1);
    }
    
    
    
    public void addConsultorio(String nome , Integer telefone , String endereco){
        Consultorio c1 = new Consultorio (nome , telefone , endereco);
        consultorio.add(c1);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
