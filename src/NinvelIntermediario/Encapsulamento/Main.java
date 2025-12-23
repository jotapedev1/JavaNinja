package NinvelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 19, 35, 1.80,
                MissionRank.A);
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 20, 24, 1.85,
                MissionRank.S);

        Naruto.setAge(44);
        Sasuke.getAge();


    }
}
