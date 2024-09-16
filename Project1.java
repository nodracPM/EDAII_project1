import java.util.Random;
import Sort.BubbleSort;
import Sort.CycleSort; 
import Sort.HeapSort; 
import Sort.InsertionSort; 
import Sort.QuickSort; 
import Sort.SelectionSort; 
import Sort.MergeSort;
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
        //6. CycleSort



        int size = 13, size2 = 100, cont1, cont2, cont3 ,cont4 ,cont5, cont6, cont7; 

        int[] a = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; //size = 13
        int[] b = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};
        int[] c = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};
        int[] d = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};  
        int[] e = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10}; 
        int[] f = {1, 4, 12, 31, 42, 11, 1, 66, 32, 8, 9, 19, 10};

        //verificación
        cont1 = BubbleSort.bubbleSort(a, size); 
        Utilerias.printArray(a, size);
        System.out.println(cont1);
        System.out.println();

        cont2 = InsertionSort.insertionSort(b, size); 
        Utilerias.printArray(b, size);
        System.out.println(cont2);
        System.out.println();

        cont3 = HeapSort.heapSort(c, size); 
        Utilerias.printArray(c, size);
        System.out.println(cont3);
        System.out.println();

        cont4 = SelectionSort.selectionSort(d, size);
        Utilerias.printArray(d, size);
        System.out.println(cont4);
        System.out.println();

        cont5 = QuickSort.quickSort(d, 0, size-1);
        Utilerias.printArray(d, size);
        System.out.println(cont5);
        System.out.println();

        cont7 = MergeSort.mergeSort(f,0, size-1);
        Utilerias.printArray(f, size);
        System.out.println(cont7);
        System.out.println();

    }
}   