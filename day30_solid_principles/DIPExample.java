interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing with wired keyboard");
    }
}

class Computer {
    private Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void start() {
        keyboard.type();
    }
}

public class DIPExample {
    public static void main(String[] args) {
        Keyboard keyboard = new WiredKeyboard();
        Computer computer = new Computer(keyboard);
        computer.start();
    }
}
