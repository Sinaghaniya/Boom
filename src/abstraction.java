
interface tools{

    void starts();
    void run();
    void stops();
    void running();
}

abstract class Engine implements tools{

    abstract void keyTwist();

    public void starts(){
        System.out.println("Engine Starts");
    }
}

class Maruti extends Engine{

    void keyTwist(){
        System.out.println("Starts Twisting the key");
    }

    public void run(){

        System.out.println("Starts Running");
    }

    public void running(){

        System.out.println("keeps running");
    }

    public void stops(){

        System.out.println("Car Stops due to Storm");
    }
}


public class abstraction {

    public static void main(String[]args){

        Engine obj = new Maruti();

        obj.keyTwist();
        obj.starts();
        obj.run();
        obj.running();
        obj.stops();

    }
}