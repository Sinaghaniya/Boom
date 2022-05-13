public class Encapsulation{

    private long Acc_No;
    private String Name;
    private String Email;
    private String City;
    private long AccBAl;

    void setAcc_no(long Acc_No){

        this.Acc_No = Acc_No;
    }

    void setName(String Name){

        this.Name = Name;
    }

    void setEmail(String Email){

        this.Email = Email;
    }

    void setCity(String City){

        this.City = City;
    }

    void setAccBal(long AccBal){

        this.AccBAl = AccBal;
    }

    long getAcc_No(){

        return Acc_No;
    }

    String getName(){

        return Name;
    }

    String getEmail(){

        return Email;
    }

    String getCity(){

        return City;
    }

    double getAccBAl(){

        return AccBAl;
    }


    public static void main(String[]args){

        Encapsulation obj = new Encapsulation();

        obj.setAcc_no(3421567890176l);
        obj.setName("Akash Singh");
        obj.setEmail("Akash@100gmail.com");
        obj.setCity("Delhi");
        obj.setAccBal(1999);

        System.out.println(obj.getAcc_No()+"\n"+obj.getName()+"\n"+obj.getEmail()+"\n"+obj.getCity()+"\n"+obj.getAccBAl());

    }
}