class JogoDeXadrez implements Jogo{
    public static void main(String[] args) {
        System.out.println("Felipe Fonseca Sanches");
    }
}
    public void iniciar() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new JogadorHumano("Humano");
        Jogador jogador2 = new JogadorSintetico("Sintetico");

        while (!tabuleiro.acabouOJogo()) {
            jogador1.jogar();
            if (tabuleiro.acabouOJogo()) {
                break;
            }
            jogador2.jogar();
        }
    }
