package entities;

public class Ponto {
    private double x;
    private double y;
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ponto(Ponto ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void assign(Ponto ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }
    public double deltaX(double vX) {
        return x - vX;
    }
    public double deltaY(double vY) {
        return y - vY;
    }
    public double distance(double posX, double posY) {
        double dx = deltaX(posX);
        double dy = deltaY(posY);
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(Ponto ponto) {
        return distance(ponto.x, ponto.y);
    }
    public double distance() {
        return distance(this.x, this.y);
    }
    public void desloc(double dX, double dY) {
        x += dX;
        y += dY;
    }
    public void escale(double factor) {
        x *= factor;
        y *= factor;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y +')';
    }
}
