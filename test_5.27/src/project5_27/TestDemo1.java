package project5_27;

/**
 * @program:test_5.27
 * @author:Nine_odes
 * @description:
 * @create:2020-05-27 18:54
 **/

/**
 * 数据库事务：
 *  1.事务产生的背景
 *  2.基本特性：
 *      a) 原子性（核心特性）
 *      b) 一致性 保证数据的合法性
 *      c) 持久性 事务对数据的改动是持久生效（改动会写入磁盘中，不会因为“重启"这类操作导致改动被还原
 *      d) 隔离性 并发性执行事务密切相关，为了让性能更高，可能就需要引入并发执行事务，并发执行又可能会导致数据不安全
 *
 *  脏读：读取到了未提交的数据，写操作加锁
 *  不可重复度：同一个事务中，两次读操作结果不同，读操作加锁
 *  幻读：同一个事务中执行查询操作发现结果集不一样，串行化
 *
 *  整体的趋势，隔离性越高，并发性就越低。效率就越低，数据可靠性越高
 *
 */

/**
 * 提供的隔离级别：
 *  1.read uncommitted：允许读取未提交的数据（存在脏读）
 *  2.read committed：只允许读取提交的数据，相当于加锁不存在脏读，但是会不可重复度
 *  3.repeatable read Mysql的默认隔离级别，读写都加锁，不存在脏读和不可重复度问题，但是会存在幻读问题
 *  4.serializable： 串行化执行事务
 */

/**
 * IO流：
 *  I：Input输入
 *  O：Output输出
 *
 *  让程序和用户之间建立联系
 *  输入设备种类有很多，输出设备种类也很多
 *  操作系统针对这些输入输出设备进行了统一的封装
 *
 *  流：java标准库中提供的一组类和API
 *  始终流来操作文件时：
 *      例如：读取1000个字节的数据，可以一次读1个字节，分1000次读完
 *      也可以一次读2个字节，分500次读完
 *      也可以一次读10个字节，100次读完
 *      也可以一次读1000个字节，1次读完
 *      写也一样
 *      不同的读写方式下，最终达到的效果是等价的
 *
 *      流对象主要提供两个核心操作：
 *      1.读数据
 *      2.写数据
 *
 *      实现读写文件以及各种输入输出设备
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件对象File类
 * 文件是操作系统内部管理的一种重要的软件资源
 * 操作系统谈到管理：
 *      描述（用一个类来表示一个文件的基本属性）
 *      +组织（通过一定的数据结构来把这若干文件对象整合到一起）
 *      通过数组来组织
 *      file_struct 这样的结构体来描述一个文件的属性
 *
 *      JVM中也是需要进行管理文件的。
 *      描述文件就是使用File这个类，
 *      组织就取决于用户使用什么样的数据结构来组织若干个File对象
 *
 *  在java中针对文件进行操作，核心还是要依赖这个File类（操作：新建文件，删除文件，重命名...）
 *
 *  而读写文件操作需要使用File搭配流对象才能完成
 */

/**
 * 操作系统中除了文件，还有目录
 * 目录可以视为是一种特殊的文件（文件的类型是目录文件）
 *
 * Linux系统一共支持7种文件类型
 *  1.普通文件（.txt,.class, .java）
 *  2.目录文件
 *  3.链接文件
 *  4.管道文件（内核中支持的一种进程间的通信方式）
 *  5.socket文件（对网卡的抽象）
 *  6.字符设备文件
 *  7.块设备文件
 */
public class TestDemo1 {
    /**
     * Windows上同时支持使用/和\来表示文件路径
     * 但是在代码中如果使用\就需要进行转义
     *
     * 以c:  d: e: 盘符开头的路径，叫做绝对路径
     *
     * 以.或者..开头的路径叫做“相对路径”
     *      .表示从当前目录往下找
     *      ..表示从当前目录的上级目录往下找
     *
     * 相对路径必须要先指定“当前目录”,才能进行相对路径的表示
     * 如果认为当前目录为：d:/program2/qq
     * 相对路径结果就为：  ./Bin/QQ.exe
     *
     * 当前目录可以人为修改
     *
     * @param args
     */
    public static void main(String[] args) {
        //d:/test.txt  这就是一个文件的路径
        //在Windows上可以写成d:\test.txt
        //File  file = new File("d:/test.txt");
        //在java中“\”是转转义字符
        //File  file2 = new File("d:\\test.txt");

//        File  file = new File("E:\\GIT\\happy-end\\test_5.27\\testIo/test.txt");
//        File  file1 = new File("./testIo/test.txt");
//
//        //判定文件或者路经是否存在
//        File file2 = new File("testIo/test.txt");
//        System.out.println(file2.exists());
//        //判断文件是不是目录文件
//        System.out.println(file2.isDirectory());
//
//        File file3 = new File(":\\GIT\\happy-end\\test_5.27\\testIo\\test.txt");
//        System.out.println(file3.isFile());
        File file = new File("E:\\\\GIT\\\\happy-end\\\\test_5.27\\\\testIo/test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.isDirectory());

        File file1 = new File("c://");
        System.out.println(file1.isDirectory());
        File  file2 = new File("d:/java30");
        //mk -->nake   dir -->directory
        file2.mkdir();

    }
}
