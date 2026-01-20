package NinvelIntermediario.Refatoracao;

import NinvelIntermediario.Refatoracao.Ninja.Uchiha;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 19, 13, 180, 100, 100, 100);
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 19, 13, 185, 100, 100, 100);

        //Naruto.bijuuMode();
        Sasuke.normalSharingan();

        double opAttack = Naruto.getAttackPower();
        double opDefense = Naruto.getDefensePower();

        System.out.println("Naruto before: " + opDefense + " - " + opAttack);

        Sasuke.attack(Sasuke.getAttackPower(), Sasuke.getDefensePower(), Naruto.getDefensePower());

        System.out.println("Naruto After: " + opDefense + " - " + opAttack);

    }
}
