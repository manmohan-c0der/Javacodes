import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramStr {
    public static void main(String[] args) {
        String str1 = "keep";
        String str2 = "peeks";
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The String is an Anagram ");
        } else {
            System.out.println("The String is not  an Anagram ");

        }

    }

}
