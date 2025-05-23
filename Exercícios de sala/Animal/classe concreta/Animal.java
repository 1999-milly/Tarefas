public class Animal{
    protected String nome;

    public Animal(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void emitirSom(){
        System.out.println(nome+" emitiu som");
        }
}
