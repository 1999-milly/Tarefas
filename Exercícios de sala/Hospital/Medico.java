package h;
public class Medico{
    private String nome,crm,especialidade;

    public Medico(String nome,String crm,String especialidade){
        this.nome=nome;
        this.crm=crm;
        this.especialidade=especialidade;
        System.out.println("Medico(a): "+nome+" | CRM: "+crm+" | Especialidade: "+especialidade);
    }
    public String getNome(){
        return nome;
    }
}

