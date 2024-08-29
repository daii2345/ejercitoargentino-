public class Compañia {
    private String numero;
    private String actividadPrincipal;

    public Compañia(String numero, String actividadPrincipal) {
        this.numero = numero;
        this.actividadPrincipal = actividadPrincipal;
    }

    public String getNumero() {
        return numero;
    }

    public String getActividadPrincipal() {
        return actividadPrincipal;
    }
}
