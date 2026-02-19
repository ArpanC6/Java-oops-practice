interface Shape {
    double area();
}

class Rectangle implements Shape {
    public double area() {
        return 10 * 5;
    }
}

class Circle implements Shape {
    public double area() {
        return 3.14 * 7 * 7;
    }
}

public class OCPExample {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
