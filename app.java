public class app {
    public static void main(String[] args) {
        System.out.println("Hello from Java!");
        System.out.println("Language: Java");

        int a = 5, b = 3;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        String message = "Message from Java";
        System.out.println("Sending to C#: " + message);

        callNext();
    }

    public static void callNext() {
        try {
            Runtime.getRuntime().exec("cmd /c start main.cs");
        } catch (Exception e) {
            System.out.println("Could not launch C# file.");
        }
    }
}
