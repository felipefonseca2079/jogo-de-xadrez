public class JogadorHumano extends Jogador {

    public JogadorHumano(String nome, char cor) {
        super(nome, cor); 
    }

    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {
        System.out.println("Jogador Humano fez sua jogada.");
        return true;
    }
}
