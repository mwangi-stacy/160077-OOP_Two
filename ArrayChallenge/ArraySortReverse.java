package ArrayChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ArraySortReverse {
    public static void main(String[] args){
        //Initial array of pallet IDs
        String[] pallets={"B54", "A42","B65", "A76"};

        //Sorting process
        System.out.println("Sortedd....");
        Arrays.sort(pallets);

        for (String pallet:pallets){
            System.out.println("--"+ pallet);
        }

        //Reversal
        System.out.println("\n Reversed......");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);

        for (String pallet: palletList){
            System.out.println("--"+ pallet);
        }
    }
}
