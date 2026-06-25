public class Tabuleiro {
    private String[][] casas = new String[8][8]; 

    public Tabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }
        colocarPecas();
        mostrar();
    }

    private void colocarPecas() {
        Peca reiBranco = new Rei(0, 'b');
        Peca reiPreto = new Rei(0, 'p');
        Peca torreBranca1 = new Torre(1, 'b');
        Peca cavaloPreto1 = new Cavalo(1, 'p');

        casas[0][4] = reiPreto.getNome();
        casas[7][4] = reiBranco.getNome();
        casas[7][0] = torreBranca1.getNome();
        casas[0][1] = cavaloPreto1.getNome();
    }

    public void mostrar() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + casas[i][j] + "]");
            }
            System.out.println();
        }
    }

    public boolean acabouOJogo() {
        return false;
    }
}
