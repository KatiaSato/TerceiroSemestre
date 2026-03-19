package entities;

public class Circulo extends Ponto {
    private double raio;

    public Circulo() {
        super();
        raio = 1;
    }

    public Circulo(int x, int y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    public Circulo(Circulo circulo) {
        super(circulo);
        this.raio = circulo.raio;
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void assign(Circulo circulo) {
        super.assign(circulo);
        this.raio = circulo.raio;
    }

    @Override
    public void escale(double factor) {
        super.escale(factor);
        this.raio *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + raio + ")";
    }

    public boolean isValid() {
        return raio > 0;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public void print() {
        System.out.println(toString());
    }

    public boolean secante(Circulo circulo) {
        //retorna true se os circulos dao secantes
        return distance(circulo) > 0 && distance(circulo) < raio + circulo.raio;

    }

    public boolean tangentee(Circulo circulo) {
        //retorna tru se os circulo sao tangentes
        return distance(circulo) == raio + circulo.raio;
    }
}
