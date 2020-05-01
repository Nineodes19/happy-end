/**
 * @program:test_5.1
 * @author:Nine_odes
 * @description:
 * 菜单演示
 * 实现的功能列表:
 *1.分类思想，菜单，子菜单
 * @create:2020-05-01 23:07
 **/

import com.sun.jnlp.JNLPClassLoaderIf;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIB;

import javax.management.JMException;
import javax.swing.*;
public class UIDL extends JFrame{
    public UIDL(){
        initMenuBar();

        setSize(600,600);
        setVisible(true);
    }
    private void initMenuBar(){
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);

        JMenu fileMenu = new JMenu("File");
        bar.add(fileMenu);

        JMenuItem newfile = new JMenuItem("New");
        fileMenu.add(newfile);
    }

    public static void main(String[] args) {
        UIDL uidl = new UIDL();
    }
}
