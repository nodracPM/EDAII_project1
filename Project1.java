import Sort.SortAlgorithms; 
import Sort.Utilerias; 

public class Project1 {
    public static void main(String[] args) {
        int size = 13, cont1, cont2, cont3; 

        int[] a = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; //size = 13
        int[] b = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};
        int[] c = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; 

        //verificación
        cont1 = SortAlgorithms.bubbleSort(a, size); 
        Utilerias.printArray(a, size);
        System.out.println(cont1);
        System.out.println();

        cont2 = SortAlgorithms.insertionSort(b, size); 
        Utilerias.printArray(b, size);
        System.out.println(cont2);
        System.out.println();

        cont3 = SortAlgorithms.heapSort(c, size); 
        Utilerias.printArray(c, size);
        System.out.println(cont3);
        System.out.println();
    }
}   