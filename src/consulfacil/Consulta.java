/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package consulfacil;

import java.io.IOException;

/**
 *
 * @author Kerley Pablo
 */
public class Consulta {
    
    private Agenda agenda;
    private Paciente paciente ;
    private Medico medico ;
    private Consultorio consultorio ;
    private Double valor;
    private String tipo;
    private Convenio convenio;
    

    public Consulta(Agenda agenda, Paciente paciente, Medico medico, Consultorio consultorio, Double valor, String tipo) throws Exception {
        this.agenda = agenda;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.valor = valor;
        this.tipo = tipo;
        ValidarConsulta();
    }

    public Consulta(Agenda agenda, Paciente paciente, Medico medico, Consultorio consultorio, String tipo, Convenio convenio) throws Exception {
        this.agenda = agenda;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;      
        this.tipo = tipo;
        this.convenio = convenio;
        ValidarConsulta();
    }
    
    private void ValidarConsulta() throws Exception{
        if (this.agenda == null || this.paciente == null || this.medico == null || this.consultorio == null || this.tipo == null ){
            throw new Exception();
        } 
    }
    
    

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
    
    
    
    
    
    
}
