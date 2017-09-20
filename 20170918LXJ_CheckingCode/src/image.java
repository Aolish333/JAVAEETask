import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ThreadLocalRandom;

public class image implements Action {
    @Override
    public String execute() throws Exception {
        String picString = GeneratingString(n);
        BufferedImage bufferedImage = Paint(picString);
//        System.out.println(bufferedImage);
//        request.getSession().setAttribute("picCode", picString.toString());
        System.out.println(picString);
         ActionContext.getContext().getSession().put("picString",picString);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "jpeg", outputStream);
        ByteArrayInputStream input = new ByteArrayInputStream(outputStream
                .toByteArray());
        this.setInputStream(input);

        input.close();
        outputStream.close();

        return SUCCESS;
    }
    public static final int n = 4;//默认为生成4个字符的字符串
    public static final char[] picChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private ByteArrayInputStream inputStream;
    public ByteArrayInputStream getInputStream() {
        return inputStream;
    }
    public void setInputStream(ByteArrayInputStream inputStream) {
        this.inputStream = inputStream;
    }
    /**
     * 生成字符串
     */
    public static String GeneratingString(int n) {
        StringBuffer picString = new StringBuffer();
        for (int i = 0; i < n; i++) {
            char random = picChar[ThreadLocalRandom.current().nextInt(picChar.length)];
            picString = picString.append(random);
        }
        return picString.toString();
    }

    /**
     * 对随机生成的验证码就行绘制图形
     *
     * @return
     */
    public static BufferedImage Paint(String picString) {
        ThreadLocalRandom localRandom = ThreadLocalRandom.current();

        int fontSize = 80; //code的字体大小
        int fontMargin = fontSize / 4; //字符间隔
        int width = (fontSize + fontMargin) * n + fontMargin; //图片长度
        int height = (int) (fontSize * 1.2); //图片高度，根据字体大小自动调整；调整这个系数可以调整字体占图片的比例
        int avgWidth = width / n; //字符平均占位宽度
        int maxDegree = 26; //最大旋转度数

        //背景颜色
        Color bkColor = Color.WHITE;
        //验证码的颜色
        Color[] catchaColor = {Color.MAGENTA, Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.PINK};

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();

        //填充底色为灰白
        g.setColor(bkColor);
        g.fillRect(0, 0, width, height);

        //画边框
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width - 1, height - 1);

        //画干扰字母、数字
        int dSize = fontSize / 3; //调整分母大小以调整干扰字符大小
        Font font = new Font("Fixedsys", Font.PLAIN, dSize);
        g.setFont(font);
        int dNumber = width * height / dSize / dSize;//根据面积计算干扰字母的个数
        for (int i = 0; i < dNumber; i++) {
            char d_code = picChar[localRandom.nextInt(picChar.length)];
            g.setColor(new Color(localRandom.nextInt(255), localRandom.nextInt(255), localRandom.nextInt(255)));
            g.drawString(String.valueOf(d_code), localRandom.nextInt(width), localRandom.nextInt(height));
        }

        //开始画验证码：

        // 创建字体
        font = new Font(Font.MONOSPACED, Font.ITALIC | Font.BOLD, fontSize);
        // 设置字体
        g.setFont(font);

        for (int i = 0; i < n; i++) {
            char c = picString.charAt(i);
            g.setColor(catchaColor[localRandom.nextInt(catchaColor.length)]);//随机选取一种颜色

            //随机旋转一个角度[-maxDegre, maxDegree]
            int degree = localRandom.nextInt(-maxDegree, maxDegree + 1);

            //偏移系数，和旋转角度成反比，以避免字符在图片中越出边框
            double offsetFactor = 1 - (Math.abs(degree) / (maxDegree + 1.0));//加上1，避免出现结果为0

            g.rotate(degree * Math.PI / 180); //旋转一个角度
            int x = (int) (fontMargin + localRandom.nextInt(avgWidth - fontSize) * offsetFactor); //横向偏移的距离
            int y = (int) (fontSize + localRandom.nextInt(height - fontSize) * offsetFactor); //上下偏移的距离

            g.drawString(String.valueOf(c), x, y); //x,y是字符的左下角，偏离原点的距离！！！

            g.rotate(-degree * Math.PI / 180); //画完一个字符之后，旋转回原来的角度
            g.translate(avgWidth, 0);//移动到下一个画画的原点
            System.out.println(c + ": x=" + x + " y=" + y + " degree=" + degree + " offset=" + offsetFactor);

//            X、Y坐标在合适的范围内随机，不旋转：
            g.drawString(String.valueOf(c), width / n * i + localRandom.nextInt(width / n - fontSize), fontSize + localRandom.nextInt(height - fontSize));
        }


        g.dispose();
        return image;
    }
}
