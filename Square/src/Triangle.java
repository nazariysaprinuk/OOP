public class Triangle implements Shape {
    public int side;
    public int found;
    public Triangle(int a,int b){
        this.side = a;
        this.found = b;
    }

    @Override
    public double calcSqr(){
        double f = 0.5 * found;
        double s = Math.sqrt((side+(0.5*found))*(side-(0.5*found)));
        System.out.println(s*f);
        return s;
    }
}
