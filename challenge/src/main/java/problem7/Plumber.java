package problem7;

public class Plumber extends Person{
    private String work;
    public Plumber(String name){
        super(name);
        this.work = "Plumber";
    }

    public void display() {
        System.out.println("I am " + name +  " the " + work);
    }
}
