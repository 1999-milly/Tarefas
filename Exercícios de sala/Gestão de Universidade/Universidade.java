package gestao;
import java.util.ArrayList;
import java.util.List;
public class Universidade{
    private String descricao;
    private List<Departamento>departs;

    public Universidade(String descricao){
        this.descricao=descricao;
        this.departs=new ArrayList<>();
    }
    public String getDescricao(){
        return descricao;
    }
    public void addDepartamento(Departamento departamento){
        this.departs.add(departamento);
        System.out.println("Departamento "+departamento.getDescricao()+" adicionado com sucesso a faculdade "+getDescricao());
    } 
    public void removeDepartamento(String descricao){
        this.departs.remove(new Departamento(descricao));
    }
    public List<Departamento> getDepartamentos(){
        return this.departs;
    }
    public void listarDepartamentos(){
        for(Departamento departamento:this.departs){
            System.out.println(departamento.getDescricao());
        }
    }}

