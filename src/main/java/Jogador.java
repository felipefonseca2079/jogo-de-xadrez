
public abstract class Jogador implements JogadorInterface {
    private String nome;
    private char cor;

    public Jogador(String nome, char cor) {
        if (cor != 'p' && cor != 'b') {
            throw new IllegalArgumentException("A cor deve ser 'p' (preta) ou 'b' (branca).");
        }
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return this.nome;
    }

    public char getCor() {
        return this.cor;
    }
}
