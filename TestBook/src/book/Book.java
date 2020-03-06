package book;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-03 21:09
 **/
public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorrow;//false

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrow=" + isBorrow +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }


}
