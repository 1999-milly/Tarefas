public class Professor extends Funcionario implements PresencaRegistravel{
    private String disciplina;

    public Professor(String nome,String disciplina){
        super(nome);
        this.disciplina=disciplina;
        System.out.println("Nome do professor: "+nome+" | Disciplina ministrada: "+disciplina);
    }
    public void ministraDisci(String disciplina){
        System.out.println("Disciplina ministrada "+disciplina+" pelo professor "+this.nome);
    }
    @Override
    public void registrarPresenca(){
        System.out.println("Presença do professor registrada com sucesso");
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
    }
}
