public class CuerpoEjercito {
    private String codigo;
    private String denominacion;

    public CuerpoEjercito(String codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }
}

