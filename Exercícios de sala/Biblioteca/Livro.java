import java.util.ArrayList;
import java.util.List;
public class Livro extends MatBibli{
    private String isbn;
    private String autor;
    private List<Livro> livro;

    public Livro(String codigo,String titulo,String isbn,String autor){
        super(codigo,titulo);
        this.isbn=isbn;
        this.autor=autor;
        this.livro=new ArrayList<>();
        System.out.println("Autor: "+autor+" | ISBN: "+isbn+" | Titulo: "+titulo+" | Codigo: "+codigo);
    }
    public List<Livro> getLivro(){
        return this.livro;
    }
    public void addLivro(Livro livro){
        this.livro.add(livro);
    }
    public void limitaEmprest(){
        if(livro.size()<=3){
            super.emprestar();
        }else{
            System.out.println("Quantidade nao aceitavel de emprestimo");;
    }
}}

