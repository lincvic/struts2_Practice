package entity;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 14:39 2017/6/20.
 * @Descrip 轿车销售
 */
public class Sale {

    // 销售序号
    private int sid;
    // 员工编号
    private int eid;
    // 轿车编号
    private int carid;
    // 单笔盈利额
    private int profit;

    public Sale() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "sid=" + sid +
                ", eid=" + eid +
                ", carid=" + carid +
                ", profit=" + profit +
                '}';
    }
}
