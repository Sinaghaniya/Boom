public class Enumx {

    enum Season{

        Winter(10),Spring(99),Summer(21),Fall(90);

        private int value;

        Season(int value){

            this.value=value;
        }

    }

    public static void main(String[]args){


        for(Season s:Season.values()){

            System.out.println(s+" "+s.value);
        }


    }
}
