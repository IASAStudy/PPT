package ch7;

public class Exercise7_27 {
    public static void main(String[] args) {
        // Here
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.method1();
    }
}

class Outer {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    }
}
