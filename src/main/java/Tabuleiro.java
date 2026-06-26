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
        casas[0][0] = "T1p"; casas[0][1] = "H1p"; casas[0][2] = "B1p"; casas[0][3] = "Q0p";
        casas[0][4] = "K0p"; casas[0][5] = "B2p"; casas[0][6] = "H2p"; casas[0][7] = "T2p";
        for (int j = 0; j < 8; j++) {
            casas[1][j] = "P" + (j + 1) + "p";
            casas[6][j] = "P" + (j + 1) + "b";
        }
        casas[7][0] = "T1b"; casas[7][1] = "H1b"; casas[7][2] = "B1b"; casas[7][3] = "Q0b";
        casas[7][4] = "K0b"; casas[7][5] = "B2b"; casas[7][6] = "H2b"; casas[7][7] = "T2b";
    }

    public void mostrar() {
        System.out.println("   a   b   c   d   e   f   g   h");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + casas[i][j] + "]");
            }
            System.out.println(" " + (8 - i));
        }
        System.out.println("   a   b   c   d   e   f   g   h");
    }

    public boolean casaLivre(String casa) {
        if (casa == null || casa.length() != 2) {
            return false;
        }
        int coluna = casa.charAt(0) - 'a';
        int linha = 8 - Character.getNumericValue(casa.charAt(1));

        if (coluna < 0 || coluna > 7 || linha < 0 || linha > 7) {
            return false;
        }
        return casas[linha][coluna].equals("   ");
    }

    public boolean moverPeca(String nomePeca, String destino) {
        int destCol = destino.charAt(0) - 'a';
        int destLin = 8 - Character.getNumericValue(destino.charAt(1));

        int origLin = -1, origCol = -1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (casas[i][j].equals(nomePeca)) {
                    origLin = i;
                    origCol = j;
                    break;
                }
            }
        }

        if (origLin == -1 || origCol == -1) {
            return false;
        }

        casas[destLin][destCol] = nomePeca;
        casas[origLin][origCol] = "   ";
        return true;
    }

    public boolean acabouOJogo() {
        return false;
    }
}
