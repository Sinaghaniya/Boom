
@SuppressWarnings("uncheck")
class Animal{

    void eat(){
        System.out.println("Eating food");
    }
}

class childish extends Animal{

    @Deprecated
    void eat(){
        System.out.println("Eating Kurkura");
    }
}

public class AnnotationDepreciated {

    public static void main(String[]args){

       childish d = new childish();

       d.eat();

    }
}
