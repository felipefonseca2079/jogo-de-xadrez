public abstract class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    public abstract void jogar();
}
public class JogadorHumano extends Jogador {
    public JogadorHumano(String nome) {
        super(nome);
    }

    @Override
    public void jogar() {
        System.out.println("Jogador Humano (" + getNome() + ") fez sua jogada no tabuleiro.");
    }
}
public class JogadorHumano extends Jogador {
    public JogadorHumano(String nome, char cor) {
        super(nome, cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDaCasa) {
        return true;
    }
}
