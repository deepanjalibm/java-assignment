package assignments.abstraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankDenominations {



    public static void main(String[] args) {

        Bank denomination, hdfcdenomination, icicidenomination;
        denomination = new SBI();

      System.out.println("SBI Bank Available Denominations"+"  "+(denomination.getDenominationAvailable().toString()));


        hdfcdenomination= new HDFC();

        System.out.println("HDFC Bank Available Denominations"+"  "+Arrays.asList(hdfcdenomination.getDenominationAvailable()));

        icicidenomination=new ICICI();

       System.out.println("ICICI Bank Available Denominations"+"  "+Arrays.asList(icicidenomination.getDenominationAvailable()));


    }
    
}


