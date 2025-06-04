package Q2;
import java.io.IOException;
import java.sql.SQLException;
public class Main{
    public static void main(String[] args){
        Serviço serviço=new Serviço();
        try{
            serviço.executar();
        }catch(SQLException e){
            System.out.println("Arquivo não encontrado: "+e.getMessage());
        }catch(IOException e){
            System.out.println("Erro de banco de dados: "+e.getMessage());
        }finally{
            System.out.println("Programa finalizado");
        }
    }
}
