/**
 * @program:test_5.11
 * @author:Nine_odes
 * @description:
 * @create:2020-05-11 22:48
 **/
public enum TestEnum {
    RED,BLACK,GREEN,WHITE;
    public static void main(String[] args){
        TestEnum testEnum = TestEnum.BLACK;
        switch(testEnum){
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("white");
                break;
            case GREEN:
                System.out.println("green");
                break;
                default:
                    break;
        }
    }
}
