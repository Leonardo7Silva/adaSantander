public class A07EX01 {
    public static void main(String[] args) {
        System.out.println(returnDay("qui"));
    }

    public static Enum returnDay(String keyWord){
        for ( Semana d : Semana.values()){
            for (String k: d.getNames()){
                if (k.equalsIgnoreCase(keyWord)){
                    return d;
                }
            }
        }

        return null;
    }
}
