package Sort; 

public class SortAlgorithms{
    public static int bubbleSort(int[] a, int size) {
        int i, j, cont = 0; 
        boolean band = false; 
	    for(i = size - 1; i > 0 && band == false; i--, cont++) { //comparison
		    band = true; 
            for(j = 0; j < i; j++) {
                cont++; 
                if(a[j]>a[j+1]) { //comparison
                    Utilerias.swap(a, j, j+1); //swap  
                    band = false;   
                    cont++;              
                }
		    }
	    }
        return cont; 
    }
    public static int insertionSort(int[] a, int size) {
        int i,j, cont = 0;
        int aux;
    
        for(i=1; i<size; i++){
            j=i;
            aux=a[i];
            while (j>0 && aux < a[j-1]){ //comparison
                a[j] = a[j-1]; //swap 
                cont += 2; //swap and comparison 
                j--;
            }
            a[j] = aux; //insertion
            cont += 2; //last comparison and insertion
        }

        return cont; 
    }

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