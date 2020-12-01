// Escreva aqui as classes EstrategiaA e EstrategiaBpackage jogo;
package jogo;

class EstrategiaA implements EstrategiaJogo {
    public int[] proximaJogada(char[][] dadosTabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (dadosTabuleiro[i][j] == '.') {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}

class EstrategiaB implements EstrategiaJogo {
    public int[] proximaJogada(char[][] dadosTabuleiro, char jogador) {
        int[] result = new int[2];
        if (dadosTabuleiro[1][1] == '.') {
            result = new int[] { 1, 1 };
        } else if (dadosTabuleiro[0][0] == '.') {
            result = new int[] { 0, 0 };
        } else if (dadosTabuleiro[0][2] == '.') {
            result = new int[] { 0, 2 };
        } else if (dadosTabuleiro[2][0] == '.') {
            result = new int[] { 2, 0 };
        } else if (dadosTabuleiro[2][2] == '.') {
            result = new int[] { 2, 2 };
        } else if (dadosTabuleiro[0][1] == '.') {
            result = new int[] { 0, 1 };
        } else if (dadosTabuleiro[1][0] == '.') {
            result = new int[] { 1, 0 };
        } else if (dadosTabuleiro[1][2] == '.') {
            result = new int[] { 1, 2 };
        } else if (dadosTabuleiro[2][1] == '.') {
            result = new int[] { 2, 1 };
        }
        return result;
    }
}