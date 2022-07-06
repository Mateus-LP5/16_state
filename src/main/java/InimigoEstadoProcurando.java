public class InimigoEstadoProcurando extends InimigoEstado {

    private InimigoEstadoProcurando () {}
    private static InimigoEstadoProcurando instance = new InimigoEstadoProcurando();

    public static InimigoEstadoProcurando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Procurando";
    }

    public boolean viver(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        return true;
    }

    public boolean alertar(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoAlertando.getInstance());
        return true;
    }

    public boolean lutar(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoLutando.getInstance());
        return true;
    }

    public boolean morrer(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoMorto.getInstance());
        return true;
    }
}
