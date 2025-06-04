package Q5;

public class Aluno{
    private String nome;
    private double nota;

    public Aluno(String nome){
        this.nome=nome;
    }
    public void setNota(double nota){
        if(nota>=0 && nota<=10){
            this.nota=nota;
        }else{
            throw new NotaInvalidaException("Nota inválida inserida.");
        }
    }
    public void exibir(){
        System.out.println("Aluno: "+this.nome+" \nNota do aluno: "+this.nota);
    }
}
