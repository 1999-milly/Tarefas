package h;
public class Paciente{
    private String nome,telefone,convenio;

    public Paciente(String nome,String telefone,String convenio){
        this.nome=nome;
        this.telefone=telefone;
        this.convenio=convenio;
        System.out.println("Nome do paciente: "+nome+" | Telefone: "+telefone+" | Convenio: "+convenio);
    }
    public String getNome(){
        return this.nome;
    }
}
