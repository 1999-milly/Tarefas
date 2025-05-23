package c;
public class M{
    public static void main(String args[]){
        Computador c=new Computador("Lenovo","Desktop","i5","64 terabytes");
        PlacaMae p=new PlacaMae("Apple","8766","7 slots","32 terabytes");
        c.addPlaca(p);
        c.exibeInfo();
        c.atualizaPlaca("8");
    }
}
