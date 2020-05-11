import java.lang.reflect.Constructor;

/**
 * @program:test_5.11
 * @author:Nine_odes
 * @description:
 * @create:2020-05-11 22:51
 **/
public enum TestEnum1 {
    RED("red",1),BLACK("black",2),GREEN("green",3),WHITE("green",4);
    private String name;
    private int key;

    /**
     * 当枚举对象有参数后，需要提供相应的构造函数
     * 枚举对象的构造函数默认是私有的
     * @param name
     * @param key
     */
    private TestEnum1(String name, int key) {
        this.name = name;
        this.key = key;
    }

    /**
     * 寻找索引位置为key的枚举对象
     * @param key
     * @return
     */
    public static TestEnum1 getEnumKey(int key){
        for(TestEnum1 t : TestEnum1.values()){
            if(t.key == key){
                return t;
            }
        }
        return null;
    }

    public static void reflectPrivateConstructor(){
        try{
            Class<?> classStudent = Class.forName("TestEnum1");
            Constructor<?> declaredConstructorStudent =
                    classStudent.getDeclaredConstructor(String.class,int.class,String.class,int.class);
            declaredConstructorStudent.setAccessible(true);
            Object objectStudent = declaredConstructorStudent.newInstance("绿色",666);
            TestEnum1 testEnum1 = (TestEnum1) objectStudent;
            System.out.println("获得枚举的私有构造函数：" + testEnum1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(getEnumKey(2));
        System.out.println(getEnumKey(1));
        reflectPrivateConstructor();
    }

    public static void main2(String[] args) {
        TestEnum1 testEnum = TestEnum1.BLACK;
        TestEnum1 testEnum21 = TestEnum1.RED;

        //compareTo() 比较两个枚举成员在定义时的顺序
        System.out.println(testEnum.compareTo(testEnum21));
        System.out.println(WHITE.compareTo(BLACK));
        System.out.println(BLACK.compareTo(RED));
        System.out.println(RED.compareTo(BLACK));
        System.out.println(RED.compareTo(RED));
        System.out.println(TestEnum.valueOf("RED"));

    }
    public static void main1(String[] args) {
        //values() 以数组的形式返回枚举类型的所有成员
        //ordinal()获取枚举成员的索引位置
        TestEnum1[] testEnum1 = TestEnum1.values();
        for (int i = 0; i < testEnum1.length; i++) {
            System.out.println(testEnum1[i] + " " + testEnum1[i].ordinal());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //valueOf() 将普通字符串转换为枚举实例
        System.out.println(TestEnum1.valueOf("GREEN"));
    }
}
