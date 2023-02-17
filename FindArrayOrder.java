/*The following program is used to convert the given array into reduced form.
 * 									Submitted by-
 * 										Ayush Pathak*/
import java.util.*;
public class FindArrayOrder {
   static int firstIndex, secondIndex;
   //Method to sort an array in ascending order using bubble sort technique.
   public static int[] sortingOfArray(int originalArray[], int lengthOfArray) {
      int swappingVariable, duplicateArray[] = originalArray.clone(); //clone method is used to copy elements of an array into another.
      for (firstIndex = 0; firstIndex < lengthOfArray; firstIndex++) {
         for (secondIndex = 0; secondIndex < lengthOfArray - firstIndex - 1; secondIndex++) {
            if (duplicateArray[secondIndex] > duplicateArray[secondIndex + 1]) {
               swappingVariable = duplicateArray[secondIndex];
               duplicateArray[secondIndex] = duplicateArray[secondIndex + 1];
               duplicateArray[secondIndex + 1] = swappingVariable;
            }
         }
      }
      return duplicateArray;
   }
   //This method is used to find the order of elements in an array by comparing the original array with the sorted array.
   public static int[] findingOrderInArray(int originalArray[], int sortedArray[], int lengthOfArray) {
      for (firstIndex = 0; firstIndex < lengthOfArray; firstIndex++) {
         for (secondIndex = 0; secondIndex < lengthOfArray; secondIndex++) {
            if (originalArray[firstIndex] == sortedArray[secondIndex]) {
               originalArray[firstIndex] = secondIndex;
               break;
            }
         }
      }
      return originalArray;
   }
   public static void main(String[] args) {

      Scanner objectOfScannerClass = new Scanner(System.in);

      System.out.println("Enter the length of array");

      int lengthOfArray = objectOfScannerClass.nextInt();

      int originalArray[] = new int[lengthOfArray];

      for (firstIndex = 0; firstIndex < lengthOfArray; firstIndex++) {
         originalArray[firstIndex] = objectOfScannerClass.nextInt();
      }
      int sortedArray[] = sortingOfArray(originalArray, lengthOfArray);//Calling bubble sort method.

      int ReducedArray[] = findingOrderInArray(originalArray, sortedArray, lengthOfArray);//Calling the finding order of elements method.

      for (firstIndex = 0; firstIndex < lengthOfArray; firstIndex++) {
         System.out.print(ReducedArray[firstIndex] + " ");
      }
      System.out.println();
      objectOfScannerClass.close();
   }
}
