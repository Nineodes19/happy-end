/**
 * @program:test_4.14
 * @author:Nine_odes
 * @description:
 * @create:2020-04-14 20:29
 **/
public enum TestEnum {
    RED("红色",1),GREEN("绿色",2),BLACK("黑色",3);

    public String color;
    public int num;
    //枚举的构造方法默认是私有的,不写也是私有的
    TestEnum(){

    }
    TestEnum(String color,int num){
        this.color = color;
        this.num = num;
    }

    public static TestEnum getEnumKey(int key){
        TestEnum[] testEnums = TestEnum.values();
        for (TestEnum t : testEnums){
            if(t.num == key){
                return t;
            }
        }
        return testEnums[0];
    }
}
