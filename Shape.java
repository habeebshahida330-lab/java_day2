public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        s = new Square();
        s.draw();
    }
}
