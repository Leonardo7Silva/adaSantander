public enum Estado {
    MG(0.07, "Minas Gerais"),
    SP(0.12, "São Paulo"),
    RJ(0.15, "Rio de Janeiro");

    final double desconto;
    final String nome;

    Estado(double desconto, String nome){
        this.desconto = desconto;
        this.nome = nome;
    }

    public double getDesconto(){
        return desconto;
    }

    public String getNome(){
        return nome;
    }
}




