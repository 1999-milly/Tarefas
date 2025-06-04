package Q5;
public class Main{
    public static void main(String[] args){
        Aluno aluno=new Aluno("Gabriel");
        try{
            aluno.setNota(20);
        }catch(NotaInvalidaException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Programa finalizado.");
        }
        aluno.exibir();
    }
}
