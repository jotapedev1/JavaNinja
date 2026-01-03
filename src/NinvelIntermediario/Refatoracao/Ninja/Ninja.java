package NinvelIntermediario.Refatoracao.Ninja;

public abstract class Ninja implements JutsuInterface, CombatInterface {
    private String name;
    private String village;
    private int age;
    private double height;
    private int chakra;

    /*Implementa interface de Combate*/
    public void attack() {
        System.out.println(name + ": Attacked the target");
    };
    public void defend() {
        System.out.println(name + ": Defended the target");
    }
    public void shootKunai() {
        System.out.println(name + ": Shoot a Kunai");
    }

    /*Implementa interface de Jutsu*/
    public void executeJutsu(){
        System.out.println(name + ": Used jutsu");
    };
    public void useChakra(){
        System.out.println(name + ": Used chakra");
    };

}

