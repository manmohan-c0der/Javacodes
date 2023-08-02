import java.lang.reflect.Array;

public class PalindromeStr {
    public static void main(String[] args) {
        String str1 = "cool";
        String str2 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if (str1.equals(str2)) {
            System.out.println("The String is Palindrome ");
        } else {
            System.out.println("The String is not Palindrome ");
        }

    }

}
