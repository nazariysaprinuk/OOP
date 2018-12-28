public class Circle implements Shape {
    double radius;

    public Circle(double r){
        this.radius = r;
    }


    @Override
    public double calcSqr(){
        double s = 3.14 * (radius*radius);
        System.out.println(s);
        return s;
    }
}
