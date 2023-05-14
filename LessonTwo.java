import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your Job title");
        String job = scanner.nextLine();

        System.out.println("Welcome "+name+".\nYou are "+age+" years old."+"\nYou work as a/an "+job);

        System.out.println("----------------------------------------------------");
        age = 25;
        System.out.println(age++);
        System.out.println(age);
        age *= 5;
        age %= 5;
        System.out.println(age);
        // *= /= += -= %= 

        System.out.println("----------------------------------------------------");

        scanner.close();
      

        





    }
}
