// Jogador controlado pela máquina (IA / Sintético)
public class JogadorSintetico extends Jogador {
    public JogadorSintetico(String nome) {
        super(nome);
    }

    @Override
    public void jogar() {
        System.out.println("Jogador Sintético (" + getNome() + ") calculou e fez uma jogada.");
    }
}
