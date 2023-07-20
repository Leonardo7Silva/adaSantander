import java.util.Scanner;

public class TrianguloHeron {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do seu trinângulo. Um de cada vez.");

        int a = sc.nextInt();
        System.out.println("Próximo");
        int b = sc.nextInt();
        System.out.println("Próximo");
        int c = sc.nextInt();
        System.out.println();
        double area = formulaDeHeron(a, b, c);
        System.out.printf("A área do seu triangulo é %.2f", area);

    };

    public static double formulaDeHeron(int a, int b, int c){
        if(isTriangulo(a,b,c)){
            double p = (a + b + c)/2;
            double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return area;
        }
        return 0;
    }

    public static boolean isTriangulo(int a, int b, int c){
        if(a+b <= c || a+c <= b || c+b <= a){
            return false;
        }
        return true;
    }

}