package NinvelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        //criação de objeto da classe uzumaki
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 19, 35, 1.80,
                MissionRank.A);

        Naruto.showInfo();
        Naruto.showMissionInformation();

        //criação de objeto da classe uchiha
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 20, 24, 1.85,
                MissionRank.S);

        Sasuke.showInfo();
        Sasuke.showMissionInformation();
    }
}
