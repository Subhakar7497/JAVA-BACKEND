class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class babydog extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {

        babydog d = new babydog();
        d.weep();
        d.bark();
        d.eat();
    }

}
