public class MatBibli{
    protected String codigo;
    protected String titulo;

    public MatBibli(String codigo,String titulo){
        this.codigo=codigo;
        this.titulo=titulo;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void emprestar(){
        System.out.println("Emprestando o/a: "+getTitulo());
    }
}
