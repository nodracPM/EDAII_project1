package Sort;

public class PancakeSort{
    public static int pancakeSort(int[] a, int n){

        int cont = 0;

        for(int tam = n; tam >1; tam--){

            int indMax = 0;

            for(int i = 1; i < tam;i++){
                cont++; //comparison
                if (a[i]>a[indMax]){
                    indMax = i;
                }
            }

            if(indMax != tam -1){

                cont++; //comparison
                if(indMax > 0){
                    cont += Utilerias.flip(a,indMax);
                }

                cont += Utilerias.flip(a,tam-1);
            }

        }
        return cont;      
    }
}