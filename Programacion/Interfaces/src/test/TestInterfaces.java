
package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
       // IAccesoDatos datos = new IAccesoDatos(); la interfaz al ser abstracta no puede ser instanciada
       IAccesoDatos datos = new ImplementacionMySql();
       
       //datos.listar();
       imprimir(datos); //en este momento la variable de datos está apuntando a la implementacion en sql por lo que mostrará listar desde Mysql
       
       datos = new ImplementacionOracle(); //podemos observar que una misma variable está apuntando a distintas implementaciones
       datos.listar();
       
       
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
