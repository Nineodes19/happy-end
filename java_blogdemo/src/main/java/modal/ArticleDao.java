package modal;

import com.mysql.jdbc.ConnectionPropertiesTransform;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        //1.获取连接
        Connection connection = DButil.getConnection();
        //拼装sql
        String sql = "select * from article where id = ?";

        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            //3.执行sql
            resultSet = statement.executeQuery();
            //4.遍历结果集
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
            //5.关闭链接
            DButil.close(connection,statement,null);
        }
        return null;
    }

    public Article selectByUserId(int userid ){
        //1.获取连接
        Connection connection = DButil.getConnection();
        //拼装sql
        String sql = "select * from article where userid = ?";

        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setInt(1,userid);
            //3.执行sql
            resultSet = statement.executeQuery();
            //4.遍历结果集
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
            //5.关闭链接
            DButil.close(connection,statement,null);
        }
        return null;
    }


    public List<Article> selectAll(){
        List<Article> articles = new ArrayList<Article>();
        //1.获取到数据库链接
        Connection connection = DButil.getConnection();
        //2.拼装sql语句
        String sql = "select * from article";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            statement = connection.prepareStatement(sql);
            //3.执行sql
            resultSet = statement.executeQuery();
            //4.遍历结果集，此时查找所有结果，结果可能有多条
            while(resultSet.next()){
                Article article = new Article();
                article.setId(resultSet.getInt("id"));
                article.setTitle(resultSet.getString("title"));
                article.setContent(resultSet.getString("content"));
                article.setUserId(resultSet.getInt("userId"));
                articles.add(article);
            }
            return articles;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DButil.close(connection,statement,resultSet);
        }
        return null;
    }

    public void delete(int id){
        //1.获取连接
        Connection connection = DButil.getConnection();
        //2.拼装sql
        String sql = "delete from article where id = ?";
        PreparedStatement  statement = null;
        try{
            statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            //3.执行sql
            int ret = statement.executeUpdate();
            if(ret != 1){
                throw new SQLException("删除文章失败，id : " + id);
            }
            System.out.println("删除文章成功！！ id：" + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            //4.关闭链接
            DButil.close(connection,statement,null);
        }
    }

    public static void main(String[] args) {
//        ArticleDao articleDao = new ArticleDao();
//        Article article = new Article();
//        article.setTitle("我是标题！");
//        article.setContent("我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文" +
//                "我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文" +
//                "我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文" +
//                "我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文我是正文");
//        article.setUserId(1);
//        articleDao.add(article);

        UserDao userDao = new UserDao();
        //测试add方法
        User user = new User();
//        user.setName("糖糖");
//        user.setPassword("2222");
//        userDao.add(user);

//        user.setName("Nine");
//        user.setPassword("abcd");
//        userDao.add(user);

        //2.测试selectByName
//        User  user1 = userDao.selectByName("糖糖");
//        System.out.println(user1);


        //3.验证新增文章
        ArticleDao articleDao = new ArticleDao();
//        Article article = new Article();
//        article.setTitle("第241章 哪个alpha想勾搭我们队长");
//        article.setContent("　　“不是……我们都是前辈吧？？怎么能被这群小家伙这么欺负！”\n" +
//                "　　额……\n" +
//                "　　在外面静静看着的凌赦忍不住拧紧了眉，丢人啊！\n" +
//                "　　还是各大战区精心挑选出来的陪练，结果，就这？\n" +
//                "　　冷眼凝视着已经被冲的七零八落的训练赛成员们，凌赦抬手扶额，直接宣布训练赛结束。\n" +
//                "　　再看到重新出现在他面前的叶宁小组，凌赦神情冷漠，那眼神直看的人心里都冷冰冰的。\n" +
//                "　　摧枯拉朽！\n" +
//                "　　要让他来评价这场训练赛，他能说的只有这四个字。\n" +
//                "　　对这几个他没什么好挑剔的，这会儿看着几人站在他面前，他轻咳几声，淡漠的道：“最后一次训练赛结束，到明天早上的时间你们可以自由支配。”\n" +
//                "　　！自由支配！\n" +
//                "　　原本觉得无所事事的叶宁突然睁圆了眼睛，想将阁下从血棺里叫起来嗷～\n" +
//                "　　等凌赦离开，叶宁笑眯眯的朝着伙伴们挥挥手：“我有点事儿要做就先走了啊。”\n" +
//                "　　“嗯？”克里瞪他，“刚回来多久？又想跑？”\n" +
//                "　　水陵域：“就是啊，这次说不清楚去干嘛，我们可不会让你就这么溜了。”\n" +
//                "　　叶宁歪头，被队友们死亡凝视的他有些迷惑，都这么头铁么？\n" +
//                "　　“唔……忙着谈恋爱啊，我可是有家室的人了！怎么能整天的和你们鬼混！”\n" +
//                "　　“？鬼混？”克里微怔，下一刻就笑眯眯的扭起了手腕，“什么时候和队友交流感情都是鬼混了？”\n" +
//                "　　眼看着克里已经是要动手的姿态了，叶宁连忙闪身避开，朝着他小小的吐舌头：“我男朋友会吃醋的嗷！”\n" +
//                "　　“咳，克里你这关注点有些偏啊，这会儿不是该逼问叶宁男朋友是谁么？我们这么彪悍的队长啊，得多强的alpha才能让他这副样子啊？”\n" +
//                "　　克里一顿，叶宁男朋友！他这才后知后觉的想起来，这小混蛋的男朋友，是他们家老师！艾尔将军！\n" +
//                "　　嫉妒啊！\n" +
//                "　　都是可爱的omega嘛，叶宁这进展多快啊，再看看他！都快被他们教官整出心理阴影了！\n" +
//                "　　克里委屈，可怜巴巴的瞅着叶宁，撅嘴：“宁宁～我好羡慕啊……”\n" +
//                "　　“啊？”叶宁茫然，有些摸不着头脑，“羡慕什么？”\n" +
//                "　　紧跟着，他就见克里揉了揉自己赤红色的发丝，低着头不说话，叶宁歪了歪头，下意识就看向水陵域：“？”\n" +
//                "　　这啥情况？克里从来都是自信又骄傲的啊，怎么现在这么一副要自闭的模样？\n" +
//                "　　水陵域清了清嗓子，思考了几秒才缓缓道来。\n" +
//                "　　越是听他说，叶宁面上便越诡异，凌赦那个人……嗯，是魔鬼吧？\n" +
//                "　　他忍不住瞅了眼克里的脑袋，艳丽至极的火红色映着他莹白的肤色，给这原本可爱精致的少年平添几分风流韵味，克里如今的模样，显然是比以前更妖孽几分啊。\n" +
//                "　　叶宁思考了几秒，忍不住走过去揉了揉克里软乎乎的发丝，幸福的眯着眼睛问：“他怎么拒绝你的啊？我有些理解不了啊。”\n" +
//                "　　他就没见过比克里更能引起别人保护欲的omega！也没想过克里追人会失败，凌赦这人……想不通啊。\n" +
//                "　　就在他问出这句话的下一刻，被他抱在怀里的克里身子微僵，声音听着都有几分咬牙切齿，叶宁拍着他的背仔细的倾听着克里的倾诉。\n" +
//                "　　“我本来啊，都以为自己把教官拿下了啊，然后约会之前就把头发染回原本的颜色了，想让他见见我最真实的模样嘛！”\n" +
//                "　　额……\n" +
//                "　　叶宁悬在克里背上的手突然一顿，这个原因？？\n" +
//                "　　“结果！他嫌弃我呜呜呜……”\n" +
//                "　　“他说我这个样子不符合他的审美，他接受不了，然后就……直接闪人了。”\n" +
//                "　　叶宁抬起克里的下巴，仔细的盯了好几秒，迷惑的歪头：“哇！凌赦教官的审美，是不是有问题啊？”\n" +
//                "　　克里这长相都不符合他审美？那他以前看上的那omega，得有多妖孽啊？\n" +
//                "　　“自闭嗷！”\n" +
//                "　　这太委屈了啊，克里撅着嘴巴，又觉得有些意难平，他这长相无敌了好吧？就这居然还被嫌弃……\n" +
//                "　　又想起当时凌赦那副性冷淡的模样，克里更觉得憋屈了。\n" +
//                "　　他又瞅着叶宁，这滚蛋一副春风得意的模样，显然是和他们亲爱的老师正处于蜜里调油的阶段，妈惹，更难过了。\n" +
//                "　　“宁宁～别想着你男朋友了好不好？你康康我！我多可怜。”\n" +
//                "　　“唔……”叶宁迟疑了会儿才点了头，立刻就看到克里眼睛一亮，还没等他再说话，克里已经黏过来在他脖颈边蹭个不停。\n" +
//                "　　“宁宁你太好了！爱你～”\n" +
//                "　　叶宁歪头：“我的意思是，你这样是挺可怜的，这就好了？”\n" +
//                "　　“噗——”\n" +
//                "　　旁边响起闷笑，克里似乎也意识到不对，迅速从他肩膀上抬起头，叶宁弯着眼睛看他。\n" +
//                "　　“还想着你男朋友？”\n" +
//                "　　叶宁点头：“是啊，想的快疯辽！”\n" +
//                "　　克里瞪他：“就不管我了？”\n" +
//                "　　“不是，我怎么管啊？偷偷的把教官套麻袋揍一顿给你出气么？”叶宁有些苦恼，又见克里那跃跃欲试的样子，他语调微顿，又道，“可是我也打不过他啊，教官实力多强你自己见过的，我敢去那就是要被完虐啊。”\n" +
//                "　　说着他便给水陵域他们递了个眼神，试图让这些人给克里讲道理，但是这一眼过去，他又傻了。\n" +
//                "　　“？不是……你们一个个的瞪我做什么？这会儿是克里不讲道理了啊，瞅我干啥？”\n" +
//                "　　“我们讲道理啊，”水陵域整理了下思路，第一次在被叶宁凶巴巴盯着的时候挺直了腰板对峙，“作为队长，初赛前夕你居然要抛弃可怜的队友们去谈恋爱？”\n" +
//                "　　“谈恋爱也就算了，你是个omega嘛，我们都理解，但是！”说着说着水陵域就有些激动，一向绅士的他都忍不住放大了声音，“队长你谈恋爱居然不通知我们？我们这一堆S评分以上的alpha如此的没有排面么？”\n" +
//                "　　杠精林饮跟着吐槽：“就是，哪个alpha想勾搭我们队长？得过了我们这关才是。”\n" +
//                "　　“额……”这下不仅是叶宁无语，连克里都觉得没眼看了。\n" +
//                "　　过他们这关？？问题是，你们连自家队长都打不过，还想对上人家男朋友？？磕药磕多了？谁给的勇气啊！\n" +
//                "　　\n" +
//                "　　\n" +
//                "　　“咳，克里你是不是关注点偏了？这会儿不是该逼问叶宁男朋友是谁么？我们这么彪悍的队长啊，得多强的alpha才能让他这样啊？”\n" +
//                "　　");
//        article.setUserId(2);
//        articleDao.add(article);

//        Article article = articleDao.selectById(5);
//        Article article = articleDao.selectByUserId(1);
//        System.out.println(article);

        //3.验证查找所有文章
//        List<Article> articles = articleDao.selectAll();
//        System.out.println(articles);

        //4.删除指定文章
//        articleDao.delete(3);
    }
}
