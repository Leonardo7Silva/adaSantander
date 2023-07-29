public class A07EX02 {
    public static void main(String[] args) {


        System.out.println(somar(3));
        System.out.println(somar2(3));
        System.out.println(multiplicar(4));
        System.out.println(multiplicar2(10));

        String a = "AAA";
        String.valueOf(a.charAt(0));
        System.out.println(String.valueOf(a.charAt(0)));

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

    public static char[] soletrandoStr(String input) {
        char[] aux = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            aux[i] = input.charAt(i);
        }

        return aux;
    }
}
