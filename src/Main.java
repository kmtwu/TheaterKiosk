//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age?");
        int age;
        age = in.nextInt();
        if (age >= 21){
            System.out.println("You get a wristband!");
        }
    }
}