//comentario simple
public class HolaMundo {
    public static void main(String args[]) {
        //System.out.println("Hola mundo desde java");
        
        //definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        //modificamos el valor de la variable
        miVariableEntera = 5;
        //si pones sout y le das al tab te autocompleta
        System.out.println(miVariableEntera);
        
        //String va con la S mayuscula ojo
        String miVariableCadena = "Saludos";
        //para que te autocomplete variables haces control espacio
        System.out.println(miVariableCadena);
        miVariableCadena = "adios";
        //si haces control click a una variable te lleva a donde está definida
        System.out.println(miVariableCadena);
        
        //var -> inferencia de tipos en java
         
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "saludos";
        System.out.println(miVariableCadena2);
        //si mandas soutv tab te pone eso
        //System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        
        //valores permitidos en el nombre de las variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;


    }
}