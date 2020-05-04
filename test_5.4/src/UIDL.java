/**
 * @program:test_5.4
 * @author:Nine_odes
 * @description:
 * @create:2020-05-04 23:44
 **/
/**
 * 菜单演示
 * 实现的功能列表：
 * 1. 分类思想，菜单，子菜单
 */

import javax.swing.*;

public class UIDL extends JFrame {
    private JMenuItem items1[], items2[],items3[];

    public UIDL() {
        initMenuBar();//初始化菜单栏

        setSize(600, 600);
        setVisible(true);
    }

    private void initMenuBar() {
        //菜单栏
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);

        JMenu fileMenu = new JMenu("File");
        JMenuItem newfile = new JMenuItem("New");
        fileMenu.add(newfile);
        JMenuItem openfile = new JMenuItem("Open");
        fileMenu.add(openfile);
        JMenuItem save = new JMenuItem("Save");
        fileMenu.add(save);
        JMenuItem saveAs = new JMenuItem("Save as");
        fileMenu.add(saveAs);
        JMenuItem close = new JMenuItem("Close File");
        fileMenu.add(close);
        JMenuItem exit = new JMenuItem("Exit");
        fileMenu.add(exit);
        bar.add(fileMenu);

        JMenu editJMenu = new JMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        editJMenu.add(cut);
        JMenuItem copy = new JMenuItem("Copy");
        editJMenu.add(copy);
        JMenuItem paste = new JMenuItem("Paste");
        editJMenu.add(paste);
        bar.add(editJMenu);

        JMenu toolsJMenu = new JMenu("Tools");

        String item1String[] = {"AUI-A","AUI-B","AUI-C","AUI-D"};
        items1 = new JMenuItem[item1String.length];
        for (int count = 0; count < item1String.length; count++) {
            items1[count]= new JMenuItem(item1String[count]);
            toolsJMenu.add(items1[count]);
        }

        String item2String[] = {"CUI-A","CUI-B","CUI-C","CUI-D"};
        items2 = new JMenuItem[item2String.length];
        for (int count = 0; count < item2String.length; count++) {
            items2[count]= new JMenuItem(item2String[count]);
            toolsJMenu.add(items2[count]);
        }

        String item3String[] = {"FUI-A","FUI-B","FUI-C","FUI-D"};
        items3 = new JMenuItem[item3String.length];
        for (int count = 0; count < item3String.length; count++) {
            items3[count]= new JMenuItem(item3String[count]);
            toolsJMenu.add(items3[count]);
        }
        bar.add(toolsJMenu);

        JMenu projectsJMenu = new JMenu("Porjects");
        JMenuItem newModle = new JMenuItem("New Modle");
        projectsJMenu.add(newModle);
        JMenuItem ExitingModel = new JMenuItem("Import Existing Model");
        projectsJMenu.add(ExitingModel);
        JMenuItem newProject = new JMenuItem("New Project");
        projectsJMenu.add(newProject);
        JMenuItem openProject = new JMenuItem("Open Project");
        projectsJMenu.add(openProject);
        bar.add(projectsJMenu);

        JMenu patternManagmentJMenu = new JMenu("Pattern Managment");
        bar.add(patternManagmentJMenu);

        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About...");
        help.add(about);
        bar.add(help);
    }

    public static void main(String[] args) {
        UIDL uidl= new UIDL();
    }
}

