package Sort; 

import java.util.ArrayList;

public class Utilerias{
    public static void swap(int[] a, int x, int y) {
        int aux = a[x]; 
        a[x] = a[y]; 
        a[y] = aux; 
    }
    public static void printArray(int[] a, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int[] toArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()]; 

        for(int i = 0; i < arrayList.size(); i++) array[i] = arrayList.get(i); 
        
        return array; 
    }
}