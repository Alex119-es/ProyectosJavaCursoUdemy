package TEMASBASE.SentenciasDeDecisionYPosterior;

public class TraumaTernarioPrueba {
    
    public static void main(String[] args) {
        var numero=4;
        System.out.println((numero>2 ? "si":"no"));
        /*ahora almacenado ennuna variable interna*/
         var numeroV1=9;
        int abarco=(numeroV1 >5 ? 4: 3);
        System.out.println(abarco);
        var piolin=10;
        String cadena= String.valueOf((piolin >5? "a si":"a no"));
        String abarcomascorto=(piolin >5 ?"Si":"no");
        System.out.println(cadena);
        System.out.println(abarcomascorto);
        
        
    }
    
}