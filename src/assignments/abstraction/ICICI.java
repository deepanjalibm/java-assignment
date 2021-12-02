package assignments.abstraction;

import java.util.ArrayList;
import java.util.List;

public class ICICI extends Bank {
    List<Integer> denomination = new ArrayList<>();

    public ICICI() {
        denomination.add(50);
        denomination.add(100);
        denomination.add(200);
    }

    @Override
    List<Integer> getDenominationAvailable() {
        return denomination;
    }
}