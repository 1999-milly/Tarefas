public class Secretaria extends Funcionario implements PresencaRegistravel{
    private String turno;

    public Secretaria(String nome,String turno){
        super(nome);
        this.turno=turno;
        System.out.println("Nome da secretaria: "+nome+" | Turno em que atua: "+turno);
    }
    public void organizaDocs(String doc){
        System.out.println(doc+" organizado pela secretaria "+this.nome);
    }
    @Override
    public void registrarPresenca(){
        System.out.println("Presença da secretaria registrada com sucesso");
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
