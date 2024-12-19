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
    }

}
