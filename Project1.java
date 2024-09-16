package Sort;


public class Project1 {
    public static void main(String[] args) {
        int size = 13, cont1, cont2, cont3 ,cont4 ,cont5, cont6; 

        int[] a = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; //size = 13
        int[] b = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};
        int[] c = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};
        int[] d = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};  
        int[] e = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; 
        int[] f = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; 

        //verificación
        cont1 = BubbleSort.bubbleSort(a, size); 
        Utilerias.printArray(a, size);
        System.out.println(cont1);
        System.out.println();

        cont2 = InsertionSort.insertionSort(b, size); 
        Utilerias.printArray(b, size);
        System.out.println(cont2);
        System.out.println();

        cont3 = HeapSort.heapSort(c, size); 
        Utilerias.printArray(c, size);
        System.out.println(cont3);
        System.out.println();

        cont4 = SelectionSort.selectionSort(d, size);
        Utilerias.printArray(d, size);
        System.out.println(cont4);
        System.out.println();

        cont5 = QuickSort.quickSort(e, 0, size-1);
        Utilerias.printArray(e, size);
        System.out.println(cont5);
        System.out.println();

        cont6 = PancakeSort.pancakeSort(f,size);
        Utilerias.printArray(f, size);
        System.out.println(cont6);
        System.out.println();

    }
}   