/*
 * Autor: Campos Cortés Isaac Jareth
 * Ultima modificación: 12-Sep-2024
 * Propósito: Método para la ejecución de Selection Sort
 */

package Sort;

public class SelectionSort {
    public static int selectionSort(int[] a, int n){
        int indiceMenor;
        int cont = 0;

        for (int i = 0; i<n-1;i++){
            indiceMenor = i;
            for(int j = i+1; j<n; j++){
                cont++; //comparison
                if(a[j]<a[indiceMenor]){
                    indiceMenor = j;
                }
            }
            cont++; //comparison
            if(i!=indiceMenor){
                Utilerias.swap(a,i, indiceMenor);
                cont++; //swap
            }
        }
        return cont;

    }
}
