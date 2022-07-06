public class Inimigo {

    private String classe;
    private InimigoEstado estado;

    public Inimigo() {
        this.estado = InimigoEstadoVivo.getInstance();
    }

    public void setEstado(InimigoEstado estado) {
        this.estado = estado;
    }

    public boolean viver() {
        return estado.viver(this);
    }

    public boolean suspeitar() {
        return estado.suspeitar(this);
    }

    public boolean procurar() {
        return estado.procurar(this);
    }

    public boolean alertar() {
        return estado.alertar(this);
    }

    public boolean lutar() {
        return estado.lutar(this);
    }

    public boolean morrer() {
        return estado.morrer(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getClasseInimigo() {
        return classe;
    }

    public void setClasseInimigo(String classe) {
        this.classe = classe;
    }

    public InimigoEstado getEstado() {
        return estado;
    }
}
