public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size){
        this.type = type;
        this.size = size;
        changePrice(size);
    }

    public void setSize(String size) {
        changePrice(size);
        this.size = size;
    }

    public double getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

    private void changePrice(String size){
        char sizeLetter = size.toLowerCase().charAt(0);
        if (sizeLetter == 's'){
            this.price = 5;
        } else if (sizeLetter == 'm'){
            this.price = 10;
        } else {
            this.price = 15;
        }
    }
}
