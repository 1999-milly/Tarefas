package servicosTecnicos;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao{
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/unifesspa";
    private static final String USER="root";
    private static final String PASS="99615gbr";

    public static Connection getConnection() throws SQLException{
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(JDBC_URL,USER,PASS);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Driver MySQL JDBC Driver não encontrado!");
            e.printStackTrace();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Não foi possível conectar ao banco!");
        }
        return connection;
    }
}