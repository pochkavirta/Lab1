public class Palindrome {
    public static void main(String[] args) {
        if (args == null) {
            System.out.println("Отсутствуют входные значения");
            return;
        }

        for (String word : args) {
            if (word.equals(reverseString(word))) {
                System.out.println(String.format("%s является палиндромом", word));
            } else {
                System.out.println(String.format("%s не является палиндромом", word));
            }
        }
    }

    private static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
