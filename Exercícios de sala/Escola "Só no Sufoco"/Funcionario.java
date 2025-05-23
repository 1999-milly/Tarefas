public class Funcionario{
    protected String nome;

    public Funcionario(String nome){
        this.nome=nome;
    }
    public void exibirDados(){
        System.out.println("Nome do funcionario: "+nome);
    }
}
