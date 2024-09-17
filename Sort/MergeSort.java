/*
 * Autor: Cardón Carillo Pedro Manuel
 * Ultima modificación: 15-Sep-2024
 * Propósito: Método principal (Declaraciones, llamadas a algoritmos, impresión de resultados)
 */

package Sort; 
//import java.util.Random;

public class MergeSort {
    //static Random aleatorio = new Random(System.currentTimeMillis());
    /*public static void main(String[] args) {
        int[] a;
        a = new int[20];   

        for(int i = 0; i < 20; i++) a[i] = aleatorio.nextInt(100) + 1;
        


        mergeSort(a, 0, 19);
        printArray(a);
    }*/

    public static int merge(int arr[], int left, int mid, int right) {
        int cont = 0; 

        int n1 = mid - left + 1;
        int n2 = right - mid;

        //se crean dos sublistas
        int L[] = new int[n1]; 
        int R[] = new int[n2];


        //se copian los valores de la lista original a la sublista 1
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        //se copina los valores de la lista original a la sublista 2
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
            
        int i = 0, j = 0;

        //se hace la combinación y se insertan los elementos en la lista original
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { //comparación
                arr[k] = L[i]; //inserción
                i++;
            } else {
                arr[k] = R[j]; //inserción
                j++;
            }
            k++;
            cont += 2; 
        }
        //si ya se insertaron todos los elementos de la sublista derecha se insertan el resto de la lista izquierda
        while (i < n1) {
            arr[k] = L[i]; //inserción
            i++;
            k++;
            cont++;
        }
        //si ya se insertaron todos los elementos de la sublista izquierdo se inserta el resto de la lista derecha
        while (j < n2) {
            arr[k] = R[j]; //inserción
            j++;
            k++;
            cont++; 
        }
        return cont; 
        //System.out.println("Iteración ");
        //for(int p = left; p < right; p++) System.out.print(arr[p]+", "); 
    }

    public static int mergeSort(int arr[], int left, int right) {
        int cont = 0; 

        if (left < right) { //comparación
            cont ++; 
            int mid = (left + right) / 2;

            cont += mergeSort(arr, left, mid);
            cont += mergeSort(arr, mid + 1, right);

            cont += merge(arr, left, mid, right);
        }

        return cont; 
    }
}