package NinvelIntermediario.Refatoracao;

import NinvelIntermediario.Refatoracao.Ninja.EquipmentsBag;
import NinvelIntermediario.Refatoracao.Ninja.NinjaEquipments;
import NinvelIntermediario.Refatoracao.Ninja.Uchiha;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 19, 13, 180, 100, 100, 100);
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 19, 13, 185, 100, 100, 100);

        Naruto.bijuuMode();
        Sasuke.normalSharingan();

        System.out.println("Naruto After Attack: " + "\n Defense: " + Naruto.getDefensePower() + "\n Attack: " + Naruto.getAttackPower());

        Sasuke.attack(Naruto);

        System.out.println("Naruto After Attack: " + "\n Defense: " + Naruto.getDefensePower() + "\n Attack: " + Naruto.getAttackPower());

        Sasuke.shootKunai(15, Naruto);

        System.out.println("Naruto After Kunai: " + Naruto.getDefensePower() + " - " + Naruto.getAttackPower());

    }
}
