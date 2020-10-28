package texto;

public class ImpressaoLimiteLargura implements PluginImpressao{
    public int limite;
    public ImpressaoLimiteLargura(int num){
        this.limite = num;
    }

    public void imprimir(String texto){
        String out = "";
        int count = 0;
        for(int i=0; i<texto.length(); i++){
            if(count == 0 && (texto.charAt(i)==' ' || texto.charAt(i)==',' || texto.charAt(i)=='.')){
                continue;
            }else{
                if()
            }
        }
    }
}
