public class ArrayPalindrom {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 1, 4, 3};
        int n = numbers.length;
        palindrom(numbers, n);
    }

    public static void palindrom(int[] numbers, int n) {
        int index = 0;
        for (int i = 0; i <= n / 2 && n != 0; i++) {

            if (numbers[i] != numbers[n - i - 1]) {
                index = 1;
                break;
            }
        }
        if (index != 1)
            System.out.println("Cyfry tablicy są palindromem");
        else
            System.out.println("Cyfry tablicy nie są palindromem");
    }
}
