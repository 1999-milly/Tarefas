package h;
import java.util.ArrayList;
import java.util.List;
public class Hospital{
    private String nome,telefone;
    private List<Unidade> unidades;

    public Hospital(String nome,String telefone){
        this.nome=nome;
        this.telefone=telefone;
        this.unidades=new ArrayList<>();
        System.out.println("Hospital: "+nome+" | Telefone: "+telefone);
    }
    public String getNome(){
        return this.nome;
    }
    public void addUnidade(String nome,String especialidadeU,String telefone){
        Unidade u=new Unidade(nome,especialidadeU,telefone);
        this.unidades.add(u);
    }
    public void listaUnidades(){
        for(Unidade unidade:this.unidades){
            System.out.println("Unidade "+unidade.getNome()+" componente do hospital "+getNome());
        }
    }
}
