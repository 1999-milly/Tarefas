public class Main{
    public static void main(String[] args){
        Animal a=new Animal("Lulu");
        Papagaio p=new Papagaio("Gabriel","Amarela");
        Vaca v=new Vaca("Lola",989);
        p.emitirSom("odeio existir");
        p.emitirSom();
        v.emitirSom();
        }
    }
