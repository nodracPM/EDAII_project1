import Sort.SortAlgorithms; 
import Sort.Utilerias; 

public class Project1 {
    public static void main(String[] args) {
        int size = 13, cont1, cont2, cont3 ,cont4 ,cont5; 

        int[] a = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; //size = 13
        int[] b = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};
        int[] c = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};
        int[] d = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};  
        int[] e = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; 

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

        cont4 = SortAlgorithms.selectionSort(d, size);
        Utilerias.printArray(d, size);
        System.out.println(cont4);
        System.out.println();

        cont5 = SortAlgorithms.quickSort(d, 0, size-1);
        Utilerias.printArray(d, size);
        System.out.println(cont5);
        System.out.println();

    }
}   