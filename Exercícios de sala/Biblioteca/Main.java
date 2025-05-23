public class Main{
    public static void main(String[] args){
    MatBibli m=new MatBibli("M2","M2");
    Livro l=new Livro("948484884","Livro Metamorfose","93838393","Kafka");
    Revista r=new Revista("93939","Revista Vogue",2024);
    r.verificaAno();
    l.limitaEmprest();
    MaterialDigi mg=new MaterialDigi("needy_Ariana","939393",".mp3",567);
    mg.downEmprest();
    }
}