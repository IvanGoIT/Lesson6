package lesson;

public class ExampleStatic {
    // статическая переменная
    // можно обращаться без создания объекта класса
    public static int staticCount = 0;

    public int count = 0;

    // статический блок кода
    static {
        System.out.println("Статический код");
        staticCount = Math.max(10, 0);
    }

    // статическая функция
    public static void main(String[] args) {
        System.out.println("просто код");
    }
}
