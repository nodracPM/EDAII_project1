package Sort;

public class InsertionSort {
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
}
