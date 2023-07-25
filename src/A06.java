public class A06 {
    public static void main(String[] args) {

    }

    public static String avaliacao(double[] input) {

        double[] pecasOrdenadas = input.clone();

        double auxOrder = 0;
        for(int i = 0; i < input.length; i++){
            for(int j = i+1; j < input.length; j++){
                if(pecasOrdenadas[i] > pecasOrdenadas[j]){
                    auxOrder = pecasOrdenadas[i];
                    pecasOrdenadas[i] = pecasOrdenadas[j];
                    pecasOrdenadas[j] = auxOrder;
                }
            }
        }
        double desconto = 0;
        double total =0;
        double pecasComDescontos = Math.ceil(input.length/2);
        for(int i = 0; i < input.length; i++){
            total += pecasOrdenadas[i];
            if(i < pecasComDescontos){
                desconto += pecasOrdenadas[i]/2;
            }
        }

        String mensagemFinal = "Valor total: " + total + " | Valor de descontos: " + desconto + " | Valor a pagar: " + (total-desconto);
        return mensagemFinal;
    }

    public static int numeroUnico( int[] input) {



        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){

                if(i == j){
                    if(i == input.length -1){
                        return input[i];
                    }
                    continue;
                }

                if(input[i] == input[j]){
                    break;
                }

                if(j == input.length - 1){
                    return input[i];
                }
            }
        }
        return -1;
    }
}
