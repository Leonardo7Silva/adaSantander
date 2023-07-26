public enum Semana {
    SEGUNDA_FEIRA(2, new String[] {"Seg", "Segunda-feira", "Segunda" }),
    TERCA_FEIRA(3, new String[] {"Ter", "Terça-feira", "Terça" }),
    QUARTA_FEIRA(4, new String[] {"Qua", "Quarta-feira", "Quarta" }),
    QUINTA_FEIRA(5, new String[] {"Qui", "Quinta-feira", "Quinta" }),
    SEXTA_FEIRA(6, new String[] {"Sex", "Sexta-feira", "Sexta" }),
    SABADO(7, new String[] {"Sab", "Sábado", "Sabado" }),
    DOMINGO(1, new String[] {"Dom", "Domingo" });

    final int numDia;

    final String[] keyWords;

    Semana(int numDia, String[] keyWords){
        this.numDia = numDia;
        this.keyWords = keyWords;
    }

    public String[] getNames(){
        return keyWords;
    }
}
