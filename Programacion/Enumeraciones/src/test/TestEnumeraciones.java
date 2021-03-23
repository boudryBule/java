package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);
        //indicarDiaSemana("LUNES"); imcompatible pasar un string como una enumeracion de dias
        
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises del cuarto continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente no. 1: " + Continentes.AFRICA);
        System.out.println("Numero de paises del primer continente: " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
}
