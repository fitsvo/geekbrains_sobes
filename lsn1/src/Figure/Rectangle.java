package Figure;

public class Rectangle implements  FigureInterface {

    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public double getPerimeter(){
        return (this.a + this.b) * 2;
    }

    @Override
    public double getSquare() {
        return this.a * this.b;
    }
}
