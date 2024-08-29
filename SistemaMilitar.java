import java.util.Scanner;
import java.util.Date;

public class SistemaMilitar {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Crear algunos datos de ejemplo
        CuerpoEjercito infanteria = new CuerpoEjercito("INF", "Infantería");
        Compañia compañiaA = new Compañia("A", "Defensa Terrestre");
        Cuartel cuartelCentral = new Cuartel("C1", "Cuartel Central", "Capital");

        Soldado soldado1 = new Soldado("S001", "Juan", "Pérez", "Cabo", infanteria, compañiaA, cuartelCentral);
        Servicio servicioCorrer = new Servicio("SRV001", "Correr", new Date());
        
        soldado1.realizarServicio(servicioCorrer);
        
        // Crear un usuario soldado para el sistema
        SoldadoUsuario soldadoUsuario = new SoldadoUsuario("juanp", "1234", soldado1);

        // Menú principal
        mostrarMenuPrincipal(soldadoUsuario);
    }

    public static void mostrarMenuPrincipal(Usuario usuario) {
        System.out.printf("Bienvenido al Sistema Militar");
        usuario.accederSistema();

        while (true) {
            if (usuario instanceof SoldadoUsuario) {
                mostrarMenuSoldado((SoldadoUsuario) usuario);
            } else if (usuario instanceof SuboficialUsuario) {
                mostrarMenuSuboficial();
            } else if (usuario instanceof OficialUsuario) {
                mostrarMenuOficial();
            } else {
                System.out.printf("Usuario no reconocido.");
                break;
            }
        }
    }

    // Menú para soldados
    public static void mostrarMenuSoldado(SoldadoUsuario usuario) {
        System.out.printf("1. Consultar mis datos");
        System.out.printf("2. Consultar servicios realizados");
        System.out.printf("3. Salir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                consultarDatosSoldado(usuario.getSoldado());
                break;
            case 2:
                consultarServiciosSoldado(usuario.getSoldado());
                break;
            case 3:
                System.out.printf("Saliendo del sistema...");
                System.exit(0);
                break;
            default:
                System.out.printf("Opción no válida.");
        }
    }

    // Menú para suboficiales
    public static void mostrarMenuSuboficial() {
        System.out.printf("1. Administrar soldados");
        System.out.printf("2. Administrar servicios");
        System.out.printf("3. Salir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Lógica para administrar soldados
                break;
            case 2:
                // Lógica para administrar servicios
                break;
            case 3:
                System.out.printf("Saliendo del sistema...");
                System.exit(0);
                break;
            default:
                System.out.printf("Opción no válida.");
        }
    }

    // Menú para oficiales
    public static void mostrarMenuOficial() {
        System.out.printf("1. Administrar todo el sistema");
        System.out.printf("2. Salir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Lógica para administrar todo el sistema
                break;
            case 2:
                System.out.printf("Saliendo del sistema...");
                System.exit(0);
                break;
            default:
                System.out.printf("Opción no válida.");
        }
    }

    // Consultar datos del soldado
    public static void consultarDatosSoldado(Soldado soldado) {
        System.out.printf("Datos del Soldado:");
        System.out.printf("Código: " + soldado.getCodigo());
        System.out.printf("Nombre: " + soldado.getNombre());
        System.out.printf("Apellidos: " + soldado.getApellidos());
        System.out.printf("Graduación: " + soldado.getGraduacion());
        System.out.printf("Cuerpo: " + soldado.getCuerpo().getDenominacion());
        System.out.printf("Compañía: " + soldado.getCompañia().getNumero());
        System.out.printf("Cuartel: " + soldado.getCuartel().getNombre());
    }

    // Consultar servicios realizados por el soldado
    public static void consultarServiciosSoldado(Soldado soldado) {
        System.out.printf("Servicios realizados por " + soldado.getNombre() + ":");
        for (Servicio servicio : soldado.getServicios()) {
            System.out.printf("- " + servicio.getDescripcion() + " en fecha: " + servicio.getFechaRealizacion());
        }
    }
}
