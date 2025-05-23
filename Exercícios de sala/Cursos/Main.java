package c;
public class Main{
    public static void main(String[] args){
        Curso c=new Curso("Eng da Computacao","Superior","Curso de TI",6789);
        Instrutor i=new Instrutor("Gabriel","Engenheiro da Computacao","g@gmail.com",2);
        Instrutor a=new Instrutor("Ana","Engenheira da Computacao","a@gmail.com",2);
        c.addInstrutor(i);
        c.addInstrutor(a);
        c.listarInstrutores();
    }
}
