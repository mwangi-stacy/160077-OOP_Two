package ArrayChallenge;

public class ArrayChallenge {
        public static void main(String[] args) {
            //Declaration of the array
            String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179", "A545","A234", "G888", "g447"};

            for (String item : orderIds) {
                //Condition for items starting with a certain letter
                if (item.startsWith("A")) {
                    System.out.println(item);
                }
            }
            System.out.print("\n");

            for (String item: orderIds){
                if(item.startsWith("B")){
                    System.out.println(item);
                }
            }
            System.out.print("\n");

            for (String item: orderIds){
                if(item.startsWith("C")){
                    System.out.println(item);
                }
            }
            System.out.print("\n");
            for (String item: orderIds){
                if(item.startsWith("G")){
                    System.out.println(item);
                }
            }

        }
    }
