package sw.wyj.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;
import java.net.URLEncoder;

/**
 * Created by 王一疆 on 2017/11/6
 */
public class download extends ActionSupport {
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

        try {
            downFileName = URLEncoder.encode(downFileName,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return downFileName;
    }

    public void setDownFileName(String downFileName) {
//        try {
//            this.downFileName = URLEncoder.encode(downFileName, "utf-8");
//      } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }

        try {
            this.downFileName = new String (downFileName.getBytes("iso-8859-1")
            ,"gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public InputStream getDownFile() throws IOException {
        File file = new File(inputPath);
        InputStream in = new FileInputStream(file);
        return in;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
