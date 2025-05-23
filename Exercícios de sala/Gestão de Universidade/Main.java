package gestao;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Professor prof=new Professor("Gabriel");
        Disciplina d=new Disciplina("Fisica");
        prof.ministraDisciplina(d);
        d.getDisciplina();
        d.listarDisciplina();

        Departamento dd=new Departamento("FEC");
        dd.adicionarProfessor(prof);

        Universidade u=new Universidade("CUNIFESSPA");
        u.addDepartamento(dd);
        u.getDepartamentos();
        u.listarDepartamentos();

        Departamento d2=new  Departamento("FACSI");
        Professor p2=new Professor("Hugo");
        Disciplina d3=new Disciplina("Banco de Dados I");
        Disciplina d4=new Disciplina("Prog I");
        u.addDepartamento(d2);
        p2.ministraDisciplina(d3);
        p2.ministraDisciplina(d4);
        u.listarDepartamentos();
        p2.listaDisciplinas(p2);
        Instituto i=new Instituto("IGE");
        i.addDepartamento(dd);
    }
}
