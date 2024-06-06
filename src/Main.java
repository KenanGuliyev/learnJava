public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7, 9};
        int searchNumber = 1;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Yes it is Here!");
        } else {
            System.out.println("Not it is Here!");
        }
    }
}
