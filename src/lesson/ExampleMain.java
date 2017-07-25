package lesson;

public class ExampleMain {
    public static void main(String[] args) {
        ExampleStatic example1 = new ExampleStatic();
        ExampleStatic example2 = new ExampleStatic();
        ExampleStatic example3 = new ExampleStatic();

        example1.staticCount = 1;
        example2.staticCount = 2;
        example3.staticCount = 3;
        System.out.println(example1.staticCount);
        System.out.println(example2.staticCount);
        System.out.println(example3.staticCount);

        example1.count = 1;
        example2.count = 2;
        example3.count = 3;
        System.out.println(example1.count);
        System.out.println(example2.count);
        System.out.println(example3.count);


        ExampleStatic.staticCount = 10;
        ExampleStatic.main(args);
    }
}
