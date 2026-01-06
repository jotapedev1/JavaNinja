package NinvelIntermediario.Refatoracao;

import NinvelIntermediario.Refatoracao.Ninja.Ninja;

public class Uzumaki extends Ninja{
    BijuusEnum bijuusEnum;
    String JutsuName = "Rasengan";

    public Uzumaki(String name, String village, int age, double height, int chakra) {
        super(name, village, age, height, chakra);
    }

    public void introduction(){
        System.out.println("My name is: " + getName() + "\n I'm from " + getVillage() + " and I'm " + getAge());
    }
}
