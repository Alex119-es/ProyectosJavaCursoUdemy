package RetoPosteriorSwitchIfElse;

import java.util.*;

public class RetoSistemaDeAutenticacion {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese su nuevo usuario");
        var usuarioCreado = teclado.nextLine().strip().toLowerCase();
        System.out.println("Ingrese su nueva contraseña");
        var contraseñaCreada = teclado.nextLine().strip().toLowerCase();
        System.out.println("USUARIO Y CONTRASEÑA CREADOS");
        System.out.println("porfavor ingresar nuevamente usuario");
        var usuarioVerificacion = teclado.nextLine().strip().toLowerCase();
        System.out.println("ahora ingrese nuevamente la contraseña");
        var contraseñaVerificacion = teclado.nextLine().strip().toLowerCase();

        if (usuarioVerificacion.equals(usuarioCreado) && contraseñaVerificacion.equals(contraseñaCreada)) {
            System.out.println("Usuario y contraseña  correctos");
        } else if (usuarioVerificacion.equals(usuarioCreado) && !(contraseñaVerificacion.equals(contraseñaCreada))) {
            System.out.println("Usuario correcto PERO contraseña incorrecta porfavor vuelva a intentarlo");

        } else if (!(usuarioVerificacion.equals(usuarioCreado)) && contraseñaVerificacion.equals(contraseñaCreada)) {
            System.out.println("Contraseña correcta PERO usuario incorrecto porfavor vuelva a intentarlo");

        } else {
            System.out.println("Usuario y contraseña incorrectos");
        }

        String versionTernaria = (usuarioVerificacion.equals(usuarioCreado)
                && contraseñaVerificacion.equals(contraseñaCreada))
                        ? "Usuario y contraseña correctas"
                        : (!(usuarioCreado.equals(usuarioVerificacion))
                                && contraseñaCreada.equals(contraseñaVerificacion))
                                        ? "usuario incorrecto y contraseña correcta"
                                        : (usuarioCreado.equals(usuarioVerificacion)
                                                && (!contraseñaCreada.equals(contraseñaVerificacion)))
                                                        ? "usuario correcto y contraseña incorrecta"
                                                        : "usuario y contraseña incorrecta";
                                                        System.out.println(versionTernaria);

        final String usuarioConstante = "alex";
        final String contraseñaConstante = "119";
        String mensajeAutenticacionSwitch = switch (usuarioVerificacion) {
            case usuarioConstante -> {
                if (contraseñaVerificacion.equals(contraseñaCreada))
                    yield "Usuario y contraseña correctos bienvenido al sistema";
                else
                    yield "Contraseña incorrecta porfavor reintentar";
            }

            /*
             * En Java, el problema que encuentras con el switch no es que necesite
             * constantes en el sentido de final, sino que las etiquetas case deben ser
             * constantes de tiempo de compilación (es decir, valores conocidos en tiempo
             * de compilación). En tu código, usuarioCreado es una variable que se asigna
             * en tiempo de ejecución, por lo que no puede usarse directamente en un case.
             */

            default -> {
                if (contraseñaCreada.equals(contraseñaConstante))
                    yield "Usuario incorrecto,favor de corregirlo";
                else
                    yield "Usuario y contraseña incorrectos,porfavor corregirlos";
            }
        };
        System.out.println(mensajeAutenticacionSwitch);
    }
}