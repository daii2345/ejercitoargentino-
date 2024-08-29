import java.util.Date;

public class Servicio {
    private String codigo;
    private String descripcion;
    private Date fechaRealizacion;

    public Servicio(String codigo, String descripcion, Date fechaRealizacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }
}
