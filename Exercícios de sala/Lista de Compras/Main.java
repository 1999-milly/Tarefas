import ListaDeComprasPOO.InterfaceUsuario;
import ListaDeComprasPOO.ListaDeCompras;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ListaDeCompras l=new ListaDeCompras();
        InterfaceUsuario inter=new InterfaceUsuario(sc,l);

        inter.executar();

    }
}