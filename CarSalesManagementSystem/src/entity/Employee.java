package entity;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 14:40 2017/6/20.
 * @Descrip
 */
public class Employee {

    // 员工编号
    private int eid;
    // 员工姓名
    private String name;
    // 员工电话
    private String phonenumber;
    // 员工总售车数
    private int totalnum;
    // 员工总盈利额
    private int totalprofit;


    public Employee() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(int totalnum) {
        this.totalnum = totalnum;
    }

    public int getTotalprofit() {
        return totalprofit;
    }

    public void setTotalprofit(int totalprofit) {
        this.totalprofit = totalprofit;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", totalnum=" + totalnum +
                ", totalprofit=" + totalprofit +
                '}';
    }
}