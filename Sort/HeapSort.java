package Sort;

public class HeapSort {
    public static int heapSort(int[] a, int size) {
        int cont = 0; 
        
        cont += Utilerias.buildHeap(a,size); 
  	    
        int i, heapSize = size - 1;
  	    for(i = size - 1; i > 0; i--){ 
    	    Utilerias.swap(a, 0, i); //swap
            cont++; 
      	    heapSize--; 
		    cont += Utilerias.heapify(a, 0, heapSize + 1); 
        }
        return cont; 
    }
}
