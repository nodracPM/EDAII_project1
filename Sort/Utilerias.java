package Sort; 

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
    	    swap(a, i, largest); //swap 
            cont++; 
    	    cont += heapify(a, largest, size);
        }
        cont+=3; //number of comparisons

        return cont; 
    }
}