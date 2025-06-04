public class Main{
    public static void main(String[] args){
        Conta conta=new Conta(0,1000);
        conta.sacar(1000);
        try{
            conta.sacar(-1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}