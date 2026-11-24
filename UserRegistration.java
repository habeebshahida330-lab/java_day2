public class UserRegistration {
    public void register(String name, int userId) {
        System.out.println("Registered user: " + name + " with ID: " + userId);
    }

    public void register(int userId, String name) {
        System.out.println("Registered ID: " + userId + " for user: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        registration.register("Alice", 101);
        registration.register(101, "Alice");
    }
}