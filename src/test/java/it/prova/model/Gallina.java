package it.prova.model;

public class Gallina implements Volatile{
    private String piumaggio;

    public Gallina(){}

    public Gallina(String piumaggio){
        this.piumaggio = piumaggio;
    }

    public String getPiumaggio(){
        return this.piumaggio;
    }

    public void setPiumaggio(String piumaggio){
        this.piumaggio = piumaggio;
    }

    @Override
    public void vola() {
        System.out.println("Io saltello");
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
        if (!(o instanceof Gallina)){
            return false;
        }
        Gallina g = (Gallina) o;
        return this.piumaggio.equals(g.getPiumaggio());
    }
}
