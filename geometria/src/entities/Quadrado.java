package entities;

public class Quadrado extends Figura {

    private float lado;

    public Quadrado(float lado){
        this.lado = lado;
    }

    public float calcularArea(){
        return lado*lado;

    }

    public float calcularPerimetro(){
        return 4*lado;
    }
}
