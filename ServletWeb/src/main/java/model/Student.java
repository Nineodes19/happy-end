package model;

/**
 * @program:ServletWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-01 22:18
 **/
public class Student {
    private String stu_xh;
    private String stu_name;
    private String stu_sex;
    private int stu_age;
    private String stu_mobile;
    private String str_address;

    public String getStu_xh() {
        return stu_xh;
    }

    public void setStu_xh(String stu_xh) {
        this.stu_xh = stu_xh;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_sex() {
        return stu_sex;
    }

    public void setStu_sex(String stu_sex) {
        this.stu_sex = stu_sex;
    }

    public int getStu_age() {
        return stu_age;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public String getStu_mobile() {
        return stu_mobile;
    }

    public void setStu_mobile(String stu_mobile) {
        this.stu_mobile = stu_mobile;
    }

    public String getStr_address() {
        return str_address;
    }

    public void setStr_address(String str_address) {
        this.str_address = str_address;
    }
}
