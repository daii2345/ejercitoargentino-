public class SoldadoUsuario extends Usuario {
private Soldado soldado;

    public SoldadoUsuario(String nombreUsuario, String contraseña, Soldado soldado) {
        super(nombreUsuario, contraseña);
        this.soldado = soldado;
    }

 
    public void accederSistema() {
        System.out.printf("Acceso de solo consulta para el soldado: " + soldado.getNombre());
    }

    public Soldado getSoldado() {
        return soldado;
    }
}

public class SuboficialUsuario extends Usuario {

    public SuboficialUsuario(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

   
    public void accederSistema() {
        System.out.printf("Acceso para administrar soldados y servicios.");
    }
}

public class OficialUsuario extends Usuario {

    public OficialUsuario(String nombreUsuario, String contraseña) {
        super(nombreUsuario, contraseña);
    }

  
    public void accederSistema() {
        System.out.printf("Acceso total para administrar todo el sistema.");
    }
}
