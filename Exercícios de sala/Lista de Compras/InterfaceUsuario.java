package ListaDeComprasPOO;
import java.util.Scanner;
public class InterfaceUsuario{
    private Scanner sc;
    private ListaDeCompras listaDeCompras;

    public InterfaceUsuario(Scanner sc,ListaDeCompras listaDeCompras){
        this.sc=new Scanner(System.in);
        this.listaDeCompras=listaDeCompras;
    }
    public void exibirMenu(){
        System.out.println("Menu de interação");
        System.out.println("1. Adicionar itens de compra");
        System.out.println("2. Remover itens de compra");
        System.out.println("3. Exibir itens de compra");
        System.out.println("4. Verificar itens de compra");
        System.out.println("5. Limpar a lista de compras");
        System.out.println("0. Sair");
    }
    public void executar(){
        int opcao;
        do{
            exibirMenu();
            opcao=lerInteiro("Escolha uma opção: ");
            sc.nextLine();

            switch(opcao){
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    listaDeCompras.exibirListaDeCompras();
                    break;
                case 4:
                    verificaItem();
                    break;
                case 5:
                    listaDeCompras.limpaLista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }}while(opcao!=0);
        sc.close();
    }
    public int lerInteiro(String mensagem){
        System.out.println(mensagem);
        while(!sc.hasNextInt()){
            System.out.println("Entrada inválida. Tente novamente.");
            sc.next();
            System.out.print(mensagem);
        }
        return sc.nextInt();
    }
    public void adicionarItem(){
        System.out.println("Digite um item para ser adicionado à lista: ");
        listaDeCompras.addItem(sc.nextLine());
    }
    public void removeItem(){
        System.out.println("Digite um item para ser removido da lista: ");
        listaDeCompras.removeItem(sc.nextLine());
    }
    public void verificaItem(){
        System.out.println("Digite um item para ser identificado na lista: ");
        String item=sc.nextLine();
        if(listaDeCompras.contemItem(item)){
            System.out.println(item+" verificado com sucesso!");
        }else{
        System.out.println(item+" não pertence à lista");
    }}}
