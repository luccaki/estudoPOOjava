package texto;

public class ImpressaoSimples implements PluginImpressao{
    public void imprimir(String texto){
        Impressao.imprimirLinha(texto);
    }
}
