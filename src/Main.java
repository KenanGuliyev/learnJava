public class Main {
    public static void main(String[] args) {
        String message = "Today weather is sunny";
        String newMessage = cityGive();
        System.out.println(newMessage);
        int toplam =topla(2,6,7,4,3,33,3);
        System.out.println(toplam);

        int number = topla(10, 7);
        System.out.println(number);

        int numberSum = topla(10, 7, 3);
        System.out.println(numberSum);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Delete");
    }

    public static void update() {
        System.out.println("Update");
    }

    public static int topla(int number1, int number2) {
        return number1 + number2;
    }

    public static int topla(int... numbers) {
        int toplam = 0;
        for (int number : numbers) {
            toplam += number;
        }
        return toplam;
    }

    public static String cityGive() {
        return "New York";
    }
}
