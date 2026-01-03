package NinvelIntermediario.Encapsulamento;

public class Uzumaki extends Ninja{
    public Uzumaki(String name, String village, int age, int missonNumber, double height, MissionRank missionRank) {
        super(name, village, age, missonNumber, height, missionRank);
    }

    //Metodo de exibir info do obj
    public void showInfo() {
        System.out.println("Name: " + this.getName() + ", Village: " +
                this.getVillage() + ", Age: " + this.getAge() + ", Misson Number: "
                + this.getMissonNumber() + ", Height: " + this.getHeight());
    }

    @Override
    public void showMissionInformation() {
        System.out.println("Mission rank: " + getMissionRank() + "\nMission desc: " + getMissionRank().getRankDesc() + "\nMission level: " + getMissionRank().getDifficulty());
    }
}
