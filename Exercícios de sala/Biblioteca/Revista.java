public class Revista extends MatBibli{
    private int mesAno;

    public Revista(String codigo,String titulo,int mesAno){
        super(codigo,titulo);
        this.mesAno=mesAno;
    }
    public void verificaAno(){
        if(this.mesAno==2025){
            super.emprestar();
        }else{
            System.out.println("Revista nao atual, portanto nao sera emprestada");
        }
    }
}
