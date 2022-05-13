
public class odd {

    public static void main(String[]args){

        for(int num=1;num<=10;num++){

            int num2=num%2;

            switch(num2){

                case 0:
                    System.out.println("Even "+num);
                    break;
                case 1:
                    System.out.println("Odd "+num);
                    break;
            }
        }
    }
}
