public class Square implements Shape {
    int side;
    public Square(int a){
        this.side = a;
    }

    @Override
    public double calcSqr(){
        double s = side*side;
        System.out.println(s);
        return s;
    }
}
