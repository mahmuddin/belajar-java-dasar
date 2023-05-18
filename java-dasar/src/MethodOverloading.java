public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Mahmuddin");
        sayHello("Mahmuddin", "Nurul Fajri");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello" + name);
    }

    static void sayHello(String fistName, String lastName) {
        System.out.println("Hello" + fistName + " " + lastName);
    }
}
