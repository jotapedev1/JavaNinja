package NinvelIntermediario.Encapsulamento;

public abstract class Ninja {
    private String name;
    private String village;
    private int age;
    private int missonNumber;
    private double height;

    //Construtor
    public Ninja(String name, String village, int age, int missonNumber, double height) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.missonNumber = missonNumber;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMissonNumber() {
        return missonNumber;
    }

    public void setMissonNumber(int missonNumber) {
        this.missonNumber = missonNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
