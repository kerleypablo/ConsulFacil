/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consulfacil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kerley Pablo
 */
public class Arquivo {
    
    private List<File> receita = new ArrayList<>();
    private List<File> pedidoExame = new ArrayList<>();
    private List<String> notas = new ArrayList<>();

    
    public List<File> getReceita() {
        return receita;
    }

    public void setReceita(List<File> receita) {
        this.receita = receita;
    }

    public List<File> getPedidoExame() {
        return pedidoExame;
    }

    public void setPedidoExame(List<File> pedidoExame) {
        this.pedidoExame = pedidoExame;
    }

    public List<String> getNota() {
        return notas;
    }

    public void setNota(List<String> nota) {
        this.notas = nota;
    }
    
    
    
    public void addReceita(File arquivo){
        receita.add(arquivo);
    } 
    
    public void addPedidoExame(File arquivo){
        pedidoExame.add(arquivo);
    }
    
    public void addNota(String nota){
        notas.add(nota);
        
    }
   
}
