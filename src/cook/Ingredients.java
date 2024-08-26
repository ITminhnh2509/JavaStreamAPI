package cook;

public class Ingredients {
    protected String nameIngredient;
    protected int Carb;
    protected int Fat;
    protected int saturatedFat;
    protected int Protenin;
    protected int Calo;
    protected int Quantity;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public int getCarb() {
        return Carb;
    }

    public void setCarb(int carb) {
        Carb = carb;
    }

    public int getFat() {
        return Fat;
    }

    public void setFat(int fat) {
        Fat = fat;
    }

    public int getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(int saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public int getProtenin() {
        return Protenin;
    }

    public void setProtenin(int protenin) {
        Protenin = protenin;
    }

    public int getCalo() {
        return Calo;
    }

    public void setCalo(int calo) {
        Calo = calo;
    }

    public void Xuat() {
        System.out.println(
                "nameIngredient='" + nameIngredient + '\'' +
                ", Carb=" + Carb +
                ", Fat=" + Fat +
                ", saturatedFat=" + saturatedFat +
                ", Protenin=" + Protenin +
                ", Calo=" + Calo +
                        ", Quantity=" + Quantity
                );
    }


}
