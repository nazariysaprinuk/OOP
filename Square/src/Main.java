public class Main {
    static Shape[] shapes = new Shape[9];
    public static void main(String[] args) {
        shapes[0] = new Triangle(12,11);
        shapes[1] = new Triangle(15,16);
        shapes[2] = new Triangle(30,32);
        shapes[3] = new Triangle(23,12);

        shapes[4] = new Circle(6.0);
        shapes[5] = new Circle(10.0);

        shapes[6] = new Square(14);
        shapes[7] = new Square(13);
        shapes[8] = new Square(19);

        for(int i=0;i<shapes.length;i++){
            shapes[i].calcSqr();
        }
    }
}
