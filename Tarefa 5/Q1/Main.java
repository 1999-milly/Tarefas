package Q1;
import java.io.IOException;
public class Main{
    public static void main(String[] args){
        LeitorArquivo leitorArquivo=new LeitorArquivo();
       try{
           leitorArquivo.lerArquivo();
       }catch(IOException e){
           System.out.println("Erro ao ler o arquivo: "+e.getMessage());
       }finally{
           System.out.println("Programa finalizado com sucesso.");
       }
}}
