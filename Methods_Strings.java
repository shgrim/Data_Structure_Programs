package Programs;

import java.util.Arrays;

public class Methods_Strings {
    public static void main(String[] args) {
        String name="Raghib khan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('g'));
        System.out.println(Arrays.toString(name.split(" ")));//split at space because we passed regex as space and divided it in arrays
    }
}
