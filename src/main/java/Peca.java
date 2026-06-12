public abstract class Peca {
    private String nome;

    public Peca(String tipo, int numero, char cor) {
        this.nome = tipo + numero + cor;
    }

    public String getNome() {
        return this.nome;
    }
}
