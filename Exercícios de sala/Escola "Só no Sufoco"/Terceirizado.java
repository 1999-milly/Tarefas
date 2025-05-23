public class Terceirizado implements PresencaRegistravel{
    private String nome;

    public Terceirizado(String nome){
        this.nome=nome;
        System.out.println("Nome do terceirizado: "+nome);
    }
    public void trabalha(String servico){
        System.out.println(nome+" trabalha realizando "+servico);
    }
    @Override
    public void registrarPresenca(){
        System.out.println("Presença do terceirizado registrada com sucesso");
    }
    public void exibirDados(){
        System.out.println("Dados do terceirizado: "+nome);
    }
}
