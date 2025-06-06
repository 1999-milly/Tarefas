package dominio;
import servicosTecnicos.AlunoDAO;
import java.util.List;
public class AlunoController{
    private AlunoDAO dao=new AlunoDAO();

    public void salvarAluno(String matricula,String nome,String curso,int idade){
        Aluno aluno=new Aluno(matricula,nome,curso,idade);
        dao.salvar(aluno);
    }
    public List<Aluno> listarAlunos(){
        return dao.listarTodos();
    }
    public void excluirAluno(String matricula) {
        dao.excluir(matricula);
    }
    public boolean atualizarAluno(String matricula,String nome,String curso,int idade){
        Aluno alunoExistente=dao.buscarPorMatricula(matricula);
        if(alunoExistente!=null){
            alunoExistente.setNome(nome);
            alunoExistente.setCurso(curso);
            alunoExistente.setIdade(idade);
            dao.atualizar(alunoExistente);
            return true;
        }
        return false;
    }
}