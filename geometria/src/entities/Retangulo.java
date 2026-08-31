package entities;

public class Retangulo extends Figura {
    private float altura;
    private float comprimento;

    public Retangulo(float altura, float comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public float calcularArea(){
        return altura*comprimento;
    }

    public float calcularPerimetro(){
        return (2*altura)+(2*comprimento);
    }
}
