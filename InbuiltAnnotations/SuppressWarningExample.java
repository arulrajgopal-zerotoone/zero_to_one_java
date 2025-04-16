package InbuiltAnnotations;

public class SuppressWarningExample {
    
    @SuppressWarnings("unused") // Suppressing warning for an unused variable
    public static void main(String[] args) {
        int number = 10; // This variable is never used, which normally triggers a warning
    }
}
