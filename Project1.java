import java.util.Random;
import Sort.BubbleSort;
import Sort.HeapSort; 
import Sort.InsertionSort; 
import Sort.QuickSort; 
import Sort.SelectionSort; 
import Sort.MergeSort;
import Sort.PancakeSort;
import Sort.Utilerias; 
import java.util.ArrayList;


public class Project1 {
    public static void main(String[] args) {
        Random random = new Random(); 

    //Generación de números aleatorios
        int[] sizes = {50, 100, 500, 800, 1000, 2000, 5000, 10000};
        ArrayList<ArrayList<ArrayList<Integer>>> arrays_sizes = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ejecuciones = new ArrayList<>();
        ArrayList<Integer> arrays = new ArrayList<>(); 

            //creación de la estructura para guardar todos los arreglos
        for(int i = 0; i < 5; i++) ejecuciones.add(arrays); //se agregan las 5 ejecuciones de para un tamaño n
        for(int i = 0; i < 8; i++) arrays_sizes.add(ejecuciones); //se crean los ocho conjuntos de 5 ejecuciones para cada tamaño
 

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

    }
}