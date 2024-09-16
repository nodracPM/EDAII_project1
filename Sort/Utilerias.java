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
    public static void printIndividualResults(int [][] resulst) {
        int[] sizes = {50, 100, 500, 800, 1000, 2000, 5000, 10000};

        for(int i = 0; i < 8; i++) {
            System.out.println("\tTamaño de arreglo: " + sizes[i]);
        }
        for(int j = 0; j < 5; j++) {
            System.out.println("\t\tEjecución " + j + ": " + resulst[0][j] + "operaciones");
        }
    }

    public static void printGeneralRestuls(int [][][] resulst) {
        String[] algoritmos = {"Bubble sort", "Insertion sort", "Selection sort", "Heap sort", "Quick sort", "Merge sort", "Pancake sort"};
        
        for(int i = 0; i < 7; i++) {
            System.out.println(algoritmos[i] + ":");
            printIndividualResults(resulst[i]);
        }
    }
}