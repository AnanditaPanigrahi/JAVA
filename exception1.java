class demo {
    public void a() {
        System.out.println("Hello World");
        int value=9;
        b();
    }

    public void b() {
        int num1 = 9;
        int num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed" + e.getMessage());
        }
    }
}

public class exception1 {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.a();
    }
}
