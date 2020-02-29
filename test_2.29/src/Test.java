import java.util.Scanner;

/**
 * @program:test_2.29
 * @author:Nine_odes
 * @description:
 * @create:2020-02-29 20:40
 **/
public class Test {
    static int row = 9;//房间楼层
    static int col = 9;//该楼层的房间间数

    static String[][] rooms = new String[row][col];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //做一个房间初始化
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rooms[i][j] = "empty";
            }
        }

        while(true){
            //打印控制界面
            help();
            String con = sc.next();
            if(con.equals("search")){
                //查询房间
                searchRoom();
            }else if(con.equals("in")){
                //预定房间
                inTheRoom();
            }else if(con.equals("out")){
                //退房
                outTheRoom();
            }else if(con.equals("exit")){
                //退出系统
                System.out.println("退出系统");
                break;
            }
        }
    }

    /**
     * 查询房间
     */
    public static void searchRoom(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print((i+1)*1000+j+1 + "\t");
            }
            System.out.println();
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j] + "\t");
            }
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    /**
     * 预定房间,检查用户输入房间号是否合理，判断该房间是否已经有人入住，预订房间
     */
    public static void inTheRoom(){
        boolean success = false;
        int num = 0;//房间号
        while(!success){
            System.out.println("请输入您要预定的房间：");
            //会有隐藏bug。没有判断输入是否合理
            while(sc.hasNext()){
                num = sc.nextInt();
                if((num % 1000 == 0 || num % 10 == 0) || ((num%10)/10) != 0 || (num %100)/10 != 0){
                    System.out.println("您的输入有误，请重新输入");
                    return;
                }
            }
            //判断该房间是否已经有人
            int row = num / 1000 - 1;
            int col = num % 1000 - 1;
            if(rooms[row][col].equals("empty")){
                System.out.println("请您输入姓名：");
                String name = sc.next();
                System.out.println(name + "成功预定" + num + "号房间");
                success = true;
                rooms[row][col] = name;
            }else{
                System.out.println("该房间已经有人入住，请重新订房");
            }
        }
    }

    /**
     * 退房，必须是本人退房
     */
    public static void outTheRoom(){
        System.out.println("请输入退房号");
        int num = sc.nextInt();
        int row = num / 1000 - 1;
        int col = num % 1000 - 1;
        if(rooms[row][col].equals("empty")){
            System.out.println("房间已经能为空，无需退房");
        }else{
            System.out.println("输入姓名：");
            String name = sc.next();
            if(rooms[row][col].equals(name)){
                rooms[row][col] = "empty";
                System.out.println(name + "退房成功！");
            }else{
                System.out.println("房间必须由本人来退房");
            }
        }
    }
    public static void help(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~欢迎进入财大酒店~~~~~~~~~");
        System.out.println("~~~~~~~~~请选择输入");
        System.out.println("~~~~~~~~~请输入search查房~~~~~~~~~");
        System.out.println("~~~~~~~~~请输入in 预定房间");
        System.out.println("~~~~~~~~~请输入out退房");
        System.out.println("~~~~~~~~~请输入exit退出系统");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~请输入指令~~~~~~~~~~~~~~~");
    }
}

