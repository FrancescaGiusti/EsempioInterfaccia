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

    @Override
    public boolean eUgualeA(Volatile input) {
        return this.equals(input);
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Pinguino p = (Pinguino) o;
        return this.continenteAppartenenza.equals(p.continenteAppartenenza);
    }
}
