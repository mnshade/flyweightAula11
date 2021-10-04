public class Bird {
    private String nome;
    private String cor;
    private String tipo;
    private Selecao fase;

    public Bird(String nome, String cor, String tipo, Selecao fase) {
        this.nome = nome;
        this.cor = cor;
        this.tipo = tipo;
        this.fase = fase;
    }
    public String obterBird(){
        return "Bird{" +
                "Nome: '"+ this.nome +  '\'' +
                ", Cor: '" + this.cor +  '\'' +
                ", Tipo: '" + this.tipo + '\'' +
                ", Nome da Fase: '" + fase.getNomeFase() + '\''+
                ", Dificuldade: '" + fase.getDificuldade() + '\'' +
                '}';
    }
}
