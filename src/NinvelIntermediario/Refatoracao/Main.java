package NinvelIntermediario.Refatoracao;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 19, 170, 120);
        Naruto.introduction();
        Naruto.executeJutsu(Naruto.jutsuName);

    }
}
