public class User {

    private String name;
    private String email;
    private int age;
    private String country;
    private String department;

    // private constructor
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.country = builder.country;
        this.department = builder.department;
    }

    public void display() {
        System.out.println(name + " | " + email + " | " + age + " | " + country + " | " + department);
    }

    // Static inner Builder class
    public static class UserBuilder {
        private String name;
        private String email;
        private int age;
        private String country;
        private String department;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public UserBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
