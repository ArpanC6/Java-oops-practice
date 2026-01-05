class Dog extends Animal implements Pet {

    @Override
    void sound () {
        System.out.println("Dog barks..");
    }

    @Override
    public void play () {
        System.out.println("Dog is playing..");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
        d.play();
    }
}