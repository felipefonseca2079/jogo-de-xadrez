import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions,assertTrue;
import org.junit.jupiter.api.Test;

public class JogoDeXadrezTest {

    @Test
    public void verificarCasaLivreEOcupada() {
        Tabuleiro tabuleiro = new Tabuleiro();
        
        assertTrue(tabuleiro.casaLivre("d4"));
        
        assertTrue(!tabuleiro.casaLivre("e1"));
    }

    @Test
    public void verificarJogadorCorValida() {
        Jogador jogador = new JogadorHumano("Felipe", 'b'); 
        assertTrue(jogador.getCor() == 'b');
    }

    @Test
    public void verificarJogadorCorInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            new JogadorHumano("Invalido", 'x');
        });
    }

    @Test 
    public void verificarTabuleiroFimDeJogo() {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertFalse(tabuleiro.acabouOJogo());
    }    
}
