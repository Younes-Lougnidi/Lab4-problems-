package problem7;

public class Carpenter extends Person{
    private String work;
    public Carpenter(String name){
        super(name);
        this.work = "Carpenter";
    }
    public void display() {
        System.out.println("I am " + name +  " the " + work);
    }
}
