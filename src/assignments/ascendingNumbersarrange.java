package assignments;

public class ascendingNumbersarrange {

        public static void main(String[] args) {

            //Initialize array
           int [] array= new int [] {5, 2, 8, 7, 1};
           int temp = 0;

            //Displaying elements of original array
            System.out.println("Elements of original array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            //Sort the array in ascending order
            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if(array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.println();

            //Displaying elements of array after sorting
            System.out.println("Elements of array sorted in ascending order: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }


