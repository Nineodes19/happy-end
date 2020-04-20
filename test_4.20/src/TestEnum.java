/**
 * @program:test_4.20
 * @author:Nine_odes
 * @description:
 * @create:2020-04-20 23:14
 **/
public enum TestEnum {
    RED,BLACK,GREEN,WHITE;

    public static void main(String[] args) {
        TestEnum[] testEnums = TestEnum.values();
        for (int i = 0; i < testEnums.length; i++) {
            System.out.println(testEnums[i] + " " + testEnums[i].ordinal());
        }
        System.out.println("++++++++++++++++++++++");
        System.out.println(TestEnum.valueOf("GREEN"));
    }
    public static void main1(String[] args) {
        TestEnum testEnum = TestEnum.BLACK;
        switch (testEnum){
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case WHITE:
                System.out.println("white");
                break;
                default:
                    break;
        }
    }
}
