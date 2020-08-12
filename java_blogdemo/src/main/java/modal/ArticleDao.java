package modal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program:java_blogdemo
 * @author:Nine_odes
 * @description:
 * @create:2020-08-12 16:10
 **/
public class ArticleDao {
    public void add(Article article){
        //获取数据库链接
        Connection connection = DButil.getConnection();
        //拼装sql语句
        String sql = "insert into article values(null,?,?,?)";
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setString(1,article.getTitle());
            statement.setString(2,article.getContent());
            statement.setInt(3,article.getUserId());
            //执行sql
            //ret表示这次操作影响的行数，插入成功，返回一行
            //增删改使用executeUpdate，查找调用executeQuery
            int ret = statement.executeUpdate();
            if(ret != 1){
                throw new SQLException("插入文章失败！！");
            }
            System.out.println("插入文章成功！");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DButil.close(connection,statement,null);
        }
    }

    public Article selectById(int id ){
        Connection connection = DButil.getConnection();
        String sql = "select from article where id = ?";

        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                Article article = new Article();
                article.setId(resultSet.getInt("id"));
                article.setTitle(resultSet.getString("title"));

                article.setContent(resultSet.getString("content"));

                article.setUserId(resultSet.getInt("userId"));
                return article;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DButil.close(connection,statement,null);
        }
        return null;
    }

    public List<Article> selectAll(){

        return null;
    }

    public void delete(int id){

    }

    public static void main(String[] args) {
        ArticleDao articleDao = new ArticleDao();
        Article article = new Article();
        article.setTitle("我是标题！");
        article.setContent("我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文" +
                "我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文" +
                "我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文" +
                "我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文");
        article.setUserId(1);
        articleDao.add(article);
    }
}
