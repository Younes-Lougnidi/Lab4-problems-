package problem6;

public class Circle extends Forme {
    private double radius;
    public Circle(double r){
        super(Math.pow(r,2) * Math.PI);
        this.radius = r;
    }
    public Circle(){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Circle of radius : ").append(radius);
        return s.toString();
    }
}
