package sw.ly.action;

import com.opensymphony.xwork2.ActionSupport;

import javax.swing.plaf.synth.SynthDesktopIconUI;

/**
 * Created by 王一疆 on 2017/11/24
 */
public class adminJumpAction extends ActionSupport {

    //WEB-INF 跳转Aciton

    public String adminLoginJump(){
        return SUCCESS;
    }

    public String adminPanelJump(){
        return SUCCESS;
    }

    public String adminAddBookJump(){
        return SUCCESS;
    }


}
