public class Diretor extends Funcionario implements PresencaRegistravel{
    private String setor;

    public Diretor(String nome,String setor){
        super(nome);
        this.setor=setor;
        System.out.println("Nome do diretor: "+nome+" | Setor: "+setor);
    }
    public void tomarDecisoes(String decisao){
        System.out.println(nome+" tomou a seguinte decisão: "+decisao);
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
    }
    @Override
    public void registrarPresenca(){
        System.out.println("Presença do diretor registrada com sucesso");
    }
}
