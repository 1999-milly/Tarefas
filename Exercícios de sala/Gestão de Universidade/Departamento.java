package gestao;
import java.util.ArrayList;
import java.util.List;
public class Departamento{
    private String descricao;
    private List<Professor>profs;
    private List<Disciplina>disciplinas;

    public Departamento(String descricao){
        this.descricao=descricao;
        this.profs=new ArrayList<Professor>();
        this.disciplinas=new ArrayList<>();
    }
    public String getDescricao(){
        return this.descricao;
    }
    public List<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }
    public void adicionarProfessor(Professor professor){
        this.profs.add(professor);
        System.out.println("Professor "+profs.get(0).getNome()+" adicionado ao departamento "+getDescricao());
    }
}
