package palavras;

public class Tabuleiro{
    public int qtdColunas;
    public int qtdLinhas;
    public char[][] matriz;

    public Tabuleiro(char[][] matriz){
        this.matriz = matriz;
        this.qtdLinhas = matriz.length;
        this.qtdColunas = matriz[0].length;
    }

    public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz){
        this.qtdColunas = qtdColunas;
        this.qtdLinhas = qtdLinhas;
        this.matriz = new char[qtdLinhas][qtdColunas];
        int count = 0;
        for(int i = 0; i<qtdLinhas; i++){
            for(int j = 0; j<qtdColunas; j++){
                this.matriz[i][j] = dadosMatriz[count];
                count++;
            }
        }
    }

    public PalavraEncontrada buscar(String palavra){
        /*for(int i = 0; i<qtdLinhas; i++){
            for(int j = 0; j<qtdColunas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }*/
        int tamanho = palavra.length();
        int[] posicao = new int[2];
        int tipo;
        for(int i = 0; i<qtdLinhas; i++){
            for(int j = 0; j<qtdColunas; j++){
                //Linha-direita
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(k+j>=qtdColunas){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i][j+k]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 1;
                        return new PalavraEncontrada(palavra, posicao, tipo, 1);
                    }
                }

                //Linha-esquerda
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(j-k<0){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i][j-k]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 1;
                        return new PalavraEncontrada(palavra, posicao, tipo, 2);
                    }
                }

                //Coluna-baixo
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(i+k>=qtdLinhas){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i+k][j]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 2;
                        return new PalavraEncontrada(palavra, posicao, tipo, 1);
                    }
                }

                //Coluna-cima
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(i-k<0){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i-k][j]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 2;
                        return new PalavraEncontrada(palavra, posicao, tipo, 2);
                    }
                }

                //Diagonal-1
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(i-k<0 || j+k>=qtdColunas){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i-k][j+k]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 3;
                        return new PalavraEncontrada(palavra, posicao, tipo, 1);
                    }
                }

                //Diagonal-2
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(i+k>=qtdLinhas || j+k>=qtdColunas){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i+k][j+k]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 3;
                        return new PalavraEncontrada(palavra, posicao, tipo, 2);
                    }
                }

                //Diagonal-3
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(i+k>=qtdLinhas || j-k<0){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i+k][j-k]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 3;
                        return new PalavraEncontrada(palavra, posicao, tipo, 3);
                    }
                }

                //Diagonal-4
                if(matriz[i][j]==palavra.charAt(0)){
                    boolean result = true;
                    for(int k = 0; k<tamanho; k++){
                        if(i-k<0 || j-k<0){
                            result = false;
                            break;
                        }
                        if(palavra.charAt(k)!=matriz[i-k][j-k]){
                            result = false;
                            break;
                        }
                    }
                    if(result){
                        posicao[0] = i;
                        posicao[1] = j;
                        tipo = 3;
                        return new PalavraEncontrada(palavra, posicao, tipo, 4);
                    }
                }
            }
        }
        return null;
    }

    public PalavraEncontrada[] buscar(String[] palavras){
        int count = 0;
        for (String string : palavras) {
            PalavraEncontrada p = this.buscar(string);
            if(p!=null){
                count++;
            }
        }
        if(count == 0)
            return null;
        PalavraEncontrada[] result = new PalavraEncontrada[count];
        count = 0;
        for (String string : palavras) {
            PalavraEncontrada p = this.buscar(string);
            if(p!=null){
                result[count] = p;
                count++;
            }
        }
        return result;
    }
}