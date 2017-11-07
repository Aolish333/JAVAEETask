import com.opensymphony.xwork2.ActionSupport;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author aolish333@gmail.com
 * @date 2017/11/6 10:39
 * User:Lee
 */
public class DownloadAction extends ActionSupport {


    public String getInputPath() {
        return inputPath;
    }

//    public void setInputPath(String inputPath) throws UnsupportedEncodingException {
//        this.inputPath = new String(inputPath.getBytes("ISO-8859-1"),"UTF-8");
//    }
public void setInputPath(String inputPath)  {
    this.inputPath = inputPath;
}


    public String getDownloadFileName() {
        return downloadFileName;
    }

//    public void setDownloadFileName(String downloadFileName) throws UnsupportedEncodingException {
//        this.downloadFileName = new String(downloadFileName.getBytes("ISO-8859-1"),"UTF-8");
//    }

    public void setDownloadFileName(String downloadFileName)  {
        this.downloadFileName =  downloadFileName;
    }
    @Override
    public String toString() {
        return "DownloadAction{" +
                "inputPath='" + inputPath + '\'' +
                ", downloadFileName='" + downloadFileName + '\'' +
                '}';
    }

    private String inputPath;
    private String downloadFileName;

    public InputStream getTargetFile() throws Exception {

//     return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
   return new FileInputStream(inputPath);
    }

    @Override
    public String execute() throws Exception {
        System.out.println(inputPath);
        System.out.printf(toString());
        return "success";
    }
}
