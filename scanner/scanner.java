import java.util.Scanner;

public class scanner {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        int num = sc.nextInt(); // take integer value
        // nextDouble()-> take double value
        // nextFloat()-> take float value
        // nextLong()-> take long value
        // next()-> single word;
        // nextLine()-> for full line
        // nextBoolean()-> for boolean value;

        System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter number");
        int num1 = sc.nextInt();

        System.out.println("Enter number");
        int num2 = sc.nextInt();

        System.out.println("Enter number");
        int num3 = sc.nextInt();

        // Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);

    }

}
