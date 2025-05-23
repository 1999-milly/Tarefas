public abstract class Animal{
    protected String nome;

    public Animal(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void emitirSom(){
        System.out.println(this.getNome()+" emitiu um som");
    }
    public abstract void mover();
}
