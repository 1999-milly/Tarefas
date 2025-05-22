public class Dev extends FuncionarioTi{
    private String linguagemPrincipal;
    private String nivel;
    private boolean projeto;

    public Dev(String nome,String matricula,String linguagemPrincipal,String nivel,boolean projeto){
        super(nome,matricula);
        this.linguagemPrincipal=linguagemPrincipal;
        this.nivel=nivel;
        this.projeto=projeto;
    }
    public boolean desenvolverProjeto(){
        if(projeto){
            System.out.println("Projeto sendo desenvolvido");
            return true;
        }else{
            return false;
        }
    }
    public void atualizarProjeto(){
        if(desenvolverProjeto()){
            System.out.println("Projeto já em andamento");
        }else{
            System.out.println("Projeto atualizado com sucesso!");
        }
    }
    public void exibirTecnologiasUsadas(String framework){
        System.out.println("Linguagem utilizada: "+linguagemPrincipal+" | Framework: "+framework);
    }
    public void revisarCodigo(){
        if(linguagemPrincipal!=null){
            System.out.println("Linguagem utilizada: "+linguagemPrincipal+", codigo não necessita revisão");
        }else{
            System.out.println("Código em estágio de revisão");
        }
    }
    public void devInfo(){
        super.exibeInfo();
        System.out.println("Linguagem utilizada: "+linguagemPrincipal+" | Nível: "+nivel);
    }
    public void atualizaDev(){
        super.atualizaCad();
    }
}
