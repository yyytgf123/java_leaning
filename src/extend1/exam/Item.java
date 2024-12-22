package extend1.exam;

public class Item {
    protected String name;
    protected int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름 : " + this.name + ", 가격 : " + this.price);
    }
}
