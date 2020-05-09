/**
 * @program:test_5.9
 * @author:Nine_odes
 * @description:
 * @create:2020-05-09 18:50
 **/
import sun.java2d.StateTrackable;
import sun.security.pkcs11.Secmod;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class BlogDemo {

    Scanner scanner = new Scanner(System.in);

    User user = new User();

    public  void login() throws SQLException, ClassNotFoundException {
        System.out.println("请输入你登录的用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入你的密码：");
        String password = scanner.nextLine();
        Connection connection = DBUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet= null;
        String sql = String.format("select username,password from users where usename = '%s' and password = '%s'",
                username,password);
        try{
            //4.执行语句
            resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                int id = resultSet.getInt(1);
                user.setId(id);
                String name = resultSet.getString(2);
                user.setUsername(name);
                String pd = resultSet.getString(3);
                user.setPassword(pd);
            }
            System.out.println("登录成功：" + user);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DBUtil.close(connection,statement,null);
        }
    }

    public   void register() throws SQLException, ClassNotFoundException {

        System.out.println("请输入你的用户名：");
        String username = scanner.nextLine();
        System.out.println("请输入你的密码：");
        String password = scanner.nextLine();

        Connection connection = DBUtil.getConnection();

        //2.获取连接
        Statement statement = connection.createStatement();

        //3.获取语句
        String sql = String.format("insert into users(username,password) values('%s','%s')",username,password);//format是格式化

        //executeUpdate：返回值代表影响的行数。
        //如果返回值是1，代表插入成功
        try{
            statement.executeUpdate(sql);
            System.out.println("注册成功！");
        }catch (SQLException e){
            System.out.println("注册失败！");
        }finally {
            DBUtil.close(connection,statement,null);
        }
    }

    public void publishedArticles() throws SQLException, ClassNotFoundException {

        if(user == null){
            System.out.println("您还没有登录，不能发表文章，请登录后再发表！");
            return ;
        }
        System.out.println("请输入您的文章标题：");
        String title = scanner.nextLine();
        System.out.println("请输入您要发表的文章内容");
        String content = scanner.nextLine();
        Date date = new Date();
        //将date转化为2020-05-29 的格式
        SimpleDateFormat published_at =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        //2.获取连接
        Connection connection = null;
        Statement statement = null;


        try{

            connection = DBUtil.getConnection();

            //3.获取语句
            statement = connection.createStatement();
            String sql = String.format("insert into articles(author_id,title,content,publish_at) values('%d','%s','%s','%s')",user.getId(),title,content,published_at);//format是格式化
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("发表失败！");
        }finally {
            DBUtil.close(connection,statement,null);
        }
    }

    public void contentArticles() throws ClassNotFoundException {
        if(user == null){
            System.out.println("您还没有登录，不能评论文章，请登录后再尝试！");
            return ;
        }
        System.out.println("请输入您要评论的的文章id：");
        int article_id = scanner.nextInt();
        System.out.println("请输入您要评论的内容");
        String content = scanner.nextLine();

        //2.获取连接
        Connection connection = null;
        Statement statement = null;
        Date date = new Date();
        //将date转化为2020-05-29 的格式
        SimpleDateFormat published_at =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            connection = DBUtil.getConnection();
            statement = connection.createStatement();
            String sql = String.format("insert into comments(user_id,article_id,content,published_at)values('%d','%d','%s','%s')",
                    user.getId(),article_id,content,published_at);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void likesArticles() throws SQLException, ClassNotFoundException {
        System.out.println("请输入你要点赞的文章id：");
        int article_id = scanner.nextInt();

        Connection connection = null;
        Statement statement = null;
        connection = DBUtil.getConnection();
        statement = connection.createStatement();
        String sql = String.format("insert into likes(user_id,article_id)values('%d','%d')",
                user.getId(),article_id);

    }

    public void selectArticles() throws SQLException, ClassNotFoundException {

    }

    public void selectLikes() throws SQLException, ClassNotFoundException {

    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("=====1.登录==========");
        System.out.println("=====2.注册==========");
        System.out.println("=====3.发表文章=======");
        System.out.println("=====4.评论文章=======");
        System.out.println("=====5.点赞文章=======");
        System.out.println("=====6.查询你发表过的文章(详情页)=======");
        System.out.println("=====7.查询你点赞过的文章=======");
        System.out.println("=====8.查询所有用户发表过的文章(列表页)=======");
        System.out.println("=====================");
        int n = scanner.nextInt();
        return n;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        BlogDemo blogDemo = new BlogDemo();
        while (true) {
            int n = menu();
            switch (n) {
                case 1:
                    blogDemo.login();
                    break;
                case 2:
                    blogDemo.register();
                    break;
                case 3:
                    blogDemo.publishedArticles();
                    break;
                case 4:
                    blogDemo.contentArticles();
                    break;
                case 5:
                    blogDemo.likesArticles();
                    break;
                case 6:
                    blogDemo.selectArticles();
                    break;
                case 7:
                    blogDemo.selectLikes();
                    break;
                default:
                    break;
            }
        }
    }
}
