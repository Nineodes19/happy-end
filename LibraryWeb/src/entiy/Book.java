package entiy;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-03 19:25
 **/
public class Book {
    private int b_id;
    private String b_name;
    private String b_author;
    private String b_type;
    private String b_publish;
    private String b_condition;
    private double b_price;
    private String b_position;

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    public String getB_type() {
        return b_type;
    }

    public void setB_type(String b_type) {
        this.b_type = b_type;
    }

    public String getB_publish() {
        return b_publish;
    }

    public void setB_publish(String b_publish) {
        this.b_publish = b_publish;
    }

    public String getB_condition() {
        return b_condition;
    }

    public void setB_condition(String b_condition) {
        this.b_condition = b_condition;
    }

    public double getB_price() {
        return b_price;
    }

    public void setB_price(double b_price) {
        this.b_price = b_price;
    }

    public String getB_position() {
        return b_position;
    }

    public void setB_position(String b_position) {
        this.b_position = b_position;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_author='" + b_author + '\'' +
                ", b_type='" + b_type + '\'' +
                ", b_publish='" + b_publish + '\'' +
                ", b_condition='" + b_condition + '\'' +
                ", b_price=" + b_price +
                ", b_position='" + b_position + '\'' +
                '}';
    }
}
