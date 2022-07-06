public class InimigoEstadoMorto extends InimigoEstado {

    private InimigoEstadoMorto () {}
    private static InimigoEstadoMorto instance = new InimigoEstadoMorto();

    public static InimigoEstadoMorto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Morto";
    }
}
