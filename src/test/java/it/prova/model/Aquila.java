package it.prova.model;

public class Aquila implements Volatile{
    private String razza;

    public Aquila(){}

    public Aquila(String razza){
        this.razza = razza;
    }

    public String getRazza(){
        return this.razza;
    }

    public void setRazza(String razza){
        this.razza = razza;
    }

    @Override
    public void vola() {
        System.out.println("Io so volare");
    }
}
