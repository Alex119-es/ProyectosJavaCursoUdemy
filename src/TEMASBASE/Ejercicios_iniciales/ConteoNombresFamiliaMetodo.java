package TEMASBASE.Ejercicios_iniciales;

public class ConteoNombresFamiliaMetodo {
    public static String pintarPersona(String nombre,String apellido1,String apellido2){
        return nombre+" "+apellido1+" "+apellido2;
    }
        public static void main (String []args){
            String nombrehijo1=args[2];
    String nombrehijo2=args[3];
    String nombrehijo3=args[4];
    String nombrepadre=args[5];
    String nombremadre=args[6];
String apellidopadre=args[0];
String apellidomadre=args[1];
    System.out.println("Nombre del padre: "+pintarPersona(nombrepadre,apellidopadre,""));
     System.out.println("Nombre de la madre : "+pintarPersona(nombremadre,apellidomadre,""));
     System.out.println("Nombre del primer hijo: "+pintarPersona(nombrehijo1,apellidopadre,apellidomadre));
    System.out.println("Nombre del segundo hijo: "+pintarPersona(nombrehijo2,apellidopadre,apellidomadre));
    System.out.println("Nombre del tercer hijo: "+pintarPersona(nombrehijo3,apellidopadre,apellidomadre));
    
    
}
}