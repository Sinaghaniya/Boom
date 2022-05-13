
class Bank{

    float interest(){

        return 0f;
    }
}

class Sbi extends Bank{

    float interest(){

        return 2.344f;
    }
}

class icici extends Bank{

    float interest(){

        return 4.55f;
    }
}

class HDFC extends Bank{

    float interest(){

        return 6.77f;
    }
}

public class polymorphism {

    public static void main(String[]args){

      Bank b,b1,b2;

      b = new Sbi();

      b1 = new icici();

      b2 = new HDFC();

        System.out.println(b.interest()+"\n"+b1.interest()+"\n"+b2.interest());

    }
}
