public class Shoes {
    private int id;
    private String type;
    private String name;
    private int size;
    private int price;

    public Shoes(int id, String type, String name, int size, int price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public static Shoes[] shoes(){
        Shoes[] shoeList = new Shoes[100];
        shoeList[0] = new Shoes(1,"Sneaker","Nike Dunk Low",43,3000);
        shoeList[1] = new Shoes(2,"Sneaker","Nike AirForce1",42,3500);
        shoeList[2] = new Shoes(3,"Sneaker","Nike Huarache",39,2999);
        shoeList[3] = new Shoes(4,"Sneaker","Adidas Ozweego",44,2100);
        shoeList[4] = new Shoes(5,"Sneaker","Adidas Nite Jogger",41,1900);
        shoeList[5] = new Shoes(6,"Sneaker","Puma -180",41,1800);
        shoeList[6] = new Shoes(7,"Sneaker","Adidas Superstar",41,2400);
        shoeList[7] = new Shoes(8,"Sneaker","Adidas Stan Smith",38,2600);
        return shoeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setShoeType(String shoeType) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}