
package domain;


public class Rectangulo extends FiguraGeometrica { //como figuraGeometrica es abstracta, tenemos que implementar todos los métodos abstractos o daría error
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);//asi llamamos al constructor de la clase padre
    }
    
    @Override //el compilador usa la misma notación para indicar que estamos implementando que cuando estamos sobrescribiendo
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
