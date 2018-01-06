package sw.wyj.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.io.*;


/**
 * Created by 王一疆 on 2017/10/23
 */
public class uploadAction extends ActionSupport {
    private String title;
    private File[] upload;
    private String[] uploadContentType;
    private String[] uploadFileName;
    private String savePath;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File[] getUpload() {
        return upload;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }

    public String[] getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String[] uploadContentType) {

        this.uploadContentType = uploadContentType;
    }

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {

        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    //文件上传
    public String upload(){
        for (int i = 0;i<getUpload().length;i++) {
            System.out.println(upload[i]);
            System.out.println(uploadContentType[i]);
            System.out.println(uploadFileName[i]);
            System.out.println(savePath);
            //字节流
            try {
                FileInputStream fis = new FileInputStream(upload[i]);

                FileOutputStream fos = new FileOutputStream(savePath
                        + "/" + uploadFileName[i]);
                byte[] buffer = new byte[1024];
                int len = 0;
                while ((len = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ActionContext.getContext().getSession().put("uploadContentType"+i
                    ,uploadContentType[i]);
            ActionContext.getContext().getSession().put("uploadFilename"+i
                    ,uploadFileName[i]);

        }
        return "uploadConfirm";
    }
}
