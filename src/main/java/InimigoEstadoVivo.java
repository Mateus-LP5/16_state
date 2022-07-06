public class InimigoEstadoVivo extends InimigoEstado {

    private InimigoEstadoVivo() {};
    private static InimigoEstadoVivo instance = new InimigoEstadoVivo();

    public  static InimigoEstadoVivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Vivo";
    }

    public boolean suspeitar(Inimigo inimigo) {
        inimigo.setEstado(InimigoEstadoSuspeitando.getInstance());
        return true;
    }
}
