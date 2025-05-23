public class Escola{
    public static void main(String[] args){
        Diretor d=new Diretor("Gabriel","Financeiro");
        Funcionario f=new Funcionario("Gabriel");
        Professor p=new Professor("Gabriel","Biologia");
        Secretaria s=new Secretaria("Laura","Noturno");
        Terceirizado t=new Terceirizado("Gabriel");

        d.registrarPresenca();
        d.exibirDados();
        f.exibirDados();
        p.registrarPresenca();
        p.exibirDados();
        t.registrarPresenca();
        t.exibirDados();
        s.registrarPresenca();
        s.exibirDados();
}}