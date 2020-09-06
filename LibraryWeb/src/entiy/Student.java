package entiy;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 12:41
 **/
public class Student {
    private int stu_xh;//学号
    private String stu_name;//学生姓名
    private String stu_pwd;//密码
    private String stu_sex;//性别
    private int stu_age;//年龄
    private String stu_mobile;//联系方式
    private String stu_address;//地址

    public int getStu_xh() {
        return stu_xh;
    }

    public void setStu_xh(int stu_xh) {
        this.stu_xh = stu_xh;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_pwd() {
        return stu_pwd;
    }

    public void setStu_pwd(String stu_pwd) {
        this.stu_pwd = stu_pwd;
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

    public String getStu_address() {
        return stu_address;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_xh=" + stu_xh +
                ", stu_name='" + stu_name + '\'' +
                ", stu_pwd='" + stu_pwd + '\'' +
                ", stu_sex='" + stu_sex + '\'' +
                ", stu_age=" + stu_age +
                ", stu_mobile='" + stu_mobile + '\'' +
                ", stu_address='" + stu_address + '\'' +
                '}';
    }
}
