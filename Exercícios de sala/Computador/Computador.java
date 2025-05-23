package c;
public class Computador{
    private String marca,modelo,processador,memoriaRam;
    private PlacaMae p;

    public Computador(String marca,String modelo,String processador,String memoriaRam,String fabricante,String chipset,String numSlots,String memSuportada){
        this.marca=marca;
        this.modelo=modelo;
        this.processador=processador;
        this.memoriaRam=memoriaRam;
        this.p=new PlacaMae(fabricante,chipset,numSlots,memSuportada);
        System.out.println("Marca do computador: "+marca+" | Modelo: "+modelo+" | Processador: "+processador+" | Capacidade da memoria ram: "+memoriaRam);
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public void addPlaca(PlacaMae placa){
        this.p=placa;
        System.out.println("Placa-mae "+placa.getChipset()+" adicionada com sucesso");
    }
    public void atualizaPlaca(String novoChipset){
        this.p.setChipset(novoChipset);
        System.out.println("Novo chipset da placa igual a: "+novoChipset);
    }
    public void exibeInfo(){
            System.out.println("Computador "+modelo+" e sua placa-mae com numero de chipset igual a "+p.getChipset()+" cadastrados");
        }
    }

