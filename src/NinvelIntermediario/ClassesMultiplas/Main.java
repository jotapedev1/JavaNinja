package NinvelIntermediario.ClassesMultiplas;

public class Main {
    public static void main(String[] args) {
        Hatake kakashi = new Hatake("Kakashi Hatake", 45, "Dragão de água");
        kakashi.roubo();
        kakashi.ninjaDeElite();
        kakashi.sharinganAtivado();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 14, "Bola de fogo");
        sasuke.sharinganAtivado();

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Clone das sombras", 19, NivelNinja.GENNIN);
        naruto.rasengan();
        naruto.apresentar();
    }
}
