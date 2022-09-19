package Figure;

public class Circle implements FigureInterface{
    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.r;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
