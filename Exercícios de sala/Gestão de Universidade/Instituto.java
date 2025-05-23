package gestao;
import java.util.ArrayList;
import java.util.List;
public class Instituto{
    private String descricao;
    private List<Departamento> departamento;

    public Instituto(String descricao){
        this.descricao=descricao;
        this.departamento=new ArrayList<Departamento>();
    }
    public String getDescricao(){
        return descricao;
    }
    public void addDepartamento(Departamento departamento){
        this.departamento.add(new Departamento(getDescricao()));
    }
    public void listaDepartamentos(){
        for(Departamento departamento:this.departamento){
            System.out.println("Departamento "+departamento.getDescricao());
        }
    }
}
