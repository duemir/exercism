public class HelloWorld {
    public static String hello(String name) {
        if (name == null || name.trim().isEmpty())
            return "Hello, World!";
        return "Hello, " + name + "!";
    }
}
