package extend1.exam;

public class Album extends Item {
    String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : " + this.artist + ",  가격 : " + this.artist);
    }
}
