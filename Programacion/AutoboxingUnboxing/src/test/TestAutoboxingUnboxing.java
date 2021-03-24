package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        
        //clases envolventes o wrapper de tipos primitivos:
        /*
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
            byte - Byte
            char - Character
            short - Short
        
        */
        
        //boxing
        
        //una clase wrapper no solo almacena el valor si no que también tenemos métodos para convertir más facilmente el valor que está almacenando
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
        
        
        //unboxing
        //del objeto que contiene el valor se le extrae  a la variable
        int entero2 = entero; //ya no es un object, es un tipo primitivo
        System.out.println("entero2 = " + entero2); 
    }
}
