public class Gato extends Animal{
    private String corDaPelagem;

    public Gato(String nome,String corDaPelagem){
        super(nome);
        this.corDaPelagem=corDaPelagem;
        System.out.println("Nome do gato: "+nome+" | Cor da pelagem: "+corDaPelagem);
    }
    @Override
    public void emitirSom(){
        System.out.println(this.getNome()+" emitiu som");
    }
    public void mover(){
        System.out.println(this.getNome()+" moveu-se");
    }}

