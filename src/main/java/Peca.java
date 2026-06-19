public abstract class Peca {
    private String nome;

    public Peca(String tipo, int numero, char cor) {
        this.nome = tipo + numero + cor;
    }

    public String getNome() {
        return this.nome;
    }
}

class Rei extends Peca {
    public Rei(int numero, char cor) {
        super("K", numero, cor);
    }
}

class Rainha extends Peca {
    public Rainha(int numero, char cor) {
        super("Q", numero, cor);
    }
}

class Torre extends Peca {
    public Torre(int numero, char cor) {
        super("T", numero, cor);
    }
}

class Bispo extends Peca {
    public Bispo(int numero, char cor) {
        super("B", numero, cor);
    }
}

class Cavalo extends Peca {
    public Cavalo(int numero, char cor) {
        super("H", numero, cor);
    }
}

class Peao extends Peca {
    public Peao(int numero, char cor) {
        super("P", numero, cor);
    }
}
