package NinvelIntermediario.ClassesMultiplas;

public class Uchiha extends Ninja implements SharinganInterface {
    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan ativado");
    }
    //Sobrecarregando metodo
    public void sharinganAtivado(int mortes){
        if(mortes > 30){
            System.out.println("Rinnegan + Sharingan");
        }
        else if (mortes > 20){
            System.out.println("MANGEKYOU SHARINGAN");
        }
        else {
            System.out.println("Sharingan ativado");
        }
    }
    public Uchiha(String nome, int idade, String habilidade) {
        super(nome, habilidade, idade);
    }
    //OVERLOAD
    public Uchiha(String nome, String habilidade, int idade, NivelNinja rank) {
        super(nome, habilidade, idade, rank);
    }
}
