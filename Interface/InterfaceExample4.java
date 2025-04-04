// A simple program to Test Interface default
// methods in java
interface TestInterface {
    // abstract method
    public void square(int a);

    // default method
    default void show() {
        System.out.println("Default Method Executed");
    }
}

class InterfaceExample4 implements TestInterface {
    // implementation of square abstract method
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        InterfaceExample4 d = new InterfaceExample4();
        d.square(4);

        // default method executed
        d.show();
    }
}
