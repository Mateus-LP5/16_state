public class InimigoEstadoLutando extends InimigoEstado {

    private InimigoEstadoLutando () {}
    private static InimigoEstadoLutando instance = new InimigoEstadoLutando();

    public static InimigoEstadoLutando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lutando";
    }

    public boolean viver(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        return true;
    }

    public boolean morrer(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        return true;
    }
}
