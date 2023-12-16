package Programs;

import java.util.ArrayList;

public class Pretty_printing {
    public static void main(String[] args) {
        float a= 453.1274f;
        System.out.printf("Formatted number %.2f",a);//also rounds off the decimal
        System.out.printf("Strings format %s and %s", "Apple", "Berry");
        System.out.println("a"+1);//(same as"a"+"1")integer will be converted to Integer that will call toString()
        System.out.println("Raghib"+new ArrayList<>());//it will print Raghib[],here brackets because toString() of ArrayList is [] and whatever is inside.
        //if one of the datatype is string answer will be string.
    }
}
/*      %%	Inserts a % sign
        %x %X	Integer hexadecimal
        %t %T	Time and Date
        %s %S	String
        %n	Inserts a newline character
        %o	Octal integer
        %f	Decimal floating-point
        %e %E	Scientific notation
        %g	Causes Formatter to use either %f or %e, whichever is shorter
        %h %H	Hash code of the argument
        %d	Decimal integer
        %c	Character
        %b %B	Boolean
        %a %A	Floating-point hexadecimal

 */