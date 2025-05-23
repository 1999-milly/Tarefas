public class Papagaio extends Animal{
    private String corDaPelagem;

    public Papagaio(String nome,String corDaPelagem){
        super(nome);
        this.corDaPelagem=corDaPelagem;
        System.out.println("Nome do papagaio: "+nome+" | Cor da pelagem: "+corDaPelagem);
    }
    @Override
    public void emitirSom(){
        System.out.println(this.getNome()+" emitiu som");
        }
    public void emitirSom(String frase){
            System.out.println(this.getNome()+" emitiu a frase: "+frase);
    }
    public void mover(){
        System.out.println(this.getNome()+" moveu-se");
}}
