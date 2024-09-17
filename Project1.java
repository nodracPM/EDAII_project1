/*
 * Autores: Cardón Carillo Pedro Manuel, Campos Cortés Isaac Jareth
 * Ultima modificación: 15-Sep-2024
 * Propósito: Método principal (Declaraciones, llamadas a algoritmos, impresión de resultados)
 */



import Sort.BubbleSort;
import Sort.HeapSort;
import Sort.InsertionSort; 
import Sort.MergeSort;
import Sort.PancakeSort;
import Sort.QuickSort; 
import Sort.SelectionSort;
import Sort.Utilerias;
import java.util.ArrayList;
import java.util.Random;


public class Project1 {
    public static void main(String[] args) {
        Random random = new Random(); 

    //Generación de números aleatorios
        int[] sizes = {50, 100, 500, 800, 1000, 2000, 5000, 10000};
        ArrayList<ArrayList<ArrayList<Integer>>> arrays_sizes = new ArrayList<>();
        //ArrayList<Integer> arrays = new ArrayList<>(); 

        //creación de la estructura para guardar todos los arreglos

        /*Si se trata de incializar el tamaño de cada sub-arreglo (por ejemplo el que contiene a los tamaños) creando uno con las dimensiones
         requeridas y asignandola n veces al arreglo inmediato superior, al tratarse de un objeto se asigna el mismo 
         a cada elemento y cuando se modifique alguno se modifica el mismo, es decir, todos guardan el mismo arreglo y cualquier modificación
         desde índices distintos afecta al mismo
        */
        for(int i = 0; i < 8; i++) {
            ArrayList<ArrayList<Integer>> tamaño = new ArrayList<>(); //dimensión para los 8 tamaños
            for(int j = 0; j < 5; j++) {
                ArrayList<Integer> ejecuciones = new ArrayList<>(); //dimensión para las 5 ejecuciones
                for(int k = 0; k < sizes[i]; k++) {
                    ejecuciones.add(random.nextInt(101)); 
                }
                tamaño.add(ejecuciones); 
            }
            arrays_sizes.add(tamaño); 
        }
 

        //System.out.println(arrays_sizes.size()); //Prueba para detectar errores
        //System.out.println(ejecuciones.size()); //Prueba para detectar errores

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 5; j++) { // Se llenan cada una de las 5 ejecuciones
                for(int k = 0; k < sizes[i]; k++) { 
                    arrays_sizes.get(i).get(j).add(random.nextInt(101)); //con el número correspondiente de valores
                }
            }
        }


        //arreglo de tres dimensiones para guardar los resultados
        int[][][] results = new int[7][8][5]; //[algoritmo][tamaño del arreglo][#ejecución]

        //0. BubbleSort 
        for(int i = 0; i < 8; i++) { //tamaño
            for(int j = 0; j < 5; j++) { //ejecución
                int []aux = Utilerias.toArray(arrays_sizes.get(i).get(j)); //convierte el ArrayList a array (no objeto)
                results[0][i][j] = BubbleSort.bubbleSort(aux, sizes[i]); //[algoritmo][tamaño del arreglo][#ejecución]
            }
        }
        //1. InsertionSort
        for(int i = 0; i < 8; i++) { //tamaño
            for(int j = 0; j < 5; j++) { //ejecución
                int []aux = Utilerias.toArray(arrays_sizes.get(i).get(j)); //convierte el ArrayList a array (no objeto)
                results[1][i][j] = InsertionSort.insertionSort(aux, sizes[i]); //[algoritmo][tamaño del arreglo][#ejecución]
            }
        }
        //2. SelectionSort
        for(int i = 0; i < 8; i++) { //tamaño
            for(int j = 0; j < 5; j++) { //ejecución
                int []aux = Utilerias.toArray(arrays_sizes.get(i).get(j)); //convierte el ArrayList a array (no objeto)
                results[2][i][j] = SelectionSort.selectionSort(aux, sizes[i]); //[algoritmo][tamaño del arreglo][#ejecución]
            }
        }
        //3. HeapSort
        for(int i = 0; i < 8; i++) { //tamaño
            for(int j = 0; j < 5; j++) { //ejecución
                int []aux = Utilerias.toArray(arrays_sizes.get(i).get(j)); //convierte el ArrayList a array (no objeto)
                results[3][i][j] = HeapSort.heapSort(aux, sizes[i]); //[algoritmo][tamaño del arreglo][#ejecución]
            }
        }
        //4. QuickSort
        for(int i = 0; i < 8; i++) { //tamaño
            for(int j = 0; j < 5; j++) { //ejecución
                int []aux = Utilerias.toArray(arrays_sizes.get(i).get(j)); //convierte el ArrayList a array (no objeto)
                results[4][i][j] = QuickSort.quickSort(aux, 0, sizes[i] - 1); //[algoritmo][tamaño del arreglo][#ejecución]
            }
        }
        //5. MergeSort
        for(int i = 0; i < 8; i++) { //tamaño
            for(int j = 0; j < 5; j++) { //ejecución
                int []aux = Utilerias.toArray(arrays_sizes.get(i).get(j)); //convierte el ArrayList a array (no objeto)
                results[5][i][j] = MergeSort.mergeSort(aux, 0, sizes[i] - 1); //[algoritmo][tamaño del arreglo][#ejecución]
            }
        }
        //6. PancakeSort
        for(int i = 0; i < 8; i++) { //tamaño
            for(int j = 0; j < 5; j++) { //ejecución
                int []aux = Utilerias.toArray(arrays_sizes.get(i).get(j)); //convierte el ArrayList a array (no objeto)
                results[6][i][j] = PancakeSort.pancakeSort(aux, sizes[i]); //[algoritmo][tamaño del arreglo][#ejecución]
            }
        }

    //Impresión de resultados

        System.out.println("Tabla de resultados bubble sort");
        Utilerias.printGeneralRestuls(results);


    //Obtención de promedios 
        double[][] promedios = new double[7][8]; 
        Utilerias.promedios(results, promedios);
        Utilerias.printPromedios(promedios);
    }
}