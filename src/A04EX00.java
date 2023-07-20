
import java.util.Arrays;

public class A04EX00 {
    public static void main(String[] args) {
        String palavra = "Leonardo";
        char[] resolucao = separarLetras(palavra);
        System.out.println(Arrays.toString(resolucao));
    }
    public static char[] separarLetras(String input){
        char[] letras = new char[input.length()];
        for (int i = 0; i < input.length(); i++){
            letras[i] = input.charAt(i);
        }
        return letras;
    }
}