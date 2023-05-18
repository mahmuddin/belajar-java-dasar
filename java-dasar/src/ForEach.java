public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Mahmuddin", "Ida", "Zayba", "Adnan", "Dede bayi"
        };
        // Start of Tanpa foreach
//        for (var i = 0 ; i < names.length; i++){
//            System.out.println(names[i]);
//        }
        // End of Tanpa foreach

        // Start of foreach
        for (var name : names){
            System.out.println(name);
        }
        // End of foreach

    }
}
