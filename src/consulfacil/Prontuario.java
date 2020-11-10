package consulfacil;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Kerley Pablo
 */
public class Prontuario {
    
    private String tipoSanguineo ;
    private List<Alergia> alergias = new ArrayList<>() ;
    private List<Medicamento> medicamentos = new  ArrayList<>();
    private Usuario usuario;

    public Prontuario() {
    }


    public Prontuario(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
        
    }
    
    public void addMedicamento(String nome){
        Medicamento m1 = new Medicamento(nome);
        medicamentos.add(m1);
    }
    
    public void addAlergia(String nome){
        Alergia a1 = new Alergia(nome);
        alergias.add(a1);
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    
    
    
        public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    
   
    
    
    
    
    
    
}
