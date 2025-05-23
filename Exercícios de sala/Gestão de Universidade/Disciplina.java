package gestao;
import java.util.ArrayList;
import java.util.List;
public class Disciplina{
    private String descricao;
    private List<Disciplina> disci;

    public Disciplina(String descricao){
        this.descricao=descricao;
        this.disci=new ArrayList<>();
    }
    public String getDescricao(){
        return descricao;
    }
    public List<Disciplina> getDisciplina(){
        return disci;
    }
    public void listarDisciplina(){
        System.out.println("Disciplina: "+descricao);
    }
}
