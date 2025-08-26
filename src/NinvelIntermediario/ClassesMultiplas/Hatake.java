package NinvelIntermediario.ClassesMultiplas;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    @Override
    public void ninjaDeElite() {
        System.out.println("Sou um ninja de elite");
    }
    @Override
    public void sharinganAtivado() {
        System.out.println("Sharingan ativado");
    }
    //Sobrecarregando metodo
    public void sharinganAtivado(int mortes) {
        if (mortes > 30) {
            System.out.println("Rinnegan + Sharingan");
        } else if (mortes > 20) {
            System.out.println("MANGEKYOU SHARINGAN");
        } else {
            System.out.println("Sharingan ativado");
        }
    }

    public Hatake(String nome, int idade, String habilidade) {
        super(nome, habilidade, idade);
    }

    public void roubo(){
        System.out.println("ROUBEI SEU JUTSU");
    }
}
