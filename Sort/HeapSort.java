package Sort;


public class HeapSort {
    public static int heapSort(int[] a, int size) {
        int cont = 0; 
        
        cont += buildHeap(a,size); 
  	    
        int i, heapSize = size - 1;
  	    for(i = size - 1; i > 0; i--){ 
    	    Utilerias.swap(a, 0, i); //swap
            cont++; 
      	    heapSize--; 
		    cont += heapify(a, 0, heapSize + 1); 
        }
        return cont; 
    }

    public static int buildHeap(int[] a, int size) {
        int cont = 0; 
  	    for(int i = (size - 2) / 2; i >= 0; i--) cont += heapify(a, i, size);
        return cont; 
    }
    public static int heapify(int[] a, int i, int size) {
        int cont = 0; 

        int l = 2 * i + 1;
	    int r = 2 * i + 2;
	    int largest;

	    if(l <= (size - 1) && a[l] > a[i]) largest = l; //comparison 
  	    else largest = i;
  	    if(r <= (size - 1) && a[r] > a[largest]) largest = r; //comparison
  	    if(largest != i){  //comparison
    	    Utilerias.swap(a, i, largest); //swap 
            cont++; 
    	    cont += heapify(a, largest, size);
        }
        cont+=3; //number of comparisons

        return cont; 
    }
}
