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
        Aquila a = (Aquila) o;
        return this.razza.equals(a.razza);
    }

}
