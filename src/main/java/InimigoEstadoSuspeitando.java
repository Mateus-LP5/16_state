public class InimigoEstadoSuspeitando extends InimigoEstado {

    private InimigoEstadoSuspeitando () {}
    private static InimigoEstadoSuspeitando instance = new InimigoEstadoSuspeitando();

    public static InimigoEstadoSuspeitando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspeitando";
    }

    public boolean viver(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoVivo.getInstance());
        return true;
    }

    public boolean procurar(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoProcurando.getInstance());
        return true;
    }

}
