public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Eko" , "Kurniawan");
        sayHello("Joko" , "Widodo");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
