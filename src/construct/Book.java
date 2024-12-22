package construct;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("","",0);
    }

    Book(String title, String author){
        this(title, author,0);
    }

    Book(String title, String autohr, int page) {
        this.title = title;
        this.author = autohr;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목 : " + this.title + ", 저자 : " + this.author
                + ", 페이지 : " + this.page);
    }
}

