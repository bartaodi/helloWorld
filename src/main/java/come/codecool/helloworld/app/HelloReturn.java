package come.codecool.helloworld.app;

public class HelloReturn {
    public static void main(String[] args) {
        sayHello();
    }

    public static String getMessage() {
        return "Hello World!";
    }

    public static void sayHello() {
        String message = getMessage();
        System.out.println(message);
    }


}
