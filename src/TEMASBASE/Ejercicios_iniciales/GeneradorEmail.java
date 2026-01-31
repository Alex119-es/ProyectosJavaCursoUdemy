package Ejercicios_iniciales;

public class GeneradorEmail {
    
    public static void main(String[] args) {
        System.out.println("****Generador de Email****");
        var nombre_usuario="Alextremo ureo sines 119";
        System.out.println("Nombre de usuario sin normalizar: "+nombre_usuario);
         var nombreUsuarioNormalizado=nombre_usuario.toLowerCase().replace(" ",".");
        ;
                /*al final use replace en lugar de join*/
        System.out.println("Nombre de usuario normalizado: "+nombreUsuarioNormalizado);
        
        var empresa="Hyndra Company";
        System.out.println("Nombre empresa: ".concat(empresa));
        var extensionDominio=".com.mx";
        System.out.println("Extension de dominio: "+extensionDominio);
        var dominioDeEmailNormalizado=new StringBuilder();
            dominioDeEmailNormalizado.append("@").append(empresa.toLowerCase().replace(" ","")).append(extensionDominio);
        System.out.println("Dominio email normalizado: "+dominioDeEmailNormalizado);
        var emailFinalGenerado="Email Final Generado: "+nombreUsuarioNormalizado+dominioDeEmailNormalizado;
            System.out.println(emailFinalGenerado);
    }
}