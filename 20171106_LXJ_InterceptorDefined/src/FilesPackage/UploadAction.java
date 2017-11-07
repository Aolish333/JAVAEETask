package FilesPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/24 17:28
 * User:Lee
 */
public class UploadAction extends ActionSupport {


    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getUploadContextType() {
        return uploadContextType;
    }

    public void setUploadContextType(String[] uploadContextType) {
        this.uploadContextType = uploadContextType;
    }


    private String savePath;

    public File[] getUpload() {
        return upload;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }

    private File[] upload;
    private String title;
    private String[] uploadContextType;

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    private String[] uploadFileName;

    @Override
    public String execute() throws Exception {
        File[] files = getUpload();
        String newName = null;
        for (int i = 0; i < files.length; i++) {
            newName = UUID.randomUUID() + uploadFileName[i].substring(uploadFileName[i].lastIndexOf("."));
            FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + newName);
            FileInputStream fis = new FileInputStream(files[i]);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) > 0) {
                fos.write(bytes, 0, len);
            }
//            setUploadFilename(newName);
            fos.close();//开始上传字节为0，没有关流，关流后上传成功，强烈建议加上 try catch
            fis.close();
        }
        ActionContext.getContext().getSession().put("newName", newName);
        return "saveOk";
    }
}
