package ExampleAnnotationClass;

import ExampleAnnotationClass.service.scold;

public class AnnotationClass {

    public static void main(String[] args) {
        scold obj = new scold();

        if (obj.getClass().isAnnotationPresent(goodWords.class)) {
            obj.saySomething();
         } else { System.out.println("This is not a good word.");
    
        }
    }

}



    

