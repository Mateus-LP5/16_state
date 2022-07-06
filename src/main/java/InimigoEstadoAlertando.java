public class InimigoEstadoAlertando extends InimigoEstado {

    private InimigoEstadoAlertando () {}
    private static InimigoEstadoAlertando instance = new InimigoEstadoAlertando();

    public static InimigoEstadoAlertando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Alertando";
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
