abstract class A {
    A() {
        System.out.println("call me from B");
    }
}

class B extends A {
    public static void main(String[] args) {
        B obj = new B();
    }
}
