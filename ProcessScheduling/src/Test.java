import java.util.Scanner;

/**
 * @author aolish333@gmail.com
 * @date 2017/11/4 17:11
 * User:Lee
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Algorithm algorithm = new Algorithm();
        algorithm.inputData();

        while (true) {
            System.out.println("1514010634 -- 李晓津 \n选择调度算法: \n 1、FCFS 2、SJF");
            int flag = in.nextInt();
            if (flag == 1) {
                algorithm.FCFS();
            }
            if (flag == 2) {
                algorithm.SJF();
            }
            break;
        }
    }
}
