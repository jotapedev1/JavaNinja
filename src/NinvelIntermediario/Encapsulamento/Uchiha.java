package NinvelIntermediario.Encapsulamento;

public class Uchiha extends Ninja {
    public Uchiha(String name, String village, int age, int missonNumber, double height, MissionRank missionRank) {
        super(name, village, age, missonNumber, height, missionRank);
    }

    public void showInfo(){
        System.out.println("Name: " + this.getName() + ", Village: " +
                this.getVillage() + ", Age: " + this.getAge() +  ", Misson Number: "
                + this.getMissonNumber() + ", Height: " + this.getHeight());
    }
}
