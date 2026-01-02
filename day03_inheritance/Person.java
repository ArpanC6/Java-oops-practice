class Person {
    String name;
    int age;


    void setData (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPerson () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}