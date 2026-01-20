package NinvelIntermediario.Refatoracao.Ninja;

public class Uchiha extends Ninja implements SharinganInterface{

    String jutsuName = "Chidori";

    public Uchiha(String name, String village, int age, int kunaiNumber, double height, double attackPower, double defensePower, double chakra) {
        super(name, village, age, kunaiNumber, height, attackPower, defensePower, chakra);
        this.jutsuName = jutsuName;
    }

    public void introduction(){
        System.out.println("My name is: " + getName() + "\n I'm from " + getVillage() + " and I'm " + getAge());
    }

    @Override
    public void normalSharingan() {
        System.out.println(getName() + " Activated Sharingan");
        setDefensePower(20);
    }
}
