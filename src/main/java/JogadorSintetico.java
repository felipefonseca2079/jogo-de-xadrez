public class JogadorSintetico extends Jogador {
    public JogadorSintetico(String nome, char cor) {
        super(nome, cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDaCasa) {
        System.out.println(getNome() + " (Sintético) fez sua jogada com " + NomeDaPeca);
        return true;
    }
}
