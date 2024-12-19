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

        System.out.println("Let's test your knowledge of biology.\nHow many pairs of chromosomes does a human have?\n1. 25\n2. 24\n3. 17\n4. 23");
        int answer = scanner.nextInt();
        while (answer != 4) {
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
        }
        System.out.println("Goodbye, have a nice day!");
    }

}
