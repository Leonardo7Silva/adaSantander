import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;


public class A06EX01 {



    public static void main(String[] args) {

        System.out.println(valorProdutoFinal(250.10, "Minas Gerais") == 267.607);
        System.out.println(valorProdutoFinal(250.10, "Rio de Janeiro") == 287.615);
        System.out.println(valorProdutoFinal(250.10, "São Paulo") == 280.112);
    }




    public static double valorProdutoFinal(double valorProduto, String estado) {
        for (Estado t : Estado.values()){
            if(t.getNome().equals(estado)){
                return arredondar(t.getDesconto()*valorProduto +valorProduto);
            }
        }
        return 0;
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
