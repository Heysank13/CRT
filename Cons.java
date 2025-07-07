class Add {
    Add(int a, int b) {
        System.out.println(a + b);
    }
}

class Sub extends Add {

    public Sub(int a, int b) {
        super(a, b);
        System.out.println(b - a);
    }
}

public class Cons {

    public static void main(String args[]) {

        Sub sub = new Sub(10, 20);

    }
}
