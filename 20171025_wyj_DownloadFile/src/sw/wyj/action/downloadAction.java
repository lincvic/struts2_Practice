package sw.wyj.action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 王一疆 on 2017/10/29
 */
public class downloadAction extends ActionSupport{
    public InputStream getInputStream() throws IOException{
        File file = new File("/Users/wong/Test图片.png");
        InputStream in= new FileInputStream(file);
        System.out.println(in);
        return in;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
