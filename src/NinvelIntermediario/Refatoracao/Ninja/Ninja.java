package NinvelIntermediario.Refatoracao.Ninja;

import java.util.Random;

public abstract class Ninja implements JutsuInterface, CombatInterface {
    private String name, village;
    private int age, kunaiNumber;
    private double height;

    private double attackPower, defensePower, chakra;

    Random rand = new Random();

    @Override
    /*Implementa interface de Combate*/
    public void attack() {
        System.out.println(name + ": Attacked the target");
    };

    @Override
    public void defend() {
        System.out.println(name + ": Defended the target");
    }

    public void attack(double attackPower, double defensePower, double oppDefensePower){
        int criticalChance = rand.nextInt(0, 10);
        if (criticalChance <= 4){
            oppDefensePower -= attackPower*0.3;
        }
        if (attackPower > oppDefensePower){
            oppDefensePower -= attackPower*0.2;
            attackPower -= attackPower*0.1;
        }else{
            defensePower -= attackPower*0.35;
        }
        return;
    }

    public void defense(double defensePower, double oppAttackPower,  double oppDefensePower) {
        int criticalChance = rand.nextInt(0, 10);

        if (defensePower < oppDefensePower) {
            defensePower -= oppAttackPower * 0.2;
            oppDefensePower -= oppAttackPower * 0.1;
        } else {
            oppDefensePower -= oppAttackPower * 0.35;
        }
    }

    @Override
    public void shootKunai() {
        System.out.println(name + ": Shoot a Kunai");
    }

    int shootKunai(int kunaiNumber, double oppDefensePower) {
        int hitChance = rand.nextInt(0, 10);
        double kunaiDamage = 12;
        if (hitChance <= 3){
            oppDefensePower -= kunaiDamage;
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
    public void executeJutsu(String jutuName){
        System.out.println(name + " used jutsu: " + jutuName);
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
}

