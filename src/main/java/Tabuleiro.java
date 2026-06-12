class Tabuleiro {
    private char[][] casas = new char[3][3];

    public Tabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.casas[i][j] = ' ';
            }
        }
    }

    public boolean jogar(char simbolo, int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || this.casas[linha][coluna] != ' ') {
            return false;
        }
        this.casas[linha][coluna] = simbolo;
        return true;
    }

    public boolean acabouOJogo() {
        return todasAsCasasPreenchidas() || haUmVencedor();
    }

    public boolean todasAsCasasPreenchidas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.casas[i][j] == ' ') return false;
            }
        }
        return true;
    }

    public boolean haUmVencedor() {
        // Linhas e Colunas
        for (int i = 0; i < 3; i++) {
            if (casas[i][0] != ' ' && casas[i][0] == casas[i][1] && casas[i][1] == casas[i][2]) return true;
            if (casas[0][i] != ' ' && casas[0][i] == casas[1][i] && casas[1][i] == casas[2][i]) return true;
        }
        // Diagonais
        if (casas[1][1] != ' ') {
            if (casas[0][0] == casas[1][1] && casas[1][1] == casas[2][2]) return true;
            if (casas[0][2] == casas[1][1] && casas[1][1] == casas[2][0]) return true;
        }
        return false;
    }

    public void mostrar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + this.casas[i][j] + "]");
            }
            System.out.println(" " + i);
        }
        System.out.println();
    }
    
}
private String[][] casas = new String[8][8];

public class Tabuleiro {
    private Peca[][] casas;
    private int rodadas = 0;

    public Tabuleiro() {
        casas = new Peca[8][8];
        colocarPecas();
        mostrar();
    }

    public void colocarPecas() {
        casas[0][0] = new Torre(1, 'p');
        casas[0][1] = new Cavalo(1, 'p');
        casas[0][2] = new Bispo(1, 'p');
        casas[0][3] = new Rainha(0, 'p');
        casas[0][4] = new Rei(0, 'p');
        casas[0][5] = new Bispo(2, 'p');
        casas[0][6] = new Cavalo(2, 'p');
        casas[0][7] = new Torre(2, 'p');

        for (int j = 0; j < 8; j++) {
            casas[1][j] = new Peao(j + 1, 'p');
            casas[6][j] = new Peao(j + 1, 'b');
        }

        casas[7][0] = new Torre(1, 'b');
        casas[7][1] = new Cavalo(1, 'b');
        casas[7][2] = new Bispo(1, 'b');
        casas[7][3] = new Rainha(0, 'b');
        casas[7][4] = new Rei(0, 'b');
        casas[7][5] = new Bispo(2, 'b');
        casas[7][6] = new Cavalo(2, 'b');
        casas[7][7] = new Torre(2, 'b');
    }

    public void mostrar() {
        System.out.println("    a   b   c   d   e   f   g   h");
        System.out.println("  +---+---+---+---+---+---+---+---+");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " |");
            for (int j = 0; j < 8; j++) {
                if (casas[i][j] == null) {
                    System.out.print("   |");
                } else {
                    System.out.print(casas[i][j].getNome() + "|");
                }
            }
            System.out.println(" " + (8 - i));
            System.out.println("  +---+---+---+---+---+---+---+---+");
        }
        System.out.println("    a   b   c   d   e   f   g   h");
    }

    public boolean acabouOJogo() {
        return rodadas >= 3;
    }

    public void incrementarRodada() {
        this.rodadas++;
    }
}
