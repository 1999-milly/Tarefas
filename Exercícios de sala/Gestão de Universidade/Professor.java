package gestao;
import java.util.ArrayList;
import java.util.List;
public class Professor{
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(String nome){
        this.nome=nome;
        this.disciplinas=new ArrayList<>();
    }
    public String getNome(){
        return this.nome;
    }
    public void ministraDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
        System.out.println(nome+" esta ministrando a disciplina "+disciplina.getDescricao());
    }
    public void listaDisciplinas(Professor professor){
        for(Disciplina disciplina:this.disciplinas){
            System.out.println("Disciplina(s) "+disciplina.getDescricao()+" ministrada(s) pelo/a professor(a) "+professor.getNome());
        }
    }
}
