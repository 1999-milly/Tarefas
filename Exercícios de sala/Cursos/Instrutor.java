package c;
public class Instrutor{
    private String nome,formacao,email;
    private int anosExp;

    public Instrutor(String nome,String formacao,String email,int anosExp){
        this.nome=nome;
        this.formacao=formacao;
        this.email=email;
        this.anosExp=anosExp;
        System.out.println("Nome do/a instrutor(a): "+nome+" | Formacao: "+formacao+" | E-mail: "+email+" | Anos de experiencia: "+anosExp+" ano(s)");
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

}
