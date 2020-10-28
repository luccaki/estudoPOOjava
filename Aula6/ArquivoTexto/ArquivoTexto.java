public class ArquivoTexto implements Cloneable{
    public String[] linhas;
    public int nLinhas = 0;
    public ArquivoTexto(int nLinhas){
        this.nLinhas = nLinhas;
        linhas = new String[nLinhas];
    }

    public ArquivoTexto clone() throws CloneNotSupportedException{
        return (ArquivoTexto) super.clone();
    }

    public ArquivoTexto criarAtalho() throws CloneNotSupportedException{
        return (ArquivoTexto) super.clone();
    }

    public ArquivoTexto criarBackup()throws CloneNotSupportedException{
        ArquivoTexto out = (ArquivoTexto) super.clone();
        out.linhas = this.linhas.clone();
        return out;
    }

    public String ler(){
        StringBuilder out = new StringBuilder();
        for(int i = 0; i<nLinhas-1; i++){
            out.append(this.linhas[i] + "\n");
        }
        out.append(this.linhas[this.nLinhas-1]);
        return out.toString();
    }

    public void modificarLinha(int indice, String texto){
        linhas[indice] = texto;
    }
}