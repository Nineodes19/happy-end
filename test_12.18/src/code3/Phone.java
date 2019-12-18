package code3;

/**
 * @program:test_12.18
 * @author: Nine_odes
 * @description:
 * @create:2019-12-18 22:47
 */
public class Phone {
    private String brand;
    private int price;
    private String color;
    public Phone(){}
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
