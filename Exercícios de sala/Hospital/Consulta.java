package h;
import java.util.ArrayList;
import java.util.List;
public class Consulta{
    private String data;
    private List<Consulta> consultas;

    public Consulta(String data){
        this.data=data;
        this.consultas=new ArrayList<Consulta>();
    }
    public void cadastraConsul(Medico medico,Paciente paciente){
        Consulta novaConsulta=new Consulta(data);
        consultas.add(novaConsulta);
        System.out.println("Consulta feita na data "+novaConsulta.data+" com o/a medico(a) "+medico.getNome()+" e o/a paciente "+paciente.getNome());
    }
    public void listaConsul(Medico medico){
        for(Consulta consulta:consultas){
        System.out.println("Consulta: "+consulta.data+", e medico: "+medico.getNome());
        }
    }
}
