package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String BOT_NAME = "Drus";
        int BIRTH_YEAR = 2023;
        System.out.println("Hello! My name is " + BOT_NAME);
        System.out.println("I was created in " + BIRTH_YEAR);
        System.out.println("Please, remind me your name.");


        String user_name = scanner.nextLine();
        System.out.println("What a great name you have, " + user_name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7."); // 1 4 5
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's good time to start programming!");
        System.out.println("Now i Will prove to you that I can count to any number you want");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++)
        {
            System.out.println(i + " !");
        }
    }

}
