package ExampleAnnotationMethod;
import java.lang.reflect.Method;

public class AnnotationMethod {
    public static class saySomething {
        @goodWords
        public void appreciate() { System.out.println("You are doing amazing job!!!"); }
        public void scold() { System.out.println("you are a dump!!!"); }
    }

    public static void main(String[] args) {
        saySomething obj = new saySomething();
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(goodWords.class)){
                try {
                    method.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("This is not a good word!!!");
            }
    }
}
}





    

