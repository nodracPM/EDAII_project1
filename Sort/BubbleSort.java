package Sort;

public class BubbleSort {
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
}
