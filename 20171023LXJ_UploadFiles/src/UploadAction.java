import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/24 17:28
 * User:Lee
 */
public class UploadAction extends ActionSupport {


    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getUploadFilename() {
        return uploadFilename;
    }

    public void setUploadFilename(String uploadFilename) {
        this.uploadFilename = uploadFilename;
    }


    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }



    public String getUploadContextType() {
        return uploadContextType;
    }

    public void setUploadContextType(String uploadContextType) {
        this.uploadContextType = uploadContextType;
    }
    private String savePath;
    private File myFile;
    private String title;
    private String uploadContextType;
    private String uploadFilename;

    @Override
    public String execute() throws Exception {

        FileOutputStream fos = new FileOutputStream(getSavePath()+"\\"+title);
        FileInputStream fis = new FileInputStream(myFile);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ( (len = fis.read(bytes)) > 0){
            fos.write(bytes,0,len);
        }
        setUploadFilename(title);
        fos.close();//开始上传字节为0，没有关流，关流后上传成功，强烈建议加上 try catch
        fis.close();
        return "saveOk";
    }
}
