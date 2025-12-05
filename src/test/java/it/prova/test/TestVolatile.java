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

        //Test per vedere se gli animali sono uguali tra loro
        Volatile a1 = new Aquila("Reale");
        Volatile a2 = new Aquila("Reale");
        boolean risposta1 = a1.eUgualeA(a2);
        System.out.println("Le due aquile sono uguali? " + risposta1);
        Volatile g1 = new Gallina("Rosso");
        Volatile g2 = new Gallina("Bianco");
        boolean risposta3 = g1.eUgualeA(g2);
        System.out.println("Le due galline sono uguali? " + risposta3);
        boolean risposta2 = a1.eUgualeA(g1);
        System.out.println("L'aquila e la gallina sono uguali? " + risposta2);

    }
}
