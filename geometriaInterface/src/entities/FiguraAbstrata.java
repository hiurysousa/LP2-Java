package entities;

public abstract class FiguraAbstrata implements Figura{
    private float lado;

    public FiguraAbstrata(float lado){
        this.lado = lado;
    }

    public float getLado(){
        return lado;
    }

    public void setLado(float lado){
        this.lado = lado;
    }

}
