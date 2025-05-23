public class MaterialDigi extends MatBibli{
    private String formato;
    private double tamanho;
    private int totalDown=0;

    public MaterialDigi(String codigo,String titulo,String formato,double tamanho){
        super(codigo,titulo);
        this.formato=formato;
        this.tamanho=tamanho;
    }
    public void downEmprest(){
        super.emprestar();
            totalDown++;
            System.out.println("Emprestando o "+getTitulo()+", e o numero total de downloads e igual a: "+totalDown);
        }
    }

