package NinvelIntermediario.Refatoracao;

import NinvelIntermediario.Refatoracao.Ninja.Ninja;

import java.util.Random;

public class Uzumaki extends Ninja{
    Random rand = new Random();

    BijuusEnum bijuusEnum;
    String jutsuName = "Rasengan";


    public void introduction(){
        System.out.println("My name is: " + getName() + "\n I'm from " + getVillage() + " and I'm " + getAge());
    }

    //TODO Bijuu mode +attackpower - defense

}
