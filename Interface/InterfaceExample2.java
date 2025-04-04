interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

class InterfaceExample2 implements Showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        InterfaceExample2 obj = new InterfaceExample2();
        obj.print();
        obj.show();
    }
}