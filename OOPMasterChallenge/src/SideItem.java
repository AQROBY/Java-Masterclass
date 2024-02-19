public class SideItem {
    private String type;
    private double price;

    public SideItem(String type, double price){
        this.type = type;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getType() {
        return type;
    }
}
