package TEMASBASE.Matrices;

public class MatrizSinapsisYEjemplo {
public static void main(String[] args) {
    /*Arreglo de 2 dimensiones de n columnas x m renglones primer valor renglon segundo columna
     * 
     * Ejemplo de matriz  
     * https://imgs.search.brave.com/qKPn41682Tro4ZiwQZAoDnJM2E7dKIpdsibkSfmuQ8s/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvY29tbW9ucy9k/L2Q0L01hdHJpeExh/YmVsbGVkLnN2Zw
    */

/*Definimos matriz */


// int [][] nombreDeLaMatriz=new int [2][3];
int [][] nombreDeLaMatriz=new int [2][3];

// Modificar los valores de la matriz

nombreDeLaMatriz[0][0]=100;
nombreDeLaMatriz[0][1]=200;
nombreDeLaMatriz[0][2]=300;
nombreDeLaMatriz[1][0]=400;
nombreDeLaMatriz[1][1]=500;
nombreDeLaMatriz[1][2]=600;


// System.out.println("Valor 1 [0][0] :"+nombreDeLaMatriz[0][0]);
// System.out.println("Valor 5 [1][1] :"+nombreDeLaMatriz[1][1]);
// System.out.println("Valor 5 [1][2] :"+nombreDeLaMatriz[1][2]);


/*Recorrer una matriz */
final var Renglones=2;
final var Columnas=3;
/*Ciclo externo para recorrer los renglones */
// for(var ren=0;ren <Renglones;ren++){

//     /*CIclo interno para recorrer las columnas */
//     for(var col=0;col <Columnas;col++){
// System.out.println("Valor ["+ren+"]["+col+" ]:"+nombreDeLaMatriz[ren][col]);
// }

/*Version aun mas simplona o directa deducineod con ciclo interno y externo i,j */
for(var i=0;i <nombreDeLaMatriz.length;i++){

    /*CIclo interno para recorrer las columnas */
    for(var j=0;j <nombreDeLaMatriz[i].length;j++){
        /*Conclusión: nombreDeLaMatriz[i].length te permite saber cuántas columnas tiene cada renglón
         específico, lo cual es útil para matrices irregulares (donde cada renglón puede tener diferente 
         cantidad de columnas). */
System.out.println("Valor ["+i+"]["+j+" ]:"+nombreDeLaMatriz[i][j]);
}
}

}}