
//Hierarchical inheritance

class Animal1{

    void eats(){
        System.out.println("Starts Eating");
    }
}

class Cat extends Animal1{

    void eats1(){
        System.out.println("Starts Eating Catfood");
    }
}

class Dog extends Animal{

    void eats2(){
        System.out.println("Starts Eating DogFood");
    }
}

class Elephant extends Animal{

    void eats3(){

        System.out.println("Starts Eating Food");
    }
}

public class Inheritance {

    public static void main(String[]args){

        Cat cat = new Cat();

        cat.eats();

        cat.eats1();

        Dog dog = new Dog();

        dog.eats2();

        Elephant elephant = new Elephant();

        elephant.eats3();
    }
}
