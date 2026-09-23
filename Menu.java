import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        boolean isFinished = false;         
        Scanner input = new Scanner(System.in);
        System.out.print("Give the array size: ");
        int size = input.nextInt();
        int [] arr = ArrayApp.createRandomArray(size);
        
        while(!isFinished){
            System.out.println("\nWelcome to the Array App");
            System.out.println("""
                1-Find the array's minimum and maximum
                2-Find the difference of the array's elements from average of the array
                3-Find the sum of elements with odd- and even-numbered indexes
                4-Exit from app
            """);
            
            int option = 0; // by default, invalid choice number.
            boolean isValidChoice = false; 
            while(!isValidChoice){
                System.out.print("Select your choice: ");
                if(input.hasNextInt()){
                    int value = input.nextInt();
                    if(value > 0 && value < 5){
                        option = value;
                        isValidChoice = true;
                    } else {
                        System.out.println("Invalid choice");
                    }
                } else {
                    System.out.println("Choose a valid number");
                }
                input.nextLine();
            }

            if (option == 1){
                System.out.println("Maximum of Array: " + ArrayApp.findMax(arr));
                System.out.println("Minimum of Array: " + ArrayApp.findMin(arr));
            } else if (option == 2){
                System.out.println("Differs from average of Array: " + Arrays.toString(ArrayApp.differenceFromAverage(arr)));
            } else if (option == 3){
                System.out.println("Sum of elements with odd-numbered indexes: " + ArrayApp.findSumOfOddNumberedIndexes(arr));
                System.out.println("Sum of elements with even-numbered indexes: " + ArrayApp.findSumOfEvendNumberedIndexes(arr));
            } else if (option == 4){
                System.out.print("Exiting");
                isFinished = true;
            }


        }
    }
}