package InbuiltAnnotations;

// Superclass
class Parent {
    void showMessage() {
        System.out.println("Message from Parent class");
    }
}

// Subclass
class Child extends Parent {
    @Override
    void showMessage() {  // Correctly overriding the method, in case of a mistake, the compiler will show an error due to the @Override annotation
        System.out.println("Message from Child class");
    }
    
}

// Main class
public class OverrideExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.showMessage();  // Calls the overridden method in Child class
    }
}


