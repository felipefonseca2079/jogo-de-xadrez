public class Tabuleiro {
    private Peca[][] casas; 

    public Tabuleiro() {
        this.casas = new Peca[8][8]; 
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        casas[0][0] = new Torre(1, 'B'); 
        casas[0][1] = new Cavalo(1, 'B');
    }

    public void mostrarTabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (casas[i][j] != null) {
                    // Agora funciona! O Java sabe que o objeto ali dentro é uma Peca
                    System.print(casas[i][j].getNome() + " "); 
                } else {
                    System.print("[ ] ");
                }
            }
            System.println();
        }
    }
}
