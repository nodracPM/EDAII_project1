package Sort; 

public class SortAlgorithms{
    public static void bubbleSort(int[] a, int size) {
        int i, j, n; 
        boolean band = false; 
	    n = size; 
	    for(i = n - 1; i > 0 && band == false; i--) {
		    band = true; 
            for(j = 0; j < i; j++) {
                if(a[j]>a[j+1]) {
                    Utilerias.swap(a, j, j+1); 
                    band = false; 
                }
		    }
	    }
    }
    public static void 

}