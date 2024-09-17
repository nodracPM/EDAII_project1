/*
 * Autores: Cardón Carillo Pedro Manuel, Campos Cortés Isaac Jareth
 * Ultima modificación: 15-Sep-2024
 * Propósito: Declaración de los métodos para realizar todas las operaciones auxiliares necesarias
 * (Intercambios, impresiones, contrucción de heaps, promedios, etc.)
 */

package Sort;

import java.util.ArrayList;

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
        Utilerias.swap(arr,i+1,high);//swap
        cont++;
        ret[0] = i+1;
        ret[1] = cont;
        return ret;
    }

    public static int flip(int a[], int i){
        int inicio = 0;
        int  cont = 0;

        while(inicio < i){
            cont++;//swap
            Utilerias.swap(a,inicio,i);
            inicio++;
            i--;
        }
        return cont;
    }

    public static int[] toArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()]; 

        for(int i = 0; i < arrayList.size(); i++) array[i] = arrayList.get(i); 

        return array; 
    }
    public static void printIndividualResults(int [][] resulst) {
        int[] sizes = {50, 100, 500, 800, 1000, 2000, 5000, 10000};

        for(int i = 0; i < 8; i++) {
            System.out.println("\tTamaño de arreglo: " + sizes[i]);
            for(int j = 0; j < 5; j++) {
                System.out.println("\t\tEjecución " + (j+1) + ": " + resulst[i][j] + " operaciones");
            }
        }
    }

    public static void printGeneralRestuls(int [][][] resulst) {
        String[] algoritmos = {"Bubble sort", "Insertion sort", "Selection sort", "Heap sort", "Quick sort", "Merge sort", "Pancake sort"};
        
        for(int i = 0; i < 7; i++) {
            System.out.println(algoritmos[i] + ":");
            printIndividualResults(resulst[i]);
        }
    }

    public static void promedios(int[][][] resultados, double[][] promedios) {
        for(int i = 0; i < 7; i++) { //algoritmo 
            for(int j = 0; j < 8; j++) {//tamaño
                double aux = 0; 
                for(int k = 0; k < 5; k++) aux += resultados[i][j][k]; //#ejecución
                promedios[i][j] = aux/5; 
            }
        }
    }

    public static void printPromedios(double[][] promedios) {
        int[] sizes = {50, 100, 500, 800, 1000, 2000, 5000, 10000};
        String[] algoritmos = {"Bubble sort", "Insertion sort", "Selection sort", "Heap sort", "Quick sort", "Merge sort", "Pancake sort"};

        System.out.println("Promedios\n");

        for(int i = 0; i < 7; i++) {
            System.out.println(algoritmos[i] + ":");
            for(int j = 0; j < 8; j++) {
                System.out.println("\tTamaño " + sizes[j] + ": " + promedios[i][j]);
            }
        }
    }
}