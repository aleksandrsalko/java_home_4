import java.util.Arrays;
import java.util.Scanner;

public class task{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] myArray = new int[size];
        
        for(int i=0; i<size; i++){
            myArray[i] = scanner.nextInt();
        }
        
        myArray = quickSort(0, myArray.length-1,myArray);
        System.out.println(Arrays.toString(myArray));
    }
  
      
    public static int[] quickSort(int start, int end, int[] myArray){
  
        if(start < end){
            int partition = partitionPoint(start,end,myArray); 
            quickSort(start, partition-1, myArray); 
            quickSort(partition+1, end,myArray);  
        }
        return myArray;
    }
  
    public static int partitionPoint(int start, int end, int[] myArray){
          
        int pivot = myArray[end]; 
        int swapPosition = start;
        for(int i=start; i<= end - 1; i++){
              
            if(myArray[i] <= pivot){
                swapElements(swapPosition, i, myArray);
                swapPosition ++;
            }
        }
          
        swapElements(swapPosition,end,myArray); 
        return swapPosition;
    }
  
      
    public static void swapElements(int position1, int position2, int[] myArray){
        int temp = myArray[position1];
        myArray[position1] = myArray[position2];
        myArray[position2] = temp;
    }
}   
