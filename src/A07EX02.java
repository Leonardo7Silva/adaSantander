public class A07EX02 {
    public static void main(String[] args) {


        System.out.println(somar(3));
        System.out.println(somar2(3));
        System.out.println(multiplicar(4));
        System.out.println(multiplicar2(10));

    }

    public static int somar(int limite){
        int soma = 0;

        for(int i = 1; i <= limite; i++){
            soma += i;
        }
        return soma;
    }

    public static int somar2(int limite){
        if(limite == 0){
            return 0;
        }
        return limite + somar2( limite -1);
    }

    public static int multiplicar(int limite){
        int multiplicando = 0;

        for(int i = 1; i <= limite; i++){
            multiplicando += i;
        }
        return multiplicando;
    }

    public static int multiplicar2(int limite){
        if(limite == 1){
            return 1;
        }
        return limite * multiplicar2( limite -1);
    }
}
