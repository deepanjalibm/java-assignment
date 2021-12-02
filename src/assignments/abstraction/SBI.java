package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class SBI extends Bank{
   private List<Integer> denomination = new ArrayList<>();
    public  SBI() {
        denomination.add(100);
        denomination.add(1000);
        denomination.add(500);
    }
     @Override
     List<Integer> getDenominationAvailable() {
         return denomination;




         }
    }
