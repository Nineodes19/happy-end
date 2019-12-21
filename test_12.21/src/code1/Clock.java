package code1;

/**
 * @program:test_12.21
 * @author: Nine_odes
 * @description:
 * @create:2019-12-21 18:54
 */
public class Clock {
    public int hour;
    public int minute;
    public int second;

    public Clock(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    public void setDate(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void inSecond(){
        second++;
        if(second > 59){
            minute++;
            second = 0;
        }
        if(minute > 59){
            hour ++;
            minute= 0;
        }
        if(hour > 23){
            hour = 0;
        }
    }
    public void print(){
        System.out.println(hour + ":" + minute + ":" + second);
    }

    public static void main(String[] args) {
        Clock c = new Clock();
        c.setDate(23,25,58);
        c.inSecond();
        c.print();
    }
}
