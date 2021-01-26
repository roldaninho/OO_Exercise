public class Quadrat extends Figura {

    private double l1;

    public Quadrat(double l1) {
        this.l1 = l1;
    }

    public double area(){
        return Math.pow(l1,2);
    }

    @Override
    public String toString(){
        return "Quadrat l1: " + this.l1 + " area: ((" + this.area() + "))";
    }
}
