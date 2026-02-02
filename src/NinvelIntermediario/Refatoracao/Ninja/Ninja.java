package NinvelIntermediario.Refatoracao.Ninja;

import java.util.Random;

public abstract class Ninja implements JutsuInterface, CombatInterface {
    private String name, village;
    private int age, kunaiNumber;
    private double height;

    private double attackPower, defensePower, chakra;

    protected EquipmentsBag<NinjaEquipments> NinjaBag;

    Random rand = new Random();

    public Ninja(String name, String village, int age, int kunaiNumber, double height, double attackPower, double defensePower, double chakra) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.kunaiNumber = kunaiNumber;
        this.height = height;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.chakra = chakra;
        this.NinjaBag = new EquipmentsBag<>();
    }

    @Override
    /*Implementa interface de Combate*/
    public void attack() {
        System.out.println(name + ": Attacked the target");
    };

    @Override
    public void defense() {
        System.out.println(name + ": Defended the target");
    }

    public void attack(Ninja opponent) {
        int criticalChance = rand.nextInt(10);

        double damage = getAttackPower();

        if (criticalChance <= 4) {
            damage *= 1.3; // crítico
        }

        if (damage > opponent.getDefensePower()) {
            opponent.setDefensePower(opponent.getDefensePower() - damage * 0.2);
            setAttackPower(getAttackPower() - damage * 0.1);
        } else {
            setDefensePower(getDefensePower() - damage * 0.35);
        }
    }


    public void defense(Ninja opponent) {
        int criticalChance = rand.nextInt(0, 10);

        double damage = opponent.getAttackPower();
        double defense = getDefensePower();

        if (criticalChance <= 4) {
            damage *= 1.3; // crítico
        }

        if (defense < damage) {
            setDefensePower(getDefensePower() - damage * 0.2);
            opponent.setAttackPower(opponent.getAttackPower() - damage * 0.1);
        } else {
            opponent.setDefensePower(opponent.getDefensePower() - damage * 0.35);
        }
    }

    @Override
    public void shootKunai() {
        System.out.println(name + ": Shoot a Kunai");
    }

    public int shootKunai(int kunaiNumber, Ninja opponent) {
        int hitChance = rand.nextInt(0, 10);
        double kunaiDamage = 12;

        if (hitChance <= 3){
            opponent.setDefensePower(opponent.getDefensePower() - kunaiDamage);
            kunaiNumber --;
        }else{
            System.out.println(getName() + " Missed the kunai");
            kunaiNumber --;
        }
        return kunaiNumber;
    }

    @Override
    /*Implementa interface de Jutsu*/
    public void executeJutsu(){
        System.out.println(name + ": Used jutsu");
    };
    //overload?
    public void executeJutsu(String jutsuName){
        System.out.println(name + " used jutsu: " + jutsuName);
    }
    @Override
    public void useChakra(){
        System.out.println(name + ": Used chakra");
    };



/*
* GETTERS E SETTERS
*/
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

    public double getChakra() {
        return chakra;
    }

    public void setChakra(double chakra) {
        this.chakra = chakra;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(double defensePower) {
        this.defensePower = defensePower;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int getKunaiNumber() {
        return kunaiNumber;
    }

    public void setKunaiNumber(int kunaiNumber) {
        this.kunaiNumber = kunaiNumber;
    }
    public EquipmentsBag<NinjaEquipments> getNinjaBag(){
        return NinjaBag;
    }
    public void setNinjaBag(EquipmentsBag<NinjaEquipments> ninjaBag) {
        NinjaBag = ninjaBag;
    }
}

