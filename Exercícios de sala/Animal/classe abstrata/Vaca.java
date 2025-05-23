public class Vaca extends Animal{
    private double peso;

    public Vaca(String nome,double peso){
        super(nome);
        this.peso=peso;
        System.out.println("Nome da vaca: "+nome+" | Peso: "+peso);
    }
    @Override
    public void emitirSom(){
            System.out.println(this.getNome()+" emitiu som");
    }
    public void mover(){
        System.out.println(this.getNome()+" moveu-se");
    }
}
