package Q3;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
public class Serviço{
    public void executar(){
        try{
            lerArquivo();
            verificaBanco();
        }catch(IOException e){
            System.out.println("Erro ao ler arquivo. Arquivo não encontrado: "+e.getMessage());
        }catch(SQLException e){
            System.out.println("Erro de banco de dados."+e.getMessage());
        }finally{
            System.out.println("Fim do programa.");
        }
    }
    public void lerArquivo() throws IOException{
        FileReader fileReader=new FileReader("Arquivo.txt");
    }
    public void verificaBanco() throws SQLException{
        throw new SQLException("Banco de dados inexistente ou incomunicável.");
    }
}
