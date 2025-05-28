package ListaDeComprasPOO;
import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras{
    private List<String> itens;

    public ListaDeCompras(){
        itens=new ArrayList<>();
    }
    public void addItem(String item){
        if(!itens.contains(item)){
            itens.add(item);
            System.out.println("Item adicionado com sucesso");
            }else{
            System.out.println("Item já existe na lista");
            }
        }
    public void removeItem(String item){
        for(int i=0;i<itens.size();i++){
            if(itens.get(i).equals(item)){
                itens.remove(i);
                System.out.println("Item removido com sucesso");
                break;
            }
        }}
    public void exibirListaDeCompras(){
        if(!itens.isEmpty()){
            for(String item:itens){
                System.out.println("Item da lista: "+item);
            }
        }else{
            System.out.println("Lista vazia");
        }}
    public boolean contemItem(String item){
        if(itens.contains(item)){
            System.out.println("Item da lista: "+item);
            return true;
        }else{
            System.out.println("Item não presente na lista");
            return false;
        }
    }
    public void limpaLista(){
        itens.clear();
        System.out.println("Lista vazia, limpa com sucesso");
    }
}
