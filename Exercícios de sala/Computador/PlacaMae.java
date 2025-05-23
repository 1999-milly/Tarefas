package c;
public class PlacaMae{
    private String fabricante,chipset,numSlots,memSuportada;

    public PlacaMae(String fabricante,String chipset,String numSlots,String memSuportada){
        this.fabricante=fabricante;
        this.chipset=chipset;
        this.numSlots=numSlots;
        this.memSuportada=memSuportada;
        System.out.println("Fabricante da placa-mae: "+fabricante+" | Chipset: "+chipset+" | Numero de slots: "+numSlots+" | Capacidade da memoria: "+memSuportada);
    }
    public String getChipset(){
        return chipset;
    }
    public void setChipset(String chipset){
        this.chipset=chipset;
    }
}
