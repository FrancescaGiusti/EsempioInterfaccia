package it.prova.test;

import it.prova.model.Aquila;
import it.prova.model.Gallina;
import it.prova.model.Pinguino;
import it.prova.model.Volatile;

public class TestVolatile {
    public static void main(String[] args){
        //Test per vedere come si comporta l'interfaccia con l'aquila
        Volatile v = new Aquila("Reale");
        v.vola();

        //Test per vedere come si comporta l'interfaccia con la gallina
        Volatile v2 = new Gallina("Rosso");
        v2.vola();

        //Test per vedere come si comporta l'interfaccia con il pinguino
        Volatile v3 = new Pinguino("Polo Nord");
        v3.vola();
    }
}
