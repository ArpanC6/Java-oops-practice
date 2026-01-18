import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        // Case 1: Value present
        Student s1 = new Student("Arpan");
        Optional<Student> opt1 = Optional.of(s1);

        System.out.println("Student Name: " + opt1.get().getName());

        // Case 2: Value may be null
        Student s2 = null;
        Optional<Student> opt2 = Optional.ofNullable(s2);

        // isPresent()
        if (opt2.isPresent()) {
            System.out.println(opt2.get().getName());
        } else {
            System.out.println("Student is null");
        }

        // orElse()
        Student defaultStudent = opt2.orElse(new Student("Default Student"));
        System.out.println("Name using orElse: " + defaultStudent.getName());

        // ifPresent()
        opt1.ifPresent(stu -> 
            System.out.println("ifPresent(): " + stu.getName())
        );

        // orElseThrow()
        Optional<String> emptyOpt = Optional.empty();
        try {
            emptyOpt.orElseThrow(() -> 
                new RuntimeException("No value present!")
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}