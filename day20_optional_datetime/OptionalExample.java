import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getName(boolean present) {
        if (present) {
            return Optional.of("Arpan");
        } else {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {

        Optional<String> name1 = getName(true);
        Optional<String> name2 = getName(false);

        // isPresent()
        if (name1.isPresent()) {
            System.out.println("Name1: " + name1.get());
        }

        // orElse()
        System.out.println("Name2: " + name2.orElse("Default Name"));

        // ifPresent()
        name1.ifPresent(n -> System.out.println("Length: " + n.length()));
    }
}
