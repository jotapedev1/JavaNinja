package NinvelIntermediario.Refatoracao.Ninja;

public class NinjaEquipments {
    private String name;
    private int quantity;

    public NinjaEquipments(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "NinjaEquipments{" + "\n" +
                "name='" + name + '\''+ "\n" +
                ", quantity=" + quantity + "\n" +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
