package TEMASAVANZADOS;

public class ClasesAbstracta {
// dejan sin implementar alguno de sus metodos para que las clases hijos o derivadas proporcione la implementacion
public static void main(String[] args) {
    
    // var figuraGeometrica=new FiguraGeometrica();/*no se puede instanciar de estas dos maneras debido a que son clases abstractas  */
    // FiguraGeometrica figuraGeometrica2=new FiguraGeometrica();

FiguraGeometrica figuraGeometrica=new Rectangulo();
// var figuraGeometrica2=new Rectangulo();
figuraGeometrica.dibujar();
figuraGeometrica=new Circulo();
figuraGeometrica.dibujar();

}

}

abstract class FiguraGeometrica{
    public abstract void dibujar();

} 
/*No se puede crear objetos de esta clase o instanciar */


 class Rectangulo extends FiguraGeometrica{/*Si no se agrega el metodo abstracto de la clase que hereda se obliga a la clase ser abstracta */
/*nota:clases estaticas no pueden ser si se crean clases ajenas dentro de la principal */
@Override
public void dibujar(){
    System.out.println("Se dibuja un rectangulo");
};
}

 class Circulo extends FiguraGeometrica{/*Si no se agrega el metodo abstracto de la clase que hereda se obliga a la clase ser abstracta */
/*nota:clases estaticas no pueden ser si se crean clases ajenas dentro de la principal */
@Override
public void dibujar(){
    System.out.println("Se dibuja un circulo");
};

}

