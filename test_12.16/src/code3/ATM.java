package code3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * @program:test_12.16
 * @author: Nine_odes
 * @description:
 * @create:2019-12-16 20:39
 */
public class ATM {
    Account act;
    public ATM(){
        act = new Account("000","test","111",5000);
    }

    /******欢迎界面************/
    protected void Welcome(){
        String str = "---------------------------------";
        System.out.println(str+"\n");
        System.out.print("1.取款." + "\n" + "2.查询." + "\n" + "3.存款." + "\n" + "\n" + "4.退出系统." + "\n");
        System.out.println(str+"\n");
    }

    /**
     * 登录界面
     */
    protected void Load_Sys() throws IOException {
        String card,pwd;
        int counter = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("输入您的卡号：");
            card = br.readLine();
            System.out.println("请输入您的密码：");
            pwd = br.readLine();
            if(!isRight(card,pwd)){
                System.out.println("您的卡号或密码输入有误！");
                counter++;
            }else{
                SysOpter();
            }
        }while(counter < 3);
        System.exit(1);
    }

    /**
     * 根据用户输入进行任务调度
     */
    protected void SysOpter() throws IOException {
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请选择您要操作的项目（1-4）：");
        num = br.read();
        switch (num){
            case 49:
                BetBalance();
                break;
            case 50:
                Inqu_Info();
                break;
            case 51:
                AddBalance();
                break;
            case 52:
                Exit_Sys();
                break;
        }
        System.exit(1);
    }

    /**
     * 查询用户账户
     */
    protected void Inqu_Info() throws IOException {
        System.out.println("----------------------------\n" + "账号：" + act.getNumber() +
                "\n" + "姓名：" + act.getName() + "\n" +
                "余额" + act.getMoney() + "\n" +
                            "---------------------------\n");
        SysOpter();
    }

    /**
     * 取款
     */
    public void BetBalance() throws IOException {
        String str = null,str1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("请输入取款数目:");
            str = br.readLine();
            double qu = Double.valueOf(str).doubleValue();//将字符串转换为double类型
            if(qu > act.getMoney()){
                System.out.println("余额不足！请重新输入您要取的数目：");
            }else{
                act.sub_Balance(qu);
                System.out.println("取款成功，您的账户余额为：" + act.getMoney());
                Welcome();
                SysOpter();
            }
        }while(true);
    }

    /**
     * 存款
     */
    public void AddBalance() throws IOException {
        String str = null,str1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("请输入存款数目：");
            str = br.readLine();
            double qu = Double.valueOf(str).doubleValue();
            act.add_Balance(qu);
            System.out.println("存款成功，您的账户余额是：" + act.getMoney());
            Welcome();
            SysOpter();
        }while (true);
    }

    /**
     * 判断余额是否足够
     * @return
     */
    public boolean isBalance(){
        if(act.getMoney() > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 判断卡号、密码是否正确
     */
    public boolean isRight(String card,String pwd){
        if(act.getNumber().equals(card) && act.getPassword().equals(pwd)){
            return true;
        }
        return false;
    }

    /**
     * 结束系统
     */
    protected void Exit_Sys(){
        System.out.println("感谢您使用本系统，再见！");
        System.exit(1);
    }
}
