package Programs;
import java.util.Arrays;
import java.util.*;
public class stringsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
    }

    static void ss(String[] countries) {
        int size = countries.length;
//logic for sorting
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < countries.length; j++) {
//compares each elements of the array to all the remaining elements
                if (countries[i].compareTo(countries[j]) > 0) {
//swapping array elements
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(countries));
    }
    static void sort(String []s)
    {
        for (int i=1 ;i<s.length; i++)
        {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }
}
