import com.sun.security.jgss.GSSUtil;

public class sumarr {
    public static void main(String[] args) {
        int [] array = {2,4,6,8,9,3,4,7,8,10};

        int sum=0;

        //int i=0;

        for(int i=0; i<array.length; i++)
        {

                sum=sum + array[i];

            System.out.println(array[i]);
        }
        System.out.println("Sum is " + sum);

        }


    }

