public class Calculator {
    public static float Add(float a, float b) {
        return a + b;
    }

    public static float Subtract(float a, float b) {
        return a - b;
    }

    public static float Multiply(float a, float b) {
        return a * b;
    }

    public static float Divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
