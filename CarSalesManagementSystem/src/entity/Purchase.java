package entity;


import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 13:20 2017/6/22.
 * @Descrip
 */
public class Purchase {

    // 订单编号
    private int pid;
    // 客户编号
    private int clienid;
    // 销售编号
    private int sid;
    // 购买日期
    private Timestamp purchasedate;

    public Purchase() {
    }

    /**
     * Getter for property 'pid'.
     *
     * @return Value for property 'pid'.
     */
    public int getPid() {
        return pid;
    }

    /**
     * Setter for property 'pid'.
     *
     * @param pid Value to set for property 'pid'.
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * Getter for property 'clienid'.
     *
     * @return Value for property 'clienid'.
     */
    public int getClienid() {
        return clienid;
    }

    /**
     * Setter for property 'clienid'.
     *
     * @param clienid Value to set for property 'clienid'.
     */
    public void setClienid(int clienid) {
        this.clienid = clienid;
    }

    /**
     * Getter for property 'sid'.
     *
     * @return Value for property 'sid'.
     */
    public int getSid() {
        return sid;
    }

    /**
     * Setter for property 'sid'.
     *
     * @param sid Value to set for property 'sid'.
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * Getter for property 'purchasedate'.
     *
     * @return Value for property 'purchasedate'.
     */
    public Timestamp getPurchasedate() {
        return purchasedate;
    }

    /**
     * Setter for property 'purchasedate'.
     *
     * @param purchasedate Value to set for property 'purchasedate'.
     */
    public void setPurchasedate(Timestamp purchasedate) {
        this.purchasedate = purchasedate;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "pid=" + pid +
                ", clienid=" + clienid +
                ", sid=" + sid +
                ", purchasedate=" + purchasedate.toString() +
                '}';
    }
}
