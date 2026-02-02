package NinvelIntermediario.Refatoracao.Ninja;

public class NinjaEquipments {
    private int quantity;
    public Ninja owner;
    private EquipmentsType equipmentsType;

    public NinjaEquipments(int quantity, Ninja owner, EquipmentsType equipmentsType) {
        this.quantity = quantity;
        this.owner = owner;
        this.equipmentsType = equipmentsType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Ninja getOwner() {
        return owner;
    }

    public void setOwner(Ninja owner) {
        this.owner = owner;
    }

    public EquipmentsType getEquipmentsType() {
        return equipmentsType;
    }

    public void setEquipmentsType(EquipmentsType equipmentsType) {
        this.equipmentsType = equipmentsType;
    }
}
