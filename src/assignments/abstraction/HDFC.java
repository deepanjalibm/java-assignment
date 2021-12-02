package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class HDFC extends Bank{
    List<Integer> denomination = new ArrayList<>();
    public HDFC () {
        denomination.add(200);
        denomination.add(2000);
        denomination.add(500);
    }

    @Override
    List<Integer> getDenominationAvailable() {
        return denomination;
}
}