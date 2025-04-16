package ExampleAnnotationField;

import java.lang.reflect.Field;

public class AnnotationField {
    private static class saySomething {
        @goodWords(times = 3)
        private int myField;
        public void greet() { System.out.println("You are doing amazing job!!!"); }
    }

    public static void main(String[] args) {

        try {
            saySomething obj = new saySomething();
            Field field = saySomething.class.getDeclaredField("myField");
  

            if (field.isAnnotationPresent(goodWords.class)) {
                goodWords annotation = field.getAnnotation(goodWords.class);

                for (int i = 0; i < annotation.times(); i++) {obj.greet(); }
            } else 
            { System.out.println("Annotation not present on field: " + field.getName()); }


        } catch (NoSuchFieldException e) {
            System.out.println("Field not found: " + e.getMessage());
        }
    }
}