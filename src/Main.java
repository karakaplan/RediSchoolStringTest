import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println("Please enter your name: ");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println(String.format("Your age is %s and your name has %s characters", age, name.length()));

    }

}
