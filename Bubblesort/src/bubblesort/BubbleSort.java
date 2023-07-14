package bubblesort;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int i=0;
       while(i<n-1) {
          int j=0;
            while(j<n-i-1){
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                j=j+1;
            }
            i=i+1;
        }
    }
    public static void main(String[] args) {
        int length;
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the length:");
        length=in.nextInt();
        in.nextLine();
        String[] array=new String[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter number"+(i+1)+":");
            array[i]=in.nextLine();
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
