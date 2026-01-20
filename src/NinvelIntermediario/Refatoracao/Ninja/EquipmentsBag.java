package NinvelIntermediario.Refatoracao.Ninja;

import java.util.ArrayList;
import java.util.List;

public class EquipmentsBag<T>{
    private List<T> equipments;


    public void addEquipments(T ninjaEquipments){
        equipments.add(ninjaEquipments);
    }
    public void showEquipments(){
            System.out.println(equipments);
    }

    public EquipmentsBag(){
        this.equipments = new ArrayList<>();
    }

    public List<T> getEquipments() {
        return equipments;
    }
    public void setEquipments(List<T> equipments) {
        this.equipments = equipments;
    }

}
