package it.prova.model;

public class Pinguino implements Volatile{
    private String continenteAppartenenza;

    public Pinguino(){}

    public Pinguino(String continenteAppartenenza){
        this.continenteAppartenenza = continenteAppartenenza;
    }

    public String getContinenteAppartenenza(){
        return this.continenteAppartenenza;
    }

    public void setContinenteAppartenenza(String continenteAppartenenza){
        this.continenteAppartenenza = continenteAppartenenza;
    }

    @Override
    public void vola() {
        System.out.println("Io non so volare");
    }
}
