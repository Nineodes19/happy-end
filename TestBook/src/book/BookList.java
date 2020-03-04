package book;

/**
 * @program:TestBook
 * @author:Nine_odes
 * @description:
 * @create:2020-03-03 21:09
 **/
public class BookList {

    private Book[] books = new Book[10];
    private int usedSize;//预先存放的书的个数

    public BookList(){
        books[0] = new Book("三国演义","罗贯中",12,"小说");
        books[1] = new Book("西游记","吴承恩",15,"小说");
        books[2] = new Book("水浒站","施耐庵",12,"小说");
        this.usedSize = 3;
    }

    public Book getBook(int pos){
        //只关注整体的实现
        return this.books[pos];
    }

    public void setBook(int pos,Book book){
        //尾插，每次放书都放在数组的最后位置
        this.books[pos] = book;
    }

    public void setUsedSize(int usedSize){
        this.usedSize = usedSize;
    }

    public int getUsedSize(){
        return this.usedSize;
    }
}
