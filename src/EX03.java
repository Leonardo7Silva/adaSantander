import java.util.Arrays;

public class EX03 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);
        int[] ascendingPairOrder = sortAscendingPairOrder(numbers);
        int[] ascendingOddOrder = sortAscendingOddOrder(numbers);


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
        System.out.println(Arrays.toString(ascendingPairOrder));
        System.out.println(Arrays.toString(ascendingOddOrder));
    }

    public static int[] sortAscendingOrder(int[] array){

        int[] arrayAux = array.clone();
        int aux;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(arrayAux[j] < arrayAux[i] ){
                    aux = arrayAux[i];
                    arrayAux[i] = arrayAux[j];
                    arrayAux[j] = aux;
                }
            }
        }

        return arrayAux;
    };

    public static int[] sortDescendingOrder(int[] array){
        int[] arrayAux = array.clone();
        int aux;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(arrayAux[j] > arrayAux[i] ){
                    aux = arrayAux[i];
                    arrayAux[i] = arrayAux[j];
                    arrayAux[j] = aux;
                }
            }
        }

        return arrayAux;
    };

    public static int[] sortAscendingPairOrder(int[] array){

        int[] arrayAux = array.clone();
        int aux;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(arrayAux[j] < arrayAux[i] ){
                    aux = arrayAux[i];
                    arrayAux[i] = arrayAux[j];
                    arrayAux[j] = aux;
                }
            }
        }

        int contador = 0;

        for (int i = 0; i < arrayAux.length; i++){
            if(arrayAux[i] % 2 == 0){
                contador++;
            }
        };

        int[] pairArray = new int[contador];
        for (int i = 0; i < arrayAux.length; i++){
            if(arrayAux[i] % 2 == 0 && contador != 0){
                pairArray[pairArray.length - contador] = arrayAux[i];
                contador--;
            }
        };

        return pairArray;
    };

    public static int[] sortAscendingOddOrder(int[] array){

        int[] arrayAux = array.clone();
        int aux;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(arrayAux[j] < arrayAux[i] ){
                    aux = arrayAux[i];
                    arrayAux[i] = arrayAux[j];
                    arrayAux[j] = aux;
                }
            }
        }

        int contador = 0;

        for (int i = 0; i < arrayAux.length; i++){
            if(arrayAux[i] % 2 == 1){
                contador++;
            }
        };

        int[] oddArray = new int[contador];
        for (int i = 0; i < arrayAux.length; i++){
            if(arrayAux[i] % 2 == 1 && contador != 0){
                oddArray[oddArray.length - contador] = arrayAux[i];
                contador--;
            }
        };

        return oddArray;
    };
}