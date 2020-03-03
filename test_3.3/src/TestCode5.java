/**
 * @program:test_3.3
 * @author:Nine_odes
 * @description:
 * @create:2020-03-03 20:25
 **/

/**
 * 自定义异常类：
 * 当你自定义的异常，继承于RuntimeException代表是运行时期异常/非受查异常
 * 当你自定义的异常，直接继承于Exceptionshi
 */

class MyException extends Exception{

    public MyException(String msg) {
        super();
    }
}
public class TestCode5 {
    public static void main(String[] args) throws MyException {
        int b = 0;
        if(b == 0){
                throw new MyException("jiuge");
        }
    }
}
