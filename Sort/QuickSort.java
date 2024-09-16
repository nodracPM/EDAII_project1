package Sort;

public class QuickSort {
    public static int quickSort(int a[], int low, int high){
        int cont = 0;
        cont++; //comparison
        if (low < high){
            int[] ret = partition(a, low, high);
            int pi = ret[0];
            cont += ret[1];
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }   
        return cont;
    }
    public static int[] partition(int arr[], int low, int high){
        int[] ret = new int[2];
        int pivot = arr[high];
        int i = (low-1);
        int cont = 0;
        for (int j=low; j<high; j++){
            cont++; //comparison
            if (arr[j] <= pivot){
                i++;
                Utilerias.swap(arr, i,j);
                cont++; //swap
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        ret[0] = i+1;
        ret[1] = cont;
        return ret;
    }
}
