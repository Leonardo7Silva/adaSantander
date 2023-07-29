import java.util.Arrays;

public class A08 {
    public static void main(String[] args) {
        System.out.println(somaAlgarismos(12345));
        String[] a = {"mas", "as", "amor", "amoreco"};
        String b = "Arroz";
        System.out.println(Arrays.toString(soletrandoInvertidoStr(b)));





    }

    public static String[] soletrandoInvertidoStr(String input) {
        String[] soletrandoInvertido = new String[input.length()];
        int aux = input.length();

        for (int i = input.length() - 1; i >= 0; i--) {
            soletrandoInvertido[input.length() - aux] = String.valueOf(input.charAt(i));
            aux--;
        }

        return soletrandoInvertido;

    }

    public static String[] substringStr( String[] input) {
        int contador=0;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                if(i == j){
                    continue;
                }
                if(input[i].contains(input[j])){
                    contador++;
                }
            }
        }
        String[] auxArray = new String[contador];
        int auxInt = contador;
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                if(i == j){
                   continue;
                }
                if(input[i].contains(input[j])){
                    auxArray[contador-auxInt] = input[j];
                    auxInt--;
                }
            }
        }


        return auxArray;
    }

    public static int somaAlgarismos(int input) {

        if(input < 0){
            return -1;
        }

        int num = input;
        int contador = 0;

        while(num > 0){
            num = num/10;
            contador++;
        }

        double num2 = input;
        int total = 0;
        for(int i = 1; i <= contador; i++){
            double numeroDaVez = Math.floor(num2/(Math.pow(10, (contador - i))));
            total += numeroDaVez;
            num2 = num2 - (numeroDaVez*Math.pow(10,(contador - i)));
        }
        return total;
    }
}
