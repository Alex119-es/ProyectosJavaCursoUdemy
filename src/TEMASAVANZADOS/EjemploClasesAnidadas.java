package TEMASAVANZADOS;

public class EjemploClasesAnidadas {

    private String nombre = "Clase Principal";

    public static void main(String[] args) {
        
        System.out.println("=== CLASE STATIC (anidada) ===");
        // No necesita instancia de EjemploClasesAnidadas
        ClaseStatica objetoStatic = new ClaseStatica();
        objetoStatic.mostrar();
        
        System.out.println("\n=== CLASE NO STATIC (interna) ===");
        // Necesita primero instancia de EjemploClasesAnidadas
        EjemploClasesAnidadas externa = new EjemploClasesAnidadas();
        ClaseNoStatica objetoNoStatic = externa.new ClaseNoStatica();
        objetoNoStatic.mostrar();
        
        System.out.println("\n=== CLASE AFUERA (independiente) ===");
        // No necesita nada, es independiente
        ClaseAfuera objetoAfuera = new ClaseAfuera();
        objetoAfuera.mostrar();
    }

    // =========================================
    // CLASE STATIC ANIDADA
    // =========================================
    static class ClaseStatica {
        public void mostrar() {
            System.out.println("Soy static anidada");
            // System.out.println(nombre); // ❌ ERROR - No puede acceder a miembros de instancia
        }
    }

    // =========================================
    // CLASE NO STATIC ANIDADA (INTERNA)
    // =========================================
    class ClaseNoStatica {
        public void mostrar() {
            System.out.println("Soy clase interna (no static)");
            System.out.println("Puedo acceder a: " + nombre); // ✅ Puede acceder
        }
    }

}

// =========================================
// CLASE AFUERA (TOP-LEVEL)
// =========================================
class ClaseAfuera {/*si te lo preguntas que pasaria si esto fuese static en clase es que no se puede,recuerda... */
    public void mostrar() {
        System.out.println("Soy clase independiente (afuera)");
        // No puedo acceder a nada de EjemploClasesAnidadas
    }
}
