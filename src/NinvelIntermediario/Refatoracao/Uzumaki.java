package NinvelIntermediario.Refatoracao;

import NinvelIntermediario.Refatoracao.Ninja.Ninja;

import java.util.Random;

public class Uzumaki extends Ninja{

    BijuusEnum bijuusEnum;
    String jutsuName = "Rasengan";

    public Uzumaki(String name, String village, int age, int kunaiNumber, double height, double attackPower, double defensePower, double chakra) {
        super(name, village, age, kunaiNumber, height, attackPower, defensePower, chakra);
        this.jutsuName = jutsuName;
    }

    public void introduction(){
        System.out.println("My name is: " + getName() + "\n I'm from " + getVillage() + " and I'm " + getAge());
    }

    /*//TODO Bijuu mode +attackpower - defense
    void bijuuMode(){
        System.out.println(getName() + " Entered the Bijuu mode");
        setAttackPower(15);
        setDefensePower(-10);
    }*/


}
