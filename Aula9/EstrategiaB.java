package jogo;

public class EstrategiaB implements EstrategiaJogo {
    public int[] proximaJogada(char[][] dadosTabuleiro, char jogador) {
        if (dadosTabuleiro[1][1] == '.') {
            int[] result = { 1, 1 };
        } else if (dadosTabuleiro[0][0] == '.') {
            int[] result = { 0, 0 };
        } else if (dadosTabuleiro[0][2] == '.') {
            int[] result = { 0, 2 };
        } else if (dadosTabuleiro[2][0] == '.') {
            int[] result = { 2, 0 };
        } else if (dadosTabuleiro[2][2] == '.') {
            int[] result = { 2, 2 };
        } else if (dadosTabuleiro[0][1] == '.') {
            int[] result = { 0, 1 };
        } else if (dadosTabuleiro[1][0] == '.') {
            int[] result = { 1, 0 };
        } else if (dadosTabuleiro[1][2] == '.') {
            int[] result = { 1, 2 };
        } else if (dadosTabuleiro[2][1] == '.') {
            int[] result = { 2, 1 };
        }
        return result;
    }
}
