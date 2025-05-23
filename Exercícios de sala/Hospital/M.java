package h;
public class M{
    public static void main(String[] args){
        Hospital h=new Hospital("C","0939399393");
        Unidade u=new Unidade("M","Obstetricia","9393939");
        Paciente p=new Paciente("Gabriel","938383883","UNIMED");
        Consulta c=new Consulta("1-06-2025");
        Medico m=new Medico("Gabriel","89292-PA","obstetra");
        c.cadastraConsul(m,p);
        c.listaConsul(m);
        u.addMedicos(m);
        u.listarMedicos();
        h.addUnidade("M","Obstetricia","9393939");
        h.listaUnidades();
    }
}
