public class EnumWithoutValues {

    enum Days{

        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

//        private int value;
//
//        Days(int value){
//
//            this.value = value;
//        }

    }

    public static void main(String[]args){

        for(Days d:Days.values()){

            System.out.println(d);
        }

    }
}
