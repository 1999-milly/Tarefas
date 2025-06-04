package Q1;
import java.io.FileReader;
import java.io.IOException;
public class LeitorArquivo{
    public void lerArquivo() throws IOException{
        FileReader fr=new FileReader("exemplo.txt");
        System.out.println("Arquivo lido com sucesso");
        }
}
