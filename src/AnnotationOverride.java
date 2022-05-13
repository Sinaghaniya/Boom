
class Parent{

    void eat(){

        System.out.println("Starts eating");
    }
}

class Child extends Parent{

    @Override
    void eat(){

        System.out.println("Eating noodles");
    }
}

public class AnnotationOverride {

    public static void main(String[]args){

        Parent p = new Child();

        p.eat();

    }
}
