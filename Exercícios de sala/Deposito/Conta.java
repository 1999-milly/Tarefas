public class Conta{
    private double saldo;
    private double limite;

    public Conta(double saldo,double limite){
        this.saldo=saldo;
        this.limite=limite;
    }
    public void sacar(double valor){
        if(valor<=0){
            throw new IllegalArgumentException("Valor de depósito inválido: "+valor+". O valor deve ser positivo.");
        }else if(this.saldo<valor){
            System.out.println("Saldo insuficiente p/ realização de saque.");
        }else{
        this.saldo-=valor;
    }}
    public void depositar(double valor){
        if(valor<=0){
            throw new IllegalArgumentException("Valor de depósito inválido: "+valor+". O valor deve ser positivo.");
        }else{
            this.saldo+=valor;
        }}
    public double getSaldo(){
        return this.saldo;
    }
    public double getLimite(){
        return this.limite;
    }
}
