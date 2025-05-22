public class Main{
    public static void main(String[] args){
        FuncionarioTi f=new FuncionarioTi("939393939","Gabriel");
        Dev d=new Dev("Gabriel","0202938",null,"Intermediário",false);
        AdmRedes a=new AdmRedes("Gabriel","0208384839","CCNA",null);

        d.devInfo();
        d.desenvolverProjeto();
        d.atualizarProjeto();
        d.exibirTecnologiasUsadas("Django");
        d.revisarCodigo();

        a.admInfo();
        a.monitorarRede("LAN");
        a.realizarBackup();
    }
}