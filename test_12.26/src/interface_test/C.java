package interface_test;


interface A{
    void testA();
}
interface B{
    void testB();
}
public interface C extends A,B{
    void testC();
}
class CImpl implements C{

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

    @Override
    public void testC() {

    }
}
