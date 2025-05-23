package h;
import java.util.ArrayList;
import java.util.List;
public class Unidade{
    private String nome,especialidadeU,telefone;
    private List<Medico> medicos;

    public Unidade(String nome,String especialidadeU,String telefone){
        this.nome=nome;
        this.medicos=new ArrayList<>();
        this.especialidadeU=especialidadeU;
        this.telefone=telefone;
        System.out.println("Unidade: "+nome+" | Especialidade da unidade: "+especialidadeU+" | Telefone: "+telefone);
    }
    public String getNome(){
        return nome;
    }
    public void addMedicos(Medico medico){
        this.medicos.add(medico);
        System.out.println("Medico(a) "+medico.getNome()+" adicionado(a) com sucesso a unidade "+getNome());
    }
    public void listarMedicos(){
        for(Medico medico:medicos){
            System.out.println("Medico(a) "+medico.getNome()+" integrante da unidade "+getNome());
        }
    }
}
