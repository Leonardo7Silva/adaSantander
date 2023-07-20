import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] fruits = {"Pêra", "Laranja", "Maçã", "Tomate", "Caqui"};

        int[] quantidades = {0,0,0,0,0};
        double[] totais = {0.00, 0.00, 0.00, 0.00, 0.00};


        double total = 0;

        for (int i=0 ; i < fruits.length; i++){

            System.out.println("Quantidade de "+ fruits[i]+ "s:");

            int quantidade = sc.nextInt();
            quantidades[i] = quantidade;
            double totalFruta = preco(quantidade);

            totais[i] = totalFruta;
            total += totalFruta;

        };
        System.out.println("Lista de compras:");
        for (int i=0 ; i < fruits.length; i++){
            System.out.printf(" - %d %ss: R$%.2f", quantidades[i], fruits[i], totais[i]);
            System.out.println();
        }

        System.out.printf("Total: R$%.2f", total);


    }

    public static double preco(int quantidade){
        if(quantidade > 10){
            return quantidade*1.25;
        }else {
            return quantidade*1.45;
        }
    };



}
