public class JogadorHumano extends Jogador {

    // Ajustado para receber nome e cor
    public JogadorHumano(String nome, char cor) {
        super(nome, cor); 
    }

    // Assinatura exata exigida pela JogadorInterface / Jogador
    @Override
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {
        System.out.println("Jogador Humano fez sua jogada.");
        return true;
    }
}
