public class BuilderMain {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setName("Arpan")
                .setEmail("arpan@gmail.com")
                .setAge(22)
                .setCountry("India")
                .setDepartment("CSE")
                .build();
        
        user.display();
    }
}