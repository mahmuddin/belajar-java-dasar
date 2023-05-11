public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Mahmuddin Nurul Fajri";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Budi";
        System.out.println(name);

        // Kata kunci var
        var firstName = "Mahmuddin";
        var middleName = "Nurul";
        var lastName = "Fajri";

        System.out.print(firstName);
        System.out.print(middleName);
        System.out.println(lastName);

        // Kata kunci final
        final String application = "Belajar Java";
        // application = "Belajar PHP"; // akan Error
        System.out.println(application);

    }
}
