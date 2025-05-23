public class Main{
    public static void main(String[] args){
        Animal a;
        Papagaio p=new Papagaio("Gabriel","Amarela");
        Vaca v=new Vaca("Lola",989);
        Gato g=new Gato("Gabriel","Preta");
        p.emitirSom("odeio existir");
        p.emitirSom();
        v.emitirSom();
        g.emitirSom();
        }
    }
