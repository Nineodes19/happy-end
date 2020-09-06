package entiy;

/**
 * @program:LibraryWeb
 * @author:Nine_odes
 * @description:
 * @create:2020-09-02 12:43
 **/
public class User {
    private int u_id;
    private String u_LoginName;
    private String u_realName;
    private String u_pwd;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_LoginName() {
        return u_LoginName;
    }

    public void setU_LoginName(String u_LoginName) {
        this.u_LoginName = u_LoginName;
    }

    public String getU_realName() {
        return u_realName;
    }

    public void setU_realName(String u_realName) {
        this.u_realName = u_realName;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_LoginName='" + u_LoginName + '\'' +
                ", u_realName='" + u_realName + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                '}';
    }
}
