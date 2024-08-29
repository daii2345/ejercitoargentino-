import java.util.ArrayList;
import java.util.List;

public class Soldado {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String graduacion;
    private CuerpoEjercito cuerpo;
    private Compañia compañia;
    private Cuartel cuartel;
    private List<Servicio> servicios;

    public Soldado(String codigo, String nombre, String apellidos, String graduacion, CuerpoEjercito cuerpo, Compañia compañia, Cuartel cuartel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.graduacion = graduacion;
        this.cuerpo = cuerpo;
        this.compañia = compañia;
        this.cuartel = cuartel;
        this.servicios = new ArrayList<>();
    }

    public void realizarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGraduacion() {
        return graduacion;
    }

    public CuerpoEjercito getCuerpo() {
        return cuerpo;
    }

    public Compañia getCompañia() {
        return compañia;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }
}
