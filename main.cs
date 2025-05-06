using System;

class Program {
    static void Main() {
        Console.WriteLine("Hello from C#!");
        Console.WriteLine("Language: C#");

        int x = 10, y = 2;
        Console.WriteLine("Division: " + (x / y));

        string message = "Message from C#";
        Console.WriteLine("Sending to JavaScript: " + message);

        LaunchNext();
    }

    static void LaunchNext() {
        System.Diagnostics.Process.Start("cmd", "/c start app.js");
    }
}
