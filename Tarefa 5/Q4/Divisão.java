package Q4;
public class Divisão{
    public static void main(String[] args){
        int w=10;
        int g=0;

        try{
            int div=w/g;
            System.out.println("Resultado da divisão é igual a: "+div);
        }catch(ArithmeticException e){
            System.out.println("Divisão por zero não pode ser feita."+e.getMessage());
        }
    }
}
