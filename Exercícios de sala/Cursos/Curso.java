package c;
import java.util.ArrayList;
import java.util.List;
public class Curso{
    private String nome,nivel,descricao;
    private int carga;
    private List<Instrutor> i;

    public Curso(String nome,String nivel,String descricao,int carga){
        this.nome=nome;
        this.nivel=nivel;
        this.descricao=descricao;
        this.carga=carga;
        this.i=new ArrayList<Instrutor>();
        System.out.println("Nome do curso: "+nome+" | Nivel: "+nivel+" | Descricao: "+descricao+" | Carga: "+carga+" hora(s)");
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void addInstrutor(Instrutor instrutor){
        this.i.add(instrutor);
        System.out.println("Instrutor(a) "+instrutor.getNome()+" cadastrado(a)");
    }
    public List<Instrutor>instrutores() {
        return this.i;
    }
    public void listarInstrutores(){
        for(Instrutor instrutor:i){
            System.out.println("Instrutor(a) "+instrutor.getNome()+"cadastrado(a)");
        }
    }
}
