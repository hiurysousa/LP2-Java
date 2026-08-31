package entities;

public class Quadrado extends FiguraAbstrata{

    public Quadrado(float lado){
        super(lado);
    }

    public float calcularArea() {
        return getLado()*getLado();
    }

    public float calcularPerimetro() {
        return getLado()*4;
    }
}
