package code;

import java.sql.SQLOutput;

/**
 * @program:test_12.3
 * @author: Nine_odes
 * @description:this
 * @create:2019-12-03 13:35
 */
//public class ThisReview {
//    int age;
//    String name;
//
//    public void test1(){
//
//    }
//
//    public void test2(){
//        //不同方法中的成员调用默认加this
//        test1();
//    }
//    public ThisReview(){
//        System.out.println("hehe");
//    }
//
//    public ThisReview(int age){
//        this();
//        this.age = age;
//    }
//
//   public ThisReview(int age,String name){
//       this(age);
//       this.age = age;
//
//        this.name = name;
//   }
//
//    public static void main(String[] args) {
//        ThisReview thisReview = new ThisReview(18,"jiuge");
//        System.out.println(thisReview.age);
//        System.out.println(thisReview.name);
//    }
//}

public class ThisReview {
//    public ThisReview(){
//        System.out.println(this);
//    }

    public void test(){
        System.out.println("test中："+this);
    }



    public static void main(String[] args) {
        ThisReview th1 = new ThisReview();
        System.out.println("main中："+th1);
        th1.test();
        ThisReview th2 = new ThisReview();
        System.out.println("main中："+th2);
        th2.test();
        th1.test();
    }
}
