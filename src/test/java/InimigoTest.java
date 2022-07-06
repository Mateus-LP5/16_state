import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InimigoTest {

    Inimigo inimigo;

    @BeforeEach
    public void setUp() {
        inimigo = new Inimigo();
    }

    //INIMIGO VIVO
    @Test
    public void naoDeveReviverinimigoVivo() {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        assertFalse(inimigo.viver());
    }

    @Test
    public void inimigoVivoDeveSuspeitar() {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        assertTrue(inimigo.suspeitar());
        assertEquals(InimigoEstadoSuspeitando.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoVivoNaoDeveProcurar() {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        assertFalse(inimigo.procurar());
    }

    @Test
    public void inimigoVivoNaoDeveAlertar() {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        assertFalse(inimigo.alertar());
    }

    @Test
    public void inimigoVivoNaoDeveLutar() {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        assertFalse(inimigo.lutar());
    }

    @Test
    public void inimigoVivoNaoDeveMorrer() {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        assertFalse(inimigo.morrer());
    }


    //INIMIGO SUSPEITANDO
    @Test
    public void inimigoSuspeitandoDeveViver() {
        inimigo.setEstado(InimigoEstadoSuspeitando.getInstance());
        assertTrue(inimigo.viver());
        assertEquals(InimigoEstadoVivo.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoSuspeitandoNaoDeveSuspeitar() {
        inimigo.setEstado(InimigoEstadoSuspeitando.getInstance());
        assertFalse(inimigo.suspeitar());
    }

    @Test
    public void inimigoSuspeitandoDeveProcurar() {
        inimigo.setEstado(InimigoEstadoSuspeitando.getInstance());
        assertTrue(inimigo.procurar());
        assertEquals(InimigoEstadoProcurando.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoSuspeitandoNaoDeveAlertar() {
        inimigo.setEstado(InimigoEstadoSuspeitando.getInstance());
        assertFalse(inimigo.alertar());
    }

    @Test
    public void inimigoSuspeitandoNaoDeveLutar() {
        inimigo.setEstado(InimigoEstadoSuspeitando.getInstance());
        assertFalse(inimigo.lutar());
    }

    @Test
    public void inimigoSuspeitandoNaoDeveMorrer() {
        inimigo.setEstado(InimigoEstadoSuspeitando.getInstance());
        assertFalse(inimigo.morrer());
    }

    //INIMIGO PROCURANDO
    @Test
    public void inimigoProcurandoDeveViver() {
        inimigo.setEstado(InimigoEstadoProcurando.getInstance());
        assertTrue(inimigo.viver());
        assertEquals(InimigoEstadoVivo.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoProcurandoNaoDeveSuspeitar() {
        inimigo.setEstado(InimigoEstadoProcurando.getInstance());
        assertFalse(inimigo.suspeitar());
    }

    @Test
    public void inimigoProcurandoNaoDeveProcurar() {
        inimigo.setEstado(InimigoEstadoProcurando.getInstance());
        assertFalse(inimigo.procurar());
    }

    @Test
    public void inimigoProcurandoDeveAlertar() {
        inimigo.setEstado(InimigoEstadoProcurando.getInstance());
        assertTrue(inimigo.alertar());
        assertEquals(InimigoEstadoAlertando.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoProcurandoDeveLutar() {
        inimigo.setEstado(InimigoEstadoProcurando.getInstance());
        assertTrue(inimigo.lutar());
        assertEquals(InimigoEstadoLutando.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoProcurandoNaoDeveMorrer() {
        inimigo.setEstado(InimigoEstadoProcurando.getInstance());
        assertFalse(inimigo.morrer());
    }


    //INIMIGO ALERTANDO
    @Test
    public void inimigoAlertandoNaoDeveViver() {
        inimigo.setEstado(InimigoEstadoAlertando.getInstance());
        assertFalse(inimigo.viver());
    }

    @Test
    public void inimigoAlertandoNaoDeveSuspeitar() {
        inimigo.setEstado(InimigoEstadoAlertando.getInstance());
        assertFalse(inimigo.suspeitar());
    }

    @Test
    public void inimigoAlertandoNaoDeveProcurar() {
        inimigo.setEstado(InimigoEstadoAlertando.getInstance());
        assertFalse(inimigo.procurar());
    }

    @Test
    public void inimigoAlertandoNaoDeveAlertar() {
        inimigo.setEstado(InimigoEstadoAlertando.getInstance());
        assertFalse(inimigo.alertar());
    }

    @Test
    public void inimigoAlertandoDeveLutar() {
        inimigo.setEstado(InimigoEstadoAlertando.getInstance());
        assertTrue(inimigo.lutar());
        assertEquals(InimigoEstadoLutando.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoAlertandoDeveMorrer() {
        inimigo.setEstado(InimigoEstadoAlertando.getInstance());
        assertTrue(inimigo.morrer());
        assertEquals(InimigoEstadoMorto.getInstance(), inimigo.getEstado());
    }


    //INIMIGO LUTANDO
    @Test
    public void inimigoLutandoDeveViver() {
        inimigo.setEstado(InimigoEstadoLutando.getInstance());
        assertTrue(inimigo.viver());
        assertEquals(InimigoEstadoVivo.getInstance(), inimigo.getEstado());
    }

    @Test
    public void inimigoLutandoNaoDeveSuspeitar() {
        inimigo.setEstado(InimigoEstadoLutando.getInstance());
        assertFalse(inimigo.suspeitar());
    }

    @Test
    public void inimigoLutandoNaoDeveProcurar() {
        inimigo.setEstado(InimigoEstadoLutando.getInstance());
        assertFalse(inimigo.procurar());
    }

    @Test
    public void inimigoLutandoNaoDeveAlertar() {
        inimigo.setEstado(InimigoEstadoLutando.getInstance());
        assertFalse(inimigo.alertar());
    }

    @Test
    public void inimigoLutandoNaoDeveLutar() {
        inimigo.setEstado(InimigoEstadoLutando.getInstance());
        assertFalse(inimigo.lutar());
    }

    @Test
    public void inimigoLutandoDeveMorrer() {
        inimigo.setEstado(InimigoEstadoLutando.getInstance());
        assertTrue(inimigo.morrer());
        assertEquals(InimigoEstadoMorto.getInstance(), inimigo.getEstado());
    }

    //INIMIGO MORTO
    @Test
    public void inimigoMortoNaoDeveViver() {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        assertFalse(inimigo.viver());
    }

    @Test
    public void inimigoMortoNaoDeveSuspeitar() {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        assertFalse(inimigo.suspeitar());
    }

    @Test
    public void inimigoMortoNaoDeveProcurar() {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        assertFalse(inimigo.procurar());
    }

    @Test
    public void inimigoMortoNaoDeveAlertar() {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        assertFalse(inimigo.alertar());
    }

    @Test
    public void inimigoMortoNaoDeveLutar() {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        assertFalse(inimigo.lutar());
    }

    @Test
    public void inimigoMortoNaoDeveMorrer() {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        assertFalse(inimigo.morrer());
    }

}