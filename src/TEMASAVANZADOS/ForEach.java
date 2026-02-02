package TEMASAVANZADOS;

public class ForEach {/*significa por cada elemento que tengamos en nuestra coleccion*/
public static void main(String[] args) {
    
int edades[]={5,10,30,45};

for (int i : edades) /*dos parametros en lugar de tres,variable que almacene las referencias de cada uno de los elementos que vamos a recorrer y segundo parametro el arreglo a recorrer
*/{
    System.out.println("Edades: "+i);
}

}
}
