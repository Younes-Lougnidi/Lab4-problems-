package problem6;

public class Square extends Forme{
    private double side;
    public Square(double s){
        super(s*s);
        this.side = s;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Square of side length : ").append(side);
        return s.toString();
    }

}
