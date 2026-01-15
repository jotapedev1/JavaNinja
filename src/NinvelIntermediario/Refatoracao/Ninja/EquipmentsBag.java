package NinvelIntermediario.Refatoracao.Ninja;

import java.util.ArrayList;
import java.util.List;

public class EquipmentsBag<T>{
    private List<T> equipaments = new ArrayList<>();


    public void addEquipaments(T ninjaEquipments){
        equipaments.add(ninjaEquipments);
        
    }

    public List<T> getEquipaments() {
        return equipaments;
    }
    public void setEquipaments(List<T> equipaments) {
        this.equipaments = equipaments;
    }

}
