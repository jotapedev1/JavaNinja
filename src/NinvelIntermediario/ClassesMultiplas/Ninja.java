package NinvelIntermediario.ClassesMultiplas;

public class Ninja {
    String nome;
    String habilidade;
    int idade;
    NivelNinja rank;

    public Ninja(String nome, String habilidade, int idade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }
    //OVERLOAD
    public Ninja(String nome, String habilidade, int idade, NivelNinja rank){
        this(nome, habilidade, idade);
        this.rank = rank;
    }
    public void apresentar(){
        System.out.println("Nome:" + nome+ " \n" +
                "idade: " + idade+ " \n" +
                "habilidade: " + habilidade+ " \n" +
                "nível: " + rank + " \n"

        );
    };
}
