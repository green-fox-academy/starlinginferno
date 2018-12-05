public class matRev {

    static int b = 2;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Bye, World!");
        int a = 1;
        a = a + 1;
        helloAndBye();
        helloAndBye();
        String name = "Seadog";
        print("hello!");
        print(name);
        add(3,4);
        System.out.println((return5() /2));
    }

    public static int return5() {
        b = b+ 2;
        return 5;
    }

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void helloAndBye() {
        System.out.println("Hello, World!");
        System.out.println("Bye, World!");

    }

    public static void print(String text) {
        int a = 0;
        System.out.println(text);


    }
}
