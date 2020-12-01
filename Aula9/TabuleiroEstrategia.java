package jogo;

public class TabuleiroEstrategia extends Tabuleiro {
    public EstrategiaJogo jogador1;
    public EstrategiaJogo jogador2;
    public int jogada;

    public TabuleiroEstrategia() {
        this.jogada = 0;
    }

    public void setStrategyJogador1(EstrategiaJogo jogador1) {
        this.jogador1 = jogador1;
    }

    public void setStrategyJogador2(EstrategiaJogo jogador2) {
        this.jogador2 = jogador2;
    }

    public void jogarPartida() {
        if (super.jogadorVencedor() == '.') {
            if (jogada % 2 == 0) {
                int pos[] = jogador1.proximaJogada(super.getTabuleiro(), 'X');
                super.jogar('X', pos[0], pos[1]);
            } else {
                int pos[] = jogador2.proximaJogada(super.getTabuleiro(), 'O');
                super.jogar('O', pos[0], pos[1]);
            }
            jogada++;
            this.jogarPartida();
        }
    }
}