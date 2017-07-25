package lesson;

public class ExampleFinal {
    private static final float PI = 3.14f;
    public static final int COUNT = 10;

    final int VALUE = 100;

    public static void main(String[] args) {
        // COUNT = 100; // нельзя
        final int abc = 123;
        // abc = 0; // нельзя
    }
}
