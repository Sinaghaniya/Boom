import java.util.Scanner;

public class Cab {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0;i<n;i++){

            int a,b;

            a=sc.nextInt();

            b = sc.nextInt();

            if(a<b){
                System.out.println("First");
            }else if(b<a){
                System.out.println("Second");
            }else if(a==b){
                System.out.println("Any");
            }
        }
    }
}
