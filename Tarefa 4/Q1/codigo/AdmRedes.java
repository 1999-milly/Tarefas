public class AdmRedes extends FuncionarioTi{
     private String certificacao;
     private String sistemaOperacionalResponsavel;

     public AdmRedes(String nome,String matricula,String certificacao,String sistemaOperacionalResponsavel){
         super(nome,matricula);
         this.certificacao=certificacao;
         this.sistemaOperacionalResponsavel=sistemaOperacionalResponsavel;
     }
     public int monitorarRede(String rede){
         if(rede!=null){
             System.out.println("Rede "+rede+" monitorada com sucesso!");
             return 1;
         }else{
             System.out.println("Rede passível de monitoramento não encontrada");
             return 0;
         }
     }
     public boolean realizarBackup(){
         if(this.sistemaOperacionalResponsavel!=null){
             System.out.println("Backup realizado com sucesso");
             return true;
         }else{
             return false;
         }
     }
    public void admInfo(){
        super.exibeInfo();
        System.out.println("Certificacao: "+certificacao+" | Sistema operacional responsável: "+sistemaOperacionalResponsavel);
    }
    public void atualizaAdm(){
        super.atualizaCad();
    }
}
