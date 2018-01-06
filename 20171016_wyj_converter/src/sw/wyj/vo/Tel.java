package sw.wyj.vo;

/**
 * Created by 王一疆 on 2017/10/16
 */

public class Tel {
    private String sectionNo;
    private String telNo;

    public Tel(String sectionNo, String telNo) {
        this.sectionNo = sectionNo;
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "{" +
                "区号='" + sectionNo + '\'' +
                ", 电话号码='" + telNo + '\'' +
                '}';
    }


    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
