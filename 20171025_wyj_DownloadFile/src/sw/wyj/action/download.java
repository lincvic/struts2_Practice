package sw.wyj.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

/**
 * Created by 王一疆 on 2017/10/30
 */
public class download extends ActionSupport{
    private String inputPath;
    private String contentType;
    private String downFileName;

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {

            this.inputPath = inputPath;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDownFileName() {
        return downFileName;
    }

    public void setDownFileName(String downFileName) {
        this.downFileName = downFileName;
    }

    public InputStream getDownFile() throws IOException{
        File file = new File(inputPath);
        InputStream in = new FileInputStream(file);
        return in;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
