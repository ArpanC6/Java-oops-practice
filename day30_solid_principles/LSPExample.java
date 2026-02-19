class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {}

public class LSPExample {
    public static void main(String[] args) {
        Bird bird = new Sparrow(); // valid
        bird.fly();
    }
}
