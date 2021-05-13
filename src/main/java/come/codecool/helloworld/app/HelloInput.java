package come.codecool.helloworld.app;

import java.util.Scanner;

public class HelloInput {
    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello() {
        System.out.println(getMessage());
    }

    public static String getMessage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        scanner.close();

        if (name.isEmpty()) {
            return "Hello World!";
        } else {
            return "Hello " + name + "!";
        }
    }

}
