package palavras;

public class PalavraEncontrada{
    public String palavra;
    public int[] posicao;
    public int tipo;
    public int direcao;

    public PalavraEncontrada(String palavra, int[]posicao, int tipo, int direcao){
        this.palavra = palavra;
        this.posicao = posicao;
        this.tipo = tipo;
        this.direcao = direcao;
    }


    public String getPalavra(){
        return palavra;
    }

    public int[] getPosicao(){
        return posicao;
    }

    public int getTipo(){
        return tipo;
    }

    public int getDirecao(){
        return direcao;
    }
}
