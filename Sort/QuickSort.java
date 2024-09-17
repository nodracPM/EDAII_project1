/*
 * Autor: Campos Cortés Isaac Jareth
 * Ultima modificación: 12-Sep-2024
 * Propósito: Método para la ejecución de Quick Sort
 */

package Sort;

public class QuickSort {
    public static int quickSort(int a[], int low, int high){
        int cont = 0;
        cont++; //comparison
        if (low < high){
            int[] ret = Utilerias.partition(a, low, high);
            int pi = ret[0];
            cont += ret[1];
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }   
        return cont;
    }
}
