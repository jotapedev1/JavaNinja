package NinvelIntermediario.Refatoracao.Ninja;

public abstract class Ninja implements JutsuInterface, CombatInterface {
    private String name;
    private String village;
    private int age;
    private double height;
    private int chakra;

    @Override
    /*Implementa interface de Combate*/
    public void attack() {
        System.out.println(name + ": Attacked the target");
    };
    @Override
    public void defend() {
        System.out.println(name + ": Defended the target");
    }
    @Override
    public void shootKunai() {
        System.out.println(name + ": Shoot a Kunai");
    }
    @Override
    /*Implementa interface de Jutsu*/
    public void executeJutsu(){
        System.out.println(name + ": Used jutsu");
    };
    //overload?
    public void executeJutsu(String jutuName){
        System.out.println(name + " used jutsu: " + jutuName);
    }
    @Override
    public void useChakra(){
        System.out.println(name + ": Used chakra");
    };

    public Ninja(String name, String village, int age, double height, int chakra) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.height = height;
        this.chakra = chakra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
}

