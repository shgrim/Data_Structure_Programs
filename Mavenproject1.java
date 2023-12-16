/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Programs;

/**
 *
 * @author Adolf K Weismann
 */
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch (fruit){
            case "Apple" -> System.out.println("Red fruit");
            case "Banana" -> System.out.println("Yellow fruit");
            default -> System.out.println("No such fruit");
    }
        System.exit(0);
  }
}
