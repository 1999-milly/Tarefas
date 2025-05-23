public class FuncionarioTi{
    protected String matricula;
    protected String nome;

    public FuncionarioTi(String matricula,String nome){
        this.matricula=matricula;
        this.nome=nome;
    }
    public void exibeInfo(){
        System.out.println("Matricula: "+matricula+" | Nome: "+nome);
    }
    public String getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    private void setMatricula(String matricula){
        this.matricula=matricula;
    }
    private void setNome(String nome){
        this.nome=nome;
    }
    public void atualizaCad(){
        this.setMatricula(this.getMatricula());
        this.setNome(this.getNome());
        System.out.println("Cadastro atualizado com sucesso! Novos nome e matricula: "+getNome()+getMatricula());
    }
}
