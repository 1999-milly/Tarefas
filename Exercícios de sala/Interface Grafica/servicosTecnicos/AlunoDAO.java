package servicosTecnicos;
import dominio.Aluno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class AlunoDAO{
    public void salvar(Aluno aluno){
        String sql="INSERT INTO alunos(matricula,nome,curso,idade) VALUES (?,?,?,?)";
        try(
                Connection conn=Conexao.getConnection();
                PreparedStatement stmt=conn.prepareStatement(sql)
        ){
            stmt.setString(1,aluno.getMatricula());
            stmt.setString(2,aluno.getNome());
            stmt.setString(3,aluno.getCurso());
            stmt.setInt(4,aluno.getIdade());
            stmt.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public List<Aluno> listarTodos(){
        List<Aluno> lista=new ArrayList<>();
        String sql="SELECT * FROM alunos";
        try(
                Connection conn=Conexao.getConnection();
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(sql)
        ){
            while(rs.next()){
                Aluno aluno=new Aluno(
                        rs.getString("matricula"),
                        rs.getString("nome"),
                        rs.getString("curso"),
                        rs.getInt("idade")
                );
                lista.add(aluno);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    public void atualizar(Aluno aluno){
        String sql="UPDATE alunos SET nome=?,curso=?,idade=? WHERE matricula=?";
        try(Connection conn=Conexao.getConnection();
            PreparedStatement stmt=conn.prepareStatement(sql)){
            stmt.setString(1,aluno.getNome());
            stmt.setString(2,aluno.getCurso());
            stmt.setInt(3,aluno.getIdade());
            stmt.setString(4,aluno.getMatricula());
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void excluir(String matricula){
        String sql="DELETE FROM alunos WHERE matricula=?";
        try(Connection conn=Conexao.getConnection();
            PreparedStatement stmt=conn.prepareStatement(sql)){
            stmt.setString(1, matricula);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Aluno buscarPorMatricula(String matricula){
        String sql="SELECT * FROM alunos WHERE matricula=?";
        try(Connection conn=Conexao.getConnection();
             PreparedStatement stmt=conn.prepareStatement(sql)){

            stmt.setString(1,matricula);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                return new Aluno(
                        rs.getString("matricula"),
                        rs.getString("nome"),
                        rs.getString("curso"),
                        rs.getInt("idade")
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

