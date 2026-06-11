public abstract class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    // Método abstrato que as subclasses serão obrigadas a implementar
    public abstract void jogar();
}
